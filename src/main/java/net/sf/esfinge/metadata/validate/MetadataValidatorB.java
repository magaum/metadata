package net.sf.esfinge.metadata.validate;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import net.sf.esfinge.metadata.AnnotationFinder;
import net.sf.esfinge.metadata.AnnotationReader;
import net.sf.esfinge.metadata.annotation.validator.MaxValue;

public class MetadataValidatorB {
	
	public static void validateMetadataOn(Class<?> clazz) throws Exception{
		{
			ContainerValidator containerValidator = new ContainerValidator();
			AnnotationReader reader = new AnnotationReader();
			
			containerValidator = reader.readingAnnotationsTo(clazz, containerValidator.getClass());
			
			Class<?> currentClazz = clazz;
			while(currentClazz != Object.class && currentClazz!=null){
				for(Method m : currentClazz.getDeclaredMethods()){
					for(Annotation an : m.getAnnotations()){
						boolean cc = AnnotationFinder.existAnnotation(an.annotationType(), MaxValue.class);
					}
				}
				for(Field f : currentClazz.getDeclaredFields()){
					for(Annotation an : f.getAnnotations()){
						containerValidator = reader.readingAnnotationsTo(f, containerValidator.getClass());
					}
				}		
				
				for(Constructor<?> c : currentClazz.getConstructors()){
					for(Annotation an : c.getAnnotations()){
						containerValidator = reader.readingAnnotationsTo(c, containerValidator.getClass());
					}

				}						
				currentClazz = currentClazz.getSuperclass();
			}

			
		}
	}

}
