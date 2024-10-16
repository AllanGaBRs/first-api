package br.com.projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
	
	
}
