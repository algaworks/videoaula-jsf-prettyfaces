package com.algaworks.prettyfaces.service;

import java.util.Arrays;
import java.util.List;

import com.algaworks.prettyfaces.model.Jogador;

public class JogadorService {
	
	private static final List<Jogador> JOGADORES = Arrays.asList(
			new Jogador(1, "Rogerio Ceni", "rogerio.ceni@algaworks.com"),
			new Jogador(7, "Cristiano Ronaldo", "cristiano.ronaldo@algaworks.com"),
			new Jogador(9, "Messi", "messi@algaworks.com"),
			new Jogador(10, "Alexandre Afonso", "alexandre.afonso@algaworks.com"),
			new Jogador(11, "Neymar Junior", "neymar.junior@algaworks.com")
	); 
	
	
	public List<Jogador> todos() {
		return JOGADORES;
	}
	
	public Jogador buscar(Integer id) {
		return JOGADORES
				.stream()
				.filter(j -> j.getId().equals(id))
				.findFirst()
				.get();
	}
}