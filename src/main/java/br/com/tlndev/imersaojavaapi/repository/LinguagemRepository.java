package br.com.tlndev.imersaojavaapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tlndev.imersaojavaapi.domain.Linguagem;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
	
	Linguagem findBy_id(String _id);
	
}
