/*
 * Copyright 2015-2101 gaoxianglong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gxl.minibean.test.all;

import org.gxl.minibean.bean.annotations.*;

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