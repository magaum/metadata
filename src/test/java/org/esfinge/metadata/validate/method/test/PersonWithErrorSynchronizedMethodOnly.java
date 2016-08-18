package org.esfinge.metadata.validate.method.test;

import org.esfinge.metadata.annotation.container.method.OneAnnotationWithSynchronizedMethodOnly;

public class PersonWithErrorSynchronizedMethodOnly extends Person{

	transient static String oneDefaultString;

	public volatile long oneVolatileLong = 2372983;		
	
	public PersonWithErrorSynchronizedMethodOnly(String name, String cpf, int age) {
		super(name, cpf, age);
	}

	@OneAnnotationWithSynchronizedMethodOnly
	public static String getOneDefaultString() {
		return oneDefaultString;
	}

	@OneAnnotationWithSynchronizedMethodOnly
	private long getOneVolatileLong() {
		return oneVolatileLong;
	}
	
}
