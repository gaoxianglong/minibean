package org.johngao.minibean.test.all;

import org.johngao.minibean.bean.annotations.Assignment;
import org.johngao.minibean.bean.annotations.AutoParameters;
import org.johngao.minibean.bean.annotations.Paramater;

public @interface TestBeanJ {
	public int id() default 100;

	public String name() default "JohnGao";

	public String pwd() default "123456";
}