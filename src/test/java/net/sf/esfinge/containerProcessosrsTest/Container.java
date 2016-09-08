package net.sf.esfinge.containerProcessosrsTest;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import net.sf.esfinge.metadata.annotation.container.ContainerFor;
import net.sf.esfinge.metadata.annotation.container.MethodProcessors;
import net.sf.esfinge.metadata.annotation.container.Processors;
import net.sf.esfinge.metadata.container.ContainerTarget;
@ContainerFor(value = ContainerTarget.CLASS)

public class Container{
	
	//1-Procura anotações com ProcessorAnnotation dentro
	//2-Pega a classe do value
	//2.1-verifica se essa classe é do tipo que está na lista
	//3-Instancia a classe que está no value
	//4-chama o método init no objeto criado
	//5-adiciona na lista
	@Processors(ProcessorAnnotation.class)
	List<ProcessorInterface> list;

	public List<ProcessorInterface> getList() {
		return list;
	}

	public void setList(List<ProcessorInterface> list) {
		this.list = list;
	}
	
}
