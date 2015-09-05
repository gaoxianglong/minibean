package org.johngao.minibean.bean.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自动赋值所有标记字段,作用于字段,只要标记了该注解Bean中所有字段均可以实现自动赋值
 * 
 * @author JohnGao
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoParameters {
	/* 缺省为true时，则意味着自动赋值生效 */
	public boolean value() default true;

	/* 定义Bean中字段名是否区分大小写 */
	public boolean ignore() default false;
}