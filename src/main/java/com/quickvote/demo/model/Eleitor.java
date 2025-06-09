package com.quickvote.demo.model;

public class Eleitor {

    private Integer numeroEleitor;
    private String nomeEleitor;
    private Integer numeroSessao;

    public String getNomeEleitor() {
        return nomeEleitor;
    }

    public void setNomeEleitor(String nomeEleitor) {
        this.nomeEleitor = nomeEleitor;
    }

    public Integer getNumeroEleitor() {
        return numeroEleitor;
    }

    public void setNumeroEleitor(Integer numeroEleitor) {
        this.numeroEleitor = numeroEleitor;
    }

    public Integer getNumeroSessao() {
        return numeroSessao;
    }

    public void setNumeroSessao(Integer numeroSessao) {
        this.numeroSessao = numeroSessao;
    }
}
