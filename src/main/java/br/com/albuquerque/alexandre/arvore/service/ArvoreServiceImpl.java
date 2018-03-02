package br.com.albuquerque.alexandre.arvore.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.albuquerque.alexandre.arvore.model.Arvore;
import br.com.albuquerque.alexandre.arvore.repository.ArvoreRepository;

@Service
public class ArvoreServiceImpl implements ArvoreService 
{
	
	@Autowired
	private ArvoreRepository arvoreRepository;

	@Override
	public Long cadastrar(Arvore arvore) {
		Arvore arvRetorn = arvoreRepository.save(arvore);
		return arvRetorn.getId();
	}

	@Override
	public Long atualizar(Arvore arvore) {
		Arvore arvRetorn = arvoreRepository.save(arvore);
		return arvRetorn.getId();
	}

	@Override
	public void remover(Long id) {
		arvoreRepository.delete(id);
	}

	@Override
	public Arvore listar() {
		List<Arvore> arvores = arvoreRepository.findAll();
		
		System.out.println("\n\n");
		
		for(Arvore arvore : arvores)
		{
			if(arvore.getParentId() == null || arvore.getParentId() == 0)
			{
				
				arvore.setChildren(listarFilhos(arvore.getId()));
				return arvore;
			}
		}
		
		return null;
	}

	@Override
	public Arvore[] listarFilhos(Long parentId) {
		
		Arvore[] nos = arvoreRepository.findByParentId(parentId);
		
		for(Arvore no : nos)
		{
			no.setChildren(listarFilhos(no.getId()));
		}
		
		return nos;
	}
}
