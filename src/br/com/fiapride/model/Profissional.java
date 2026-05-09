package br.com.fiapride.model;

// 'implements Documentavel' faz todos os herdeiros serem documentáveis
public abstract class Profissional implements Documentavel {
    private String nome;
    private String registro;
    private double valorHora;

    public Profissional(String nome, String registro, double valorHora) {
        this.nome = nome;
        this.registro = registro;
        this.valorHora = valorHora;
    }

    // Getters
    public String getRegistro() { return registro; }
    public String getNome() { return nome; }
    public double getValorHora() { return valorHora; }

    public abstract void exibirEspecialidade();

    public String calcularOrcamento(int horasTrabalhadas) {
        return "Orçamento base: R$ " + (horasTrabalhadas * this.valorHora);
    }

    // IMPLEMENTAÇÃO DO CONTRATO: Validação padrão para qualquer profissional
    @Override
    public boolean validarDocumentacao() {
        System.out.println("🔍 Validando CPF e Registro Profissional de: " + this.getNome());
        return true;
    }
}