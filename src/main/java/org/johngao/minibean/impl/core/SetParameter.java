package org.johngao.minibean.impl.core;

import java.lang.reflect.Field;

import org.johngao.minibean.core.AnnotationResolver;

/**
 * 源对象与目标对象的自动赋值
 * 
 * @author JohnGao
 */
public class SetParameter extends AnnotationResolver {
	public <T, K> void executeSetParameter(Field goalObjectField,
			Field sourceObjectField, T goalObject, K sourceObject) {
		try {
			/* 允许向目标对象的私有字段进行赋值操作 */
			goalObjectField.setAccessible(true);

			/* 允许向源对象的私有字段进行取值操作 */
			sourceObjectField.setAccessible(true);

			/* 将源对象字段值赋值于目标对象字段 */
			goalObjectField
					.set(goalObject, sourceObjectField.get(sourceObject));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}