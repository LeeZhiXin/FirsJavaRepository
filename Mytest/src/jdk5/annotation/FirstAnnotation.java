package jdk5.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * �ܽ᣺ע��û���κ�ʵ�ʵĴ������壬ֻ��ĳЩ����ı�ǩ��
 * ��Ҫ�����Щ��ǩ������������Ӧ�Ķ���������Ҫ��дAPT(Annotation Process Tool)
 * ���÷����ȡע������ݣ�������ע��ı���ֵ��ɲ�ͬ�Ĺ���
 * 
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FirstAnnotation {
	//ע��ֻ�г�Ա������û�з���
	//��ע���ж�������ʱ�������ͱ����� 8 �ֻ�������������� �ࡢ�ӿڡ�ע�⼰���ǵ�����
	int id() default -1;
	String msg() default "Hi";
}
