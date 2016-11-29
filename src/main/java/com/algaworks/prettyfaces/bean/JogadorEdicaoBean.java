package com.algaworks.prettyfaces.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.algaworks.prettyfaces.model.Jogador;
import com.algaworks.prettyfaces.service.JogadorService;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;

@ManagedBean
@ViewScoped
@URLMapping(id = "jogador-edicao", pattern = "/jogadores/#{id: jogadorEdicaoBean.jogador.id}/edicao",
        viewId = "/jogador-edicao.xhtml")
public class JogadorEdicaoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Jogador jogador = new Jogador();

    private JogadorService jogadorService = new JogadorService();

    @URLAction(onPostback = false)
    public void buscar() {
        this.jogador = this.jogadorService.buscar(this.jogador.getId());
    }

    public void salvar() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Jogador salvo com sucesso!"));
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
}