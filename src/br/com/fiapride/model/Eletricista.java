package br.com.fiapride.model;

public class Eletricista extends Profissional {

    private boolean possuiCertificacaoNR10;

    public Eletricista(String nome, String registro, double valorHora, boolean possuiCertificacaoNR10) {
        super(nome, registro, valorHora);
        this.possuiCertificacaoNR10 = possuiCertificacaoNR10;
    }

    public boolean isCertificado() {
        return possuiCertificacaoNR10;
    }
}