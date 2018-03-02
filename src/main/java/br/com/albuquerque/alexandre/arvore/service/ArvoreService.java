package br.com.albuquerque.alexandre.arvore.service;

import br.com.albuquerque.alexandre.arvore.model.Arvore;

public interface ArvoreService {
	
	public Long cadastrar(Arvore arvore);
	
	public Long atualizar(Arvore arvore);
	
	public void remover(Long id);
	
	public Arvore listar();
	
	public Arvore[] listarFilhos(Long parentId);

}
