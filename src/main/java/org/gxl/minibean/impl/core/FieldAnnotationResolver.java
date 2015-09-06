/*
 * Copyright 2015-2101 gaoxianglong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gxl.minibean.impl.core;

import java.lang.reflect.Field;

import org.gxl.minibean.bean.annotations.AutoParameters;
import org.gxl.minibean.bean.annotations.Paramater;
import org.gxl.minibean.core.AnnotationResolver;

/**
 * 字段注解解析器，用于解析标记了@Paramater的字段
 * 
 * @author JohnGao
 */
public class FieldAnnotationResolver extends AnnotationResolver {
	private AutoParameters autoParameters;
	private static SetParameter setParameter;
	static {
		setParameter = new SetParameter();
	}

	public <T, K> void fieldResolver(T goalObject, K sourceObject) {
		/* 检测目标对象是否包含@AutoParameters注解 */
		if (goalObject.getClass().isAnnotationPresent(AutoParameters.class)) {
			/* 获取目标对象的@AutoParameters注解 属性 */
			autoParameters = goalObject.getClass().getAnnotation(
					AutoParameters.class);
		}

		/* 迭代目标对象的所有字段，支持private修饰字段 */
		for (Field goalObjectField : goalObject.getClass().getDeclaredFields()) {
			/* 检测目标对象的指定字段是否包含@Paramater标注 */
			if (goalObjectField.isAnnotationPresent(Paramater.class)) {
				/* 获取目标对象的@Paramater注解属性 */
				Paramater goalObjectParamater = goalObjectField
						.getAnnotation(Paramater.class);
				if (0 != goalObjectParamater.value().length()
						&& null != goalObjectParamater.value()) {
					/* 检测目标对象字段是否匹配源对象字段 */
					checkFields(goalObject, sourceObject, goalObjectField,
							goalObjectParamater.value(),
							goalObjectParamater.ignore());
				} else if (0 != goalObjectParamater.name().length()
						&& null != goalObjectParamater.name()) {
					/* 检测目标对象字段是否匹配源对象字段 */
					checkFields(goalObject, sourceObject, goalObjectField,
							goalObjectParamater.name(),
							goalObjectParamater.ignore());
				} else if (0 != goalObjectParamater.names().length
						&& null != goalObjectParamater.names()) {
					for (String fileName : goalObjectParamater.names()) {
						/* 检测目标对象字段是否匹配源对象字段 */
						if (checkFields(goalObject, sourceObject,
								goalObjectField, fileName,
								goalObjectParamater.ignore()))
							break;
					}
				} else {
					/* 检测目标对象字段是否匹配源对象字段 */
					checkFields(goalObject, sourceObject, goalObjectField,
							goalObjectField.getName(),
							goalObjectParamater.ignore());
				}
			} else if (null != autoParameters && autoParameters.value()) {
				/* 检测目标对象字段是否匹配源对象字段 */
				checkFields(goalObject, sourceObject, goalObjectField,
						goalObjectField.getName(), autoParameters.ignore());
			}
		}
	}

	/**
	 * 检测目标对象字段是否匹配源对象字段
	 * 
	 * @author JohnGao
	 * 
	 * @param goalObject
	 *            目标对象
	 * 
	 * @param sourceObject
	 *            源对象
	 * 
	 * @param goalObjectField
	 *            目标对象字段
	 * 
	 * @param fileName
	 *            目标对象字段名称
	 * 
	 * @param ignore
	 *            目标对象与源对象字段名称匹配时，是否区分大小写
	 * 
	 * @return boolean 如果目标对象字段匹配源对象字段则返回true
	 */
	public <T, K> boolean checkFields(T goalObject, K sourceObject,
			Field goalObjectField, String fileName, boolean ignore) {
		/* 获取源对象指定字段信息 */
		Field sourceObjectField = getSourceObjectField(fileName, ignore,
				sourceObject);

		/* 如果sourceObjectField不为null，则表示目标对象的字段名称匹配源对象字段名称 */
		if (null != sourceObjectField) {
			/* 执行参数自动赋值 */
			setParameter.executeSetParameter(goalObjectField,
					sourceObjectField, goalObject, sourceObject);
			return true;
		}
		return false;
	}

	/**
	 * 获取源对象指定字段信息
	 * 
	 * @author JohnGao
	 * 
	 * @param goalObjectFieldName
	 *            目标对象字段名称
	 * 
	 * @param sourceObject
	 *            源对象
	 * 
	 * @param ignore
	 *            目标对象与源对象字段名称匹配时，是否区分大小写
	 * 
	 * @exception NoSuchFieldException
	 * 
	 * @return Field 返回源对象字段信息
	 */
	public <T> Field getSourceObjectField(String goalObjectFieldName,
			boolean ignore, T sourceObject) {
		/* 检测匹配字段是否开启了不区分字段大小写 */
		if (ignore) {
			Field[] fields = sourceObject.getClass().getDeclaredFields();
			for (int i = 0; i < fields.length; i++)
				if (goalObjectFieldName.equalsIgnoreCase(fields[i].getName()))
					return fields[i];
		} else {
			try {
				/* 从源对象中获取与目标对象同名的字段, 支持private修饰符字段 */
				return sourceObject.getClass().getDeclaredField(
						goalObjectFieldName);
			} catch (NoSuchFieldException e) {
				// ...
			}
		}
		return null;
	}
}