package com.algaworks.prettyfaces.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.algaworks.prettyfaces.model.Jogador;
import com.algaworks.prettyfaces.service.JogadorService;

@ManagedBean
@ViewScoped
public class JogadoresPesquisaBean implements Serializable {
	
    private static final long serialVersionUID = 1L;

    private List<Jogador> jogadores;
	
	private JogadorService jogadorService = new JogadorService();
	
	public void iniciar() {
		this.jogadores = this.jogadorService.todos();
	}
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}
}
