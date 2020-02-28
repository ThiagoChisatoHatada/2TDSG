package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Viagem;

public class PesquisaTeste {

	public static void main(String[] args) {
		//Criar a fabrica de entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		//Criar o entity manager
		EntityManager em = fabrica.createEntityManager();

		//Pesquisar a viagem de c�digo 1
		Viagem viagem = em.find(Viagem.class, 1);
		
		//Exibir alguns dados da viagem
		System.out.println(viagem.getOrigem());
		
		//Fechar as paradas
		em.close();
		fabrica.close();
	}
	
}





