package net.sf.esfinge.container.processor.method;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import net.sf.esfinge.metadata.annotation.container.ExecuteProcessor;

public interface ProcessorInterface {
	
	@ExecuteProcessor
	public void processorInitializationMethod(Annotation ann);

	@ExecuteProcessor
	public void processorInitializationMethodAndAnnotedElement(AnnotatedElement ael, Annotation ann);
	
	@ExecuteProcessor
	public void entidade2(Annotation ann, AnnotatedElement ael, Container annotc);


}
