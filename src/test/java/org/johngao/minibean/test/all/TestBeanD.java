package org.johngao.minibean.test.all;

import org.johngao.minibean.bean.annotations.*;

@Assignment
public class TestBeanD {
	@Paramater(names = { "id3", "id2", "id" })
	private int id4;

	@Paramater(names = { "name3", "name2", "name" })
	private String name4;

	@Paramater(names = { "pwd3", "pwd2", "pwd" })
	private String pwd4;

	public int getId4() {
		return id4;
	}

	public void setId4(int id4) {
		this.id4 = id4;
	}

	public String getName4() {
		return name4;
	}

	public void setName4(String name4) {
		this.name4 = name4;
	}

	public String getPwd4() {
		return pwd4;
	}

	public void setPwd4(String pwd4) {
		this.pwd4 = pwd4;
	}
}