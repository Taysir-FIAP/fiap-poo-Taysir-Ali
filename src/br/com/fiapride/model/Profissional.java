package br.com.fiapride.model;

public class Profissional {
    // Atributos privados (Encapsulamento)
    private String nome;
    private String registro;
    private double valorHora;

    // CONSTRUTOR: Exigindo os 3 parâmetros fundamentais
    public Profissional(String nome, String registro, double valorHora) {
        this.setNome(nome);
        this.setRegistro(registro);
        this.setValorHora(valorHora);
    }

    // Getters
    public String getNome() { return nome; }
    public String getRegistro() { return registro; }
    public double getValorHora() { return valorHora; }

    // Setters Privados com Validações (A Engrenagem interna)
    private void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("❌ Erro: Nome do profissional é obrigatório!");
        }
    }

    private void setRegistro(String registro) {
        if (registro != null && !registro.trim().isEmpty()) {
            this.registro = registro;
        } else {
            System.out.println("❌ Erro: Registro profissional inválido!");
        }
    }

    private void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        } else {
            System.out.println("❌ Erro: Valor/Hora deve ser positivo!");
        }
    }
}