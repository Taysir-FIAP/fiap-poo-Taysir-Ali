package br.com.fiapride.model;

public class Mecanico extends Profissional {

    private String especialidade;

    public Mecanico(String nome, String registro, double valorHora, String especialidade) {
        super(nome, registro, valorHora); // Envia para o pai
        this.especialidade = especialidade;
    }

    @Override
    public String calcularOrcamento(int horasTrabalhadas) {
        double valorBase = horasTrabalhadas * this.getValorHora();
        double taxaOficina = valorBase * 0.10;
        return "Orçamento Mecânica: R$ " + (valorBase + taxaOficina) + " (Incluso taxa de ferramentas).";
    }
}