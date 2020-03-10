package br.com.fiap.jpa.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe que gerencia a inst�ncia de EntityManagerFactory
 * permitindo uma �nica inst�ncia na aplica��o
 */
public class EntityManagerFactorySingleton {

	/**
	 * Atributo est�tico que armazena a �nica inst�ncia
	 */
	private static EntityManagerFactory fabrica;
	
	/**
	 * Construtor privado: ninguem pode instanciar a classe
	 */
	private EntityManagerFactorySingleton() {}
	
	/**
	 * @return A �nica inst�ncia da fabrica
	 */
	public static EntityManagerFactory getInstance() {
		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("oracle");
		}
		return fabrica;
	}
	
}








