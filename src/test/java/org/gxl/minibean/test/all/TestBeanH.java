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

import org.gxl.minibean.bean.annotations.Assignment;
import org.gxl.minibean.bean.annotations.AutoParameters;
import org.gxl.minibean.bean.annotations.Paramater;

@AutoParameters(false)
public class TestBeanH {
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