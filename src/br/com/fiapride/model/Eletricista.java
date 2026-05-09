package br.com.fiapride.model;

public class Eletricista extends Profissional {

    private boolean certificado;

    public Eletricista(String nome, String registro, double valorHora, boolean certificado) {
        super(nome, registro, valorHora); // Envia para o pai
        this.certificado = certificado;
    }

    @Override
    public void exibirEspecialidade() {
        System.out.println("Especialidade: Sistemas Elétricos e Injeção.");
    }
}