package org.esfinge.metadata.foo.annotation.test;

import org.esfinge.metadata.foo.annotation.StaticFieldOnly;

public class Person {
	
	private String name;
	private String cpf;
	private int age;
	
	@StaticFieldOnly
	private static String staticValue = "";
	
	@StaticFieldOnly
	private String notStaticValue = "";
	
//	public String one_public;
//	protected String one_protected;
//	String one_default;
	
	public Person(String name, String cpf, int age) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getStaticValue() {
		return staticValue;
	}
	public void setStaticValue(String staticValue) {
		this.staticValue = staticValue;
	}
	public String getNotStaticValue() {
		return notStaticValue;
	}
	public void setNotStaticValue(String notStaticValue) {
		this.notStaticValue = notStaticValue;
	}
	
	
	
}
