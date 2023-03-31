package br.com.tlndev.imersaojavaapi.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter  
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "linguagem")
public class Linguagem {

	@Id
	private String _id;
	
	private String titulo;
	private String imagem;
	private Double classificacao;
	
	public Linguagem(String titulo, String imagem, Double classificacao) {
		this.titulo = titulo;
		this.imagem = imagem;
		this.classificacao = classificacao;
	}
	
}
