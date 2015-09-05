package org.johngao.minibean.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.johngao.minibean.bean.annotations.Assignment;
import org.johngao.minibean.bean.annotations.Paramater;

/**
 * 注解解析器接口，用于解析标记了@Assignment和@Paramater的类型
 * 
 * @author JohnGao
 */
public interface Resolver {
	/**
	 * 字段注解解析
	 * 
	 * @author JohnGao
	 * 
	 * @param goalObject
	 *            目标对象, 即需要被自动赋值的对象
	 * 
	 * @param sourceObject
	 *            源对象
	 * 
	 * @exception SecurityException
	 * 
	 * @return void
	 */
	public <T, K> void fieldResolver(T goalObject, K sourceObject);

	/**
	 * 类型注解解析
	 * 
	 * @author JohnGao
	 * 
	 * @param goalObject
	 *            目标对象, 即需要被自动赋值的对象
	 * 
	 * @param sourceObject
	 *            源对象
	 * 
	 * @return boolean 解析结果
	 */
	public <T> boolean classResolver(T goalObject);

	/**
	 * 执行参数自动赋值
	 * 
	 * @author JohnGao
	 * 
	 * @param goalObjectField
	 *            反射目标对象字段
	 * 
	 * @param sourceObjectField
	 *            反射源对象字段
	 * 
	 * @param goalObject
	 *            目标对象, 即需要被自动赋值的对象
	 * 
	 * @param sourceObject
	 *            源对象
	 * 
	 * @exception IllegalArgumentException
	 * 
	 * @exception IllegalAccessException
	 * 
	 * @return void
	 */
	public <T, K> void executeSetParameter(Field goalObjectField,
			Field sourceObjectField, T goalObject, K sourceObject);
}