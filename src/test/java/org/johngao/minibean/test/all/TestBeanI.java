package org.johngao.minibean.test.all;

import org.johngao.minibean.bean.annotations.Assignment;
import org.johngao.minibean.bean.annotations.AutoParameters;
import org.johngao.minibean.bean.annotations.Paramater;

@Assignment
public class TestBeanI {
	@Paramater(name = "id")
	private int id;

	@Paramater(name = "name")
	private String name;

	@Paramater(name = "pwd2")
	private String pwd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName2(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd2(String pwd) {
		this.pwd = pwd;
	}
}