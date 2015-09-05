package org.johngao.minibean.test.all;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

import org.johngao.minibean.bean.annotations.Assignment;
import org.johngao.minibean.bean.annotations.AutoParameters;
import org.johngao.minibean.util.BeanContext;
import org.junit.Test;

public class MiniBeanTest {
	@Test
	public void test1() {
		TestBeanA sourceObject = new TestBeanA();
		sourceObject.setId(1);
		sourceObject.setName("JohnGao");
		sourceObject.setPwd("123456");

		TestBeanB goalObject = new TestBeanB();
		BeanContext.setParam(goalObject, sourceObject);
		Assert.assertEquals(goalObject.getId(), sourceObject.getId());
		Assert.assertEquals(goalObject.getName(), sourceObject.getName());
		Assert.assertEquals(goalObject.getPwd(), sourceObject.getPwd());
	}

	@Test
	public void test2() {
		TestBeanA sourceObject = new TestBeanA();
		sourceObject.setId(1);
		sourceObject.setName("JohnGao");
		sourceObject.setPwd("123456");

		TestBeanC goalObject = new TestBeanC();
		BeanContext.setParam(goalObject, sourceObject);
		Assert.assertEquals(goalObject.getId2(), sourceObject.getId());
		Assert.assertEquals(goalObject.getName2(), sourceObject.getName());
		Assert.assertEquals(goalObject.getPwd2(), sourceObject.getPwd());
	}

	@Test
	public void test3() {
		TestBeanA sourceObject = new TestBeanA();
		sourceObject.setId(1);
		sourceObject.setName("JohnGao");
		sourceObject.setPwd("123456");

		TestBeanD goalObject = new TestBeanD();
		BeanContext.setParam(goalObject, sourceObject);
		Assert.assertEquals(goalObject.getId4(), sourceObject.getId());
		Assert.assertEquals(goalObject.getName4(), sourceObject.getName());
		Assert.assertEquals(goalObject.getPwd4(), sourceObject.getPwd());
	}

	@Test
	public void test4() {
		TestBeanA sourceObject = new TestBeanA();
		sourceObject.setId(1);
		sourceObject.setName("JohnGao");
		sourceObject.setPwd("123456");

		TestBeanE goalObject = new TestBeanE();
		BeanContext.setParam(goalObject, sourceObject);
		Assert.assertEquals(goalObject.getId(), sourceObject.getId());
		Assert.assertEquals(goalObject.getName(), sourceObject.getName());
		Assert.assertEquals(goalObject.getPwd(), sourceObject.getPwd());
	}

	@Test
	public void test5() {
		TestBeanA sourceObject = new TestBeanA();
		sourceObject.setId(1);
		sourceObject.setName("JohnGao");
		sourceObject.setPwd("123456");

		TestBeanF goalObject = new TestBeanF();
		BeanContext.setParam(goalObject, sourceObject);
		Assert.assertEquals(goalObject.getId(), sourceObject.getId());
		Assert.assertEquals(goalObject.getName2(), sourceObject.getName());
		Assert.assertEquals(goalObject.getPwd2(), sourceObject.getPwd());
	}

	@Test
	public void test6() {
		TestBeanA sourceObject = new TestBeanA();
		sourceObject.setId(1);
		sourceObject.setName("JohnGao");
		sourceObject.setPwd("123456");

		TestBeanG goalObject = new TestBeanG();
		BeanContext.setParam(goalObject, sourceObject);
		Assert.assertEquals(goalObject.getId(), sourceObject.getId());
		Assert.assertEquals(goalObject.getName2(), sourceObject.getName());
		Assert.assertNull(goalObject.getPwd());
	}

	@Test
	public void test7() {
		TestBeanA sourceObject = new TestBeanA();
		sourceObject.setId(1);
		sourceObject.setName("JohnGao");
		sourceObject.setPwd("123456");

		TestBeanH goalObject = new TestBeanH();
		BeanContext.setParam(goalObject, sourceObject);
		Assert.assertEquals(0, goalObject.getId());
		Assert.assertNull(goalObject.getName2());
		Assert.assertNull(goalObject.getPwd());
	}

	@Test
	public void test8() {
		class TestBeanI {
			byte[] value1;
			byte[] value2;

			public byte[] getValue1() {
				return value1;
			}

			public void setValue1(byte[] value1) {
				this.value1 = value1;
			}

			public byte[] getValue2() {
				return value2;
			}

			public void setValue2(byte[] value2) {
				this.value2 = value2;
			}
		}

		@Assignment
		@AutoParameters
		class TestBeanJ {
			byte[] value1;
			byte[] value2;

			public byte[] getValue1() {
				return value1;
			}

			public void setValue1(byte[] value1) {
				this.value1 = value1;
			}

			public byte[] getValue2() {
				return value2;
			}

			public void setValue2(byte[] value2) {
				this.value2 = value2;
			}
		}
		TestBeanI sourceObject = new TestBeanI();
		sourceObject.setValue1(new byte[1024 * 1024 * 50]);
		sourceObject.setValue2(new byte[1024 * 1024 * 50]);
		TestBeanJ goalObject = new TestBeanJ();
		long startTime = System.currentTimeMillis();
		BeanContext.setParam(goalObject, sourceObject);
		System.out.println("耗时：" + (System.currentTimeMillis() - startTime)
				+ "ms");
	}

	@Test
	public void test9() {
		TestBeanA sourceObject = new TestBeanA();
		sourceObject.setId(1);
		sourceObject.setName("JohnGao");
		sourceObject.setPwd("123456");

		TestBeanI goalObject = new TestBeanI();
		BeanContext.setParam(goalObject, sourceObject);
		Assert.assertEquals(goalObject.getId(), sourceObject.getId());
		Assert.assertEquals(goalObject.getName(), sourceObject.getName());
		Assert.assertNull(goalObject.getPwd());
		System.out.println(goalObject.getId());
	}

	@Test
	public void test10() {
		TestBeanA sourceObject = new TestBeanA();
		sourceObject.setId(1);
		sourceObject.setName("JohnGao");
		sourceObject.setPwd("123456");

		TestBeanK goalObject = new TestBeanK();
		BeanContext.setParam(goalObject, sourceObject);
		Assert.assertEquals(goalObject.getId(), sourceObject.getId());
		Assert.assertEquals(goalObject.getName(), sourceObject.getName());
		Assert.assertEquals(goalObject.getPwd(), sourceObject.getPwd());
	}

@Test
public void test11() {
	TestBeanA sourceObject = new TestBeanA();
	sourceObject.setId(1);
	sourceObject.setName("JohnGao");
	sourceObject.setPwd("123456");

	Set goalObjects = new HashSet();
	TestBeanK testBeanK = new TestBeanK();
	TestBeanL testBeanL = new TestBeanL();
	goalObjects.add(testBeanK);
	goalObjects.add(testBeanL);
	BeanContext.setParams(goalObjects, sourceObject);
	
	Assert.assertEquals(testBeanK.getId(), sourceObject.getId());
	Assert.assertEquals(testBeanK.getName(), sourceObject.getName());
	Assert.assertEquals(testBeanK.getPwd(), sourceObject.getPwd());
	
	Assert.assertEquals(testBeanL.getId(), sourceObject.getId());
	Assert.assertEquals(testBeanL.getName(), sourceObject.getName());
	Assert.assertEquals(testBeanL.getPwd(), sourceObject.getPwd());
}
}