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
package org.gxl.minibean.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.gxl.minibean.bean.annotations.Assignment;
import org.gxl.minibean.bean.annotations.Paramater;

/**
 * 注解解析器接口，用于解析标记了@Assignment和@Paramater的类型
 * 
 * @author JohnGao
 */
public interface Resolver {
	/**
	 * 字段注解解析
	 * 
	 * @author JohnGao
	 * 
	 * @param goalObject
	 *            目标对象, 即需要被自动赋值的对象
	 * 
	 * @param sourceObject
	 *            源对象
	 * 
	 * @exception SecurityException
	 * 
	 * @return void
	 */
	public <T, K> void fieldResolver(T goalObject, K sourceObject);

	/**
	 * 类型注解解析
	 * 
	 * @author JohnGao
	 * 
	 * @param goalObject
	 *            目标对象, 即需要被自动赋值的对象
	 * 
	 * @param sourceObject
	 *            源对象
	 * 
	 * @return boolean 解析结果
	 */
	public <T> boolean classResolver(T goalObject);

	/**
	 * 执行参数自动赋值
	 * 
	 * @author JohnGao
	 * 
	 * @param goalObjectField
	 *            反射目标对象字段
	 * 
	 * @param sourceObjectField
	 *            反射源对象字段
	 * 
	 * @param goalObject
	 *            目标对象, 即需要被自动赋值的对象
	 * 
	 * @param sourceObject
	 *            源对象
	 * 
	 * @exception IllegalArgumentException
	 * 
	 * @exception IllegalAccessException
	 * 
	 * @return void
	 */
	public <T, K> void executeSetParameter(Field goalObjectField,
			Field sourceObjectField, T goalObject, K sourceObject);
}