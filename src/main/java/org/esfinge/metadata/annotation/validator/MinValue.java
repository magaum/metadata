package org.esfinge.metadata.annotation.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.esfinge.metadata.validate.MinValueAnnotationValidator;

@ToValidateProperty(validationClass = MinValueAnnotationValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MinValue {
	int value();
}