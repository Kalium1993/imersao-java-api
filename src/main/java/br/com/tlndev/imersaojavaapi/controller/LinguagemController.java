package br.com.tlndev.imersaojavaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tlndev.imersaojavaapi.domain.Linguagem;
import br.com.tlndev.imersaojavaapi.service.LinguagemService;

@RestController
@RequestMapping("/linguagem")
public class LinguagemController {
	@Autowired
	private LinguagemService linguagemService;
	
	@PostMapping
	public ResponseEntity<Linguagem> create(@Validated @RequestBody Linguagem linguagem) {
		return new ResponseEntity<Linguagem>(linguagemService.criaLinguagem(linguagem), HttpStatus.CREATED);
	}
	
	@PutMapping("/editar/{id}")
	public Linguagem edit(@PathVariable("id") String id, @Validated @RequestBody Linguagem linguagem) {
		return linguagemService.editaLinguagem(id, linguagem);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") String id) {
		linguagemService.deletaLinguagem(id);
    }
	
	@GetMapping("/ranking")
	public List<Linguagem> ranking() {
		return linguagemService.getLinguagensByClassificacao();
	}
	
	@GetMapping("/{id}")
	public Linguagem getLinguagem(@PathVariable("id") String id) {
		return linguagemService.getLinguagem(id);
	}
	
}
