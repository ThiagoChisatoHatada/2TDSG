package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.BebidaDAO;
import br.com.fiap.jpa.entity.Bebida;

public class BebidaDAOImpl implements BebidaDAO {

	private EntityManager em;
	
	public BebidaDAOImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void cadastrar(Bebida bebida) {
		em.persist(bebida);
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

	@Override
	public void atualizar(Bebida bebida) {
		em.merge(bebida);
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

	@Override
	public Bebida pesquisar(int codigo) {
		return em.find(Bebida.class, codigo);
	}

	@Override
	public void apagar(int codigo) {
		Bebida bebida = pesquisar(codigo);
		em.remove(bebida);
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

}



