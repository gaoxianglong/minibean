package org.johngao.minibean.util;

import java.util.Iterator;
import java.util.Set;
import org.johngao.minibean.impl.core.ClassAnnotationResolver;
import org.johngao.minibean.impl.core.FieldAnnotationResolver;

/**
 * 自动赋值操作
 * 
 * @author JohnGao
 */
public abstract class BeanContext {
	/**
	 * 调用自动赋值，支持任意修饰字段
	 * 
	 * @author JohnGao
	 * 
	 * @param goalObject
	 *            目标对象, 即需要被自动赋值的对象
	 * 
	 * @param sourceObject
	 *            源对象
	 * 
	 * @return void
	 */
	public static <T, K> void setParam(T goalObject, K sourceObject) {
		/* 检测目标对象是否标记有@Assignment注解 */
		if (new ClassAnnotationResolver().classResolver(goalObject)) {
			/* 字段注解解析后, 实现自动赋值 */
			new FieldAnnotationResolver().fieldResolver(goalObject,
					sourceObject);
		}
	}

	/**
	 * 调用自动赋值集合，支持任意修饰字段
	 * 
	 * @author JohnGao
	 * 
	 * @param goalObject
	 *            目标对象集合, 即需要被自动赋值的对象集合
	 * 
	 * @param sourceObject
	 *            源对象
	 * 
	 * @return void
	 */
	public static <T, K> void setParams(Set<T> goalObjects, K sourceObjects) {
		for (Iterator<T> iter = goalObjects.iterator(); iter.hasNext();) {
			/* 获取集合对象总的目标对象 */
			T goalObject = iter.next();

			/* 检测目标对象是否标记有@Assignment注解 */
			if (new ClassAnnotationResolver().classResolver(goalObject)) {
				/* 字段注解解析后, 实现自动赋值 */
				new FieldAnnotationResolver().fieldResolver(goalObject,
						sourceObjects);
			}
		}
	}
}