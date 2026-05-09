package br.com.fiapride.model;

public class Mecanico extends Profissional {

    private String especialidade;

    public Mecanico(String nome, String registro, double valorHora, String especialidade) {
        super(nome, registro, valorHora); // Envia para o pai
        this.especialidade = especialidade;
    }

    @Override
    public void exibirEspecialidade() {
        System.out.println("Especialidade: Manutenção Mecânica e Motores.");
    }
}