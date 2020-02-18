package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Configura at� quando a anota��o estar� presente
@Retention(RetentionPolicy.RUNTIME)//Execu��o
//Configura onde pode ser utilizada a anota��o
@Target(ElementType.FIELD) //atributos
public @interface Coluna {

	boolean obrigatorio() default false;
	
	String nome();
	
}
