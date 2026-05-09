package br.com.fiapride.model;

public class Eletricista extends Profissional {

    private boolean certificado;

    public Eletricista(String nome, String registro, double valorHora, boolean certificado) {
        super(nome, registro, valorHora); // Envia para o pai
        this.certificado = certificado;
    }

    @Override
    public String calcularOrcamento(int horasTrabalhadas) {
        double valorBase = horasTrabalhadas * this.getValorHora();
        double adicionalRisco = 50.0;
        return "Orçamento Elétrica: R$ " + (valorBase + adicionalRisco) + " (Incluso adicional de periculosidade).";
    }
}