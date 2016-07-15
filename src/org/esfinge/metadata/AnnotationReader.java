package org.esfinge.metadata;

import java.lang.annotation.Annotation;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;

import org.esfinge.metadata.annotation.container.AnnotationReadingConfig;
import org.esfinge.metadata.container.AnnotationReadingProcessor;
import org.esfinge.metadata.container.MetadataExecute;
import org.esfinge.metadata.container.RepositorioMetadados;

public class AnnotationReader {

	// To be modified as necessary. Currently only checks if BooleanAnnotation
	// is present on methods.
	// TODO:Checking on classes and parameters

	public <E> E readingAnnotationsTo(AnnotatedElement elementWithMetadata, Class<E> containerClass) throws Exception {

		Object container = containerClass.newInstance();
		RepositorioMetadados metadataRepository = new RepositorioMetadados();//migrar para ingl�s
		metadataRepository.findMetadata(containerClass);
		
		MetadataExecute metadataExecute = new MetadataExecute(containerClass);
		container = metadataExecute.execMetadata(metadataRepository.getRepositorio(),elementWithMetadata);

		return (E) container;
	}

}
