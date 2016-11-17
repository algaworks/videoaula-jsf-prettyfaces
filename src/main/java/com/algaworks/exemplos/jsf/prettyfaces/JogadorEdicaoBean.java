package com.algaworks.exemplos.jsf.prettyfaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class JogadorEdicaoBean {
	
	private Jogador jogador = new Jogador();
	
	private JogadorService jogadorService = new JogadorService();
	
	public void buscar() {
		this.jogador = this.jogadorService.buscar(this.jogador.getId());
	}
	
	public void salvar() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage(
						"Jogador salvo com sucesso!"));
	}
	
	public Jogador getJogador() {
		return jogador;
	}
	
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
}