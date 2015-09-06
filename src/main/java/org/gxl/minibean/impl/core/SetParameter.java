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

import org.gxl.minibean.core.AnnotationResolver;

/**
 * 源对象与目标对象的自动赋值
 * 
 * @author JohnGao
 */
public class SetParameter extends AnnotationResolver {
	public <T, K> void executeSetParameter(Field goalObjectField,
			Field sourceObjectField, T goalObject, K sourceObject) {
		try {
			/* 允许向目标对象的私有字段进行赋值操作 */
			goalObjectField.setAccessible(true);

			/* 允许向源对象的私有字段进行取值操作 */
			sourceObjectField.setAccessible(true);

			/* 将源对象字段值赋值于目标对象字段 */
			goalObjectField
					.set(goalObject, sourceObjectField.get(sourceObject));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}