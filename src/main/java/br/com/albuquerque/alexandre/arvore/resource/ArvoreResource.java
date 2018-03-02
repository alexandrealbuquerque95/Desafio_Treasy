package br.com.albuquerque.alexandre.arvore.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.albuquerque.alexandre.arvore.model.Arvore;
import br.com.albuquerque.alexandre.arvore.repository.ArvoreRepository;
import br.com.albuquerque.alexandre.arvore.service.ArvoreServiceImpl;

@RestController
public class ArvoreResource {
	
	@Autowired
	private ArvoreServiceImpl arvoreService;
	
	@PostMapping("/node")
	public Long cadastrar(@RequestBody Arvore arvore)
	{
		return arvoreService.cadastrar(arvore);
	}
	
	@PutMapping("/node")
	public Long atualizar(@RequestBody Arvore arvore)
	{
		return arvoreService.atualizar(arvore);
	}
	
	@DeleteMapping("/node/{id}")
	public void remover(@PathVariable Long id)
	{
		arvoreService.remover(id);
	}
	
//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/node")
	public Arvore listar()
	{
		return arvoreService.listar();
	}
	
	@GetMapping("/node/{parentId}")
	public Arvore[] listarFilhos(@PathVariable Long parentId)
	{
		return arvoreService.listarFilhos(parentId);
	}

}
