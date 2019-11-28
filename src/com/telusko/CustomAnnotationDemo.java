package com.telusko;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Marker Annotation
//Single value Annotation
//Multi value Annotation

//Meta Annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface SmartPhone {

	public String os();

	public int version();

	// String os() default "Symbian";
	// int version() default 1;
}

@SmartPhone(os = "Android", version = 1)
class NokiaASeries {

	String model;
	int size;

	public NokiaASeries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}

}

public class CustomAnnotationDemo {

	public static void main(String[] args) {
		NokiaASeries obj = new NokiaASeries("Abc", 10);
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone) an;
		System.out.println(s.os());
	}

}
