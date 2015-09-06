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

import java.lang.reflect.Field;

/**
 * 注解解析器接口实现，用于解析标记了@Assignment和@Paramater的类型
 * 
 * @author JohnGao
 */
public class AnnotationResolver implements Resolver {
	public <T> boolean classResolver(T goalObject) {
		// TODO Auto-generated method stub
		return false;
	}

	public <T, K> void executeSetParameter(Field goalObjectField,
			Field sourceObjectField, T goalObject, K sourceObject) {
		// TODO Auto-generated method stub
	}

	public <T, K> void fieldResolver(T goalObject, K sourceObject) {
		// TODO Auto-generated method stub
	}
}