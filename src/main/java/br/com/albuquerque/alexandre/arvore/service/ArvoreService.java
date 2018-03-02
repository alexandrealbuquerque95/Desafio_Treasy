package br.com.albuquerque.alexandre.arvore.service;

import java.util.List;

import br.com.albuquerque.alexandre.arvore.model.Arvore;

public interface ArvoreService {
	
	public Long cadastrar(Arvore arvore);
	
	public Long atualizar(Arvore arvore);
	
	public void remover(Long id);
	
	public List<Arvore> listar();
	
	public Arvore listarFilhos(Long parentId);

}
