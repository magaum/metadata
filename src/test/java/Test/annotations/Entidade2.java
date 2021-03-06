package Test.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import net.sf.esfinge.metadata.annotation.finder.SearchInsideAnnotations;

@Retention(RetentionPolicy.RUNTIME)

@SearchInsideAnnotations
@Interna
@Variavel(nome="dominio")
public @interface Entidade2 {

}
