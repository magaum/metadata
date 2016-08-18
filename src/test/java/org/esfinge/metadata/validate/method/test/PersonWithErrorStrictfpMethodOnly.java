package org.esfinge.metadata.validate.method.test;

import java.util.HashSet;
import java.util.Set;

import org.esfinge.metadata.annotation.container.method.OneAnnotationWithStrictfpMethodOnly;

public class PersonWithErrorStrictfpMethodOnly extends Person{
	
	public static String otherStaticString = "";
	
	Set<Object> oneSet = new HashSet<>();	
	
	
	public PersonWithErrorStrictfpMethodOnly(String name, String cpf, int age) {
		super(name, cpf, age);
	}

	@OneAnnotationWithStrictfpMethodOnly
	public static void setOtherStaticString(String otherStaticString) {
		PersonWithErrorStrictfpMethodOnly.otherStaticString = otherStaticString;
	}

	@OneAnnotationWithStrictfpMethodOnly
	public void setOneSet(Set<Object> oneSet) {
		this.oneSet = oneSet;
	}

}