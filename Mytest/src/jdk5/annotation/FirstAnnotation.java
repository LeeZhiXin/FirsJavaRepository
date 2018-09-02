package jdk5.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 总结：注解没有任何实际的代码意义，只是某些代码的标签，
 * 想要针对这些标签的内容作出相应的动作，就需要编写APT(Annotation Process Tool)
 * 利用反射获取注解的内容，并根据注解的变量值完成不同的工作
 * 
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FirstAnnotation {
	//注解只有成员变量，没有方法
	//在注解中定义属性时它的类型必须是 8 种基本数据类型外加 类、接口、注解及它们的数组
	int id() default -1;
	String msg() default "Hi";
}
