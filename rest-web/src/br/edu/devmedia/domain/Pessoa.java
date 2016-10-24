package br.edu.devmedia.domain;

import java.util.List;

public class Pessoa {

	private String nome;

	private List<Pessoa> filhos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pessoa> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Pessoa> filhos) {
		this.filhos = filhos;
	}

}
