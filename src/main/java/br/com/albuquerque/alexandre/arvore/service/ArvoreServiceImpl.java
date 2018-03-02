package br.com.albuquerque.alexandre.arvore.service;

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
	public List<Arvore> listar() {
		return arvoreRepository.findAll();
	}

	@Override
	public Arvore listarFilhos(Long parentId) {
		return arvoreRepository.findOne(parentId);
	}

}
