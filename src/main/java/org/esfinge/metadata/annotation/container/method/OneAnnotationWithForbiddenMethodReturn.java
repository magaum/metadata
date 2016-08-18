package org.esfinge.metadata.annotation.container.method;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.esfinge.metadata.annotation.validator.method.ForbiddenMethodReturn;

@ForbiddenMethodReturn(invalidTypesToReturn = {void.class, float.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface OneAnnotationWithForbiddenMethodReturn {
}