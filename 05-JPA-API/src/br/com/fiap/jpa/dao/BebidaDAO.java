package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Bebida;

public interface BebidaDAO {

	void cadastrar(Bebida bebida);
	
	void atualizar(Bebida bebida);
	
	Bebida pesquisar(int codigo);
	
	void apagar(int codigo);
	
}
