package br.com.albuquerque.alexandre.arvore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.albuquerque.alexandre.arvore.model.Arvore;

public interface ArvoreRepository extends JpaRepository<Arvore, Long> {

}
