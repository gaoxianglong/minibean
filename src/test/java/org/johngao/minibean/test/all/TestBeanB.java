package org.johngao.minibean.test.all;

import org.johngao.minibean.bean.annotations.*;

@Assignment
public class TestBeanB {
	@Paramater
	private int id;

	@Paramater
	private String name;

	@Paramater
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

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}