package br.com.fiapride.model;

public class Profissional {
    // 1. Atributos Privados (Restaurados)
    private String nome;
    private String registro;
    private double valorHora;

    // 2. CONSTRUTOR (Restaurado)
    public Profissional(String nome, String registro, double valorHora) {
        this.nome = nome;
        this.registro = registro;
        this.valorHora = valorHora;
    }

    // 3. GETTERS (Fundamentais para o cálculo funcionar)
    public String getNome() { return nome; }
    public String getRegistro() { return registro; }
    public double getValorHora() { return valorHora; }

    // 4. POLIMORFISMO: O método que as filhas vão sobrescrever
    public String calcularOrcamento(int horasTrabalhadas) {
        return "Orçamento base: R$ " + (horasTrabalhadas * this.getValorHora());
    }
}