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
package org.gxl.minibean.bean.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自动赋值标记字段,作用于字段,只有标记了该注解的字段才能实现自动赋值
 * 
 * @author JohnGao
 */
@Documented
@Target(value = { ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Paramater {
	/* 定义Bean中字段备用名称 */
	public String value() default "";

	/* 如果name属性存在，则重写value属性的定义 */
	public String name() default "";

	/* 定义Bean中字段备用名称组 */
	public String[] names() default {};

	/* 定义Bean中字段名是否区分大小写 */
	public boolean ignore() default false;
}