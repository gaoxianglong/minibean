package org.johngao.minibean.test.all;

import org.johngao.minibean.bean.annotations.*;

@Assignment
public class TestBeanC {
	@Paramater("id")
	private int id2;

	@Paramater("name")
	private String name2;

	@Paramater("pwd")
	private String pwd2;

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getPwd2() {
		return pwd2;
	}

	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}
}