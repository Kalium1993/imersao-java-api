package br.com.tlndev.imersaojavaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.tlndev.imersaojavaapi.domain.Linguagem;
import br.com.tlndev.imersaojavaapi.repository.LinguagemRepository;

@Service
public class LinguagemService {

	@Autowired
	private LinguagemRepository linguagemRepository;
	
	public Linguagem getLinguagem(String id) {
		return linguagemRepository.findBy_id(id);
	}
	
	public List<Linguagem> getLinguagensByClassificacao() {
		return linguagemRepository.findAll(Sort.by(Sort.Direction.DESC, "classificacao"));
	}
	
	public Linguagem criaLinguagem(Linguagem linguagem) {
    	linguagemRepository.save(linguagem);
    	return linguagem;
    }
	
	public Linguagem editaLinguagem(String id, Linguagem linguagem) {
		if(!linguagemRepository.existsById(id))
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			
        linguagem.set_id(id);
        linguagemRepository.save(linguagem);
        return linguagem;
    }
	
	public void deletaLinguagem(String id) {
    	linguagemRepository.deleteById(id);
    }
	
}
