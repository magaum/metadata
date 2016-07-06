package org.esfinge.metadata.TestAnnotationReader;

import java.util.Map;

import org.esfinge.metadata.container.AnnotationProperty;
import org.esfinge.metadata.container.ContainerFor;
import org.esfinge.metadata.container.ContainsAnnotation;
import org.esfinge.metadata.container.ElementName;
import org.esfinge.metadata.container.Propriedades;
import org.esfinge.metadata.container.ReflectionReference;

@ContainerFor(vaule = Propriedades.CLASS)
public class CT8Container {
		
	@ReflectionReference
	private Class<?> classValue;
	

	public Class<?> getClassValue() {
		return classValue;
	}

	public void setClassValue(Class<?> classValue) {
		this.classValue = classValue;
	}
		

}
