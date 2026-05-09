package br.com.fiapride.model;

// A classe precisa ser abstract conforme a Aula 8
public abstract class Profissional {
    private String nome;
    private String registro; // O atributo existe...
    private double valorHora;

    public Profissional(String nome, String registro, double valorHora) {
        this.nome = nome;
        this.registro = registro;
        this.valorHora = valorHora;
    }

    // O getter que está faltando para a OrdemDeServico não dar erro:
    public String getRegistro() {
        return registro;
    }

    public String getNome() { return nome; }
    public double getValorHora() { return valorHora; }

    public abstract void exibirEspecialidade();

    public String calcularOrcamento(int horasTrabalhadas) {
        return "Orçamento base: R$ " + (horasTrabalhadas * this.valorHora);
    }
}