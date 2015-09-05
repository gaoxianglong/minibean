package org.johngao.minibean.test.all;

import org.johngao.minibean.bean.annotations.Assignment;
import org.johngao.minibean.bean.annotations.AutoParameters;
import org.johngao.minibean.bean.annotations.Paramater;

@Assignment
@AutoParameters
public class TestBeanF {
	private int id;

	@Paramater("name")
	private String name2;

	@Paramater(names = { "pwd4", "pwd3", "pwd", "pwd5" })
	private String pwd2;

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

	public String getPwd2() {
		return pwd2;
	}

	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}
}