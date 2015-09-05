package org.johngao.minibean.impl.core;

import org.johngao.minibean.bean.annotations.Assignment;
import org.johngao.minibean.core.AnnotationResolver;

/**
 * 类型注解解析器，用于解析标记了@Assignment的类型
 * 
 * @author JohnGao
 */
public class ClassAnnotationResolver extends AnnotationResolver {
	public <T> boolean classResolver(T goalObject) {
		/* 检测目标对象是否标记有@Assignment注解 */
		return goalObject.getClass().isAnnotationPresent(Assignment.class);
	}
}