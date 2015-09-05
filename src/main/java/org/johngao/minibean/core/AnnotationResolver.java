package org.johngao.minibean.core;

import java.lang.reflect.Field;

/**
 * 注解解析器接口实现，用于解析标记了@Assignment和@Paramater的类型
 * 
 * @author JohnGao
 */
public class AnnotationResolver implements Resolver {
	public <T> boolean classResolver(T goalObject) {
		// TODO Auto-generated method stub
		return false;
	}

	public <T, K> void executeSetParameter(Field goalObjectField,
			Field sourceObjectField, T goalObject, K sourceObject) {
		// TODO Auto-generated method stub
	}

	public <T, K> void fieldResolver(T goalObject, K sourceObject) {
		// TODO Auto-generated method stub
	}
}