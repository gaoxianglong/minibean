package org.johngao.minibean.bean.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自动赋值标记类,作用于类,只有标记了该注解的类型才能实现后续的自动赋值
 * 
 * @author JohnGao
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Assignment {
}