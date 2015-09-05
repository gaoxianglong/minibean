package org.johngao.minibean.test.all;

import org.johngao.minibean.bean.annotations.*;

@Assignment
@AutoParameters(ignore = true)
public class TestBeanK {
	private int Id;

	@Paramater
	private String name;

	@Paramater(ignore = true)
	private String Pwd;
	
	/* 此处省略set和get方法 */
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		this.Pwd = pwd;
	}
}