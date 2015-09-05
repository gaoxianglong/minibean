package org.johngao.minibean.test.all;

import org.johngao.minibean.bean.annotations.Assignment;
import org.johngao.minibean.bean.annotations.AutoParameters;
import org.johngao.minibean.bean.annotations.Paramater;

@Assignment
@AutoParameters(false)
public class TestBeanG {
	@Paramater
	private int id;

	@Paramater("name")
	private String name2;

	private String pwd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd2(String pwd) {
		this.pwd = pwd;
	}
}