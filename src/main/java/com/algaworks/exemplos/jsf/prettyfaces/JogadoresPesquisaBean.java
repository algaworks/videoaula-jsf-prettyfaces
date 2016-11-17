package com.algaworks.exemplos.jsf.prettyfaces;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class JogadoresPesquisaBean {
	
	private List<Jogador> jogadores;
	
	private JogadorService jogadorService = new JogadorService();
	
	public void iniciar() {
		this.jogadores = this.jogadorService.todos();
	}
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}
}
