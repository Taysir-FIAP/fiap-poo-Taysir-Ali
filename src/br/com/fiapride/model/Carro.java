package br.com.fiapride.model;

// Carro agora TAMBÉM assina o contrato Documentavel
public class Carro implements Documentavel {
    private String placa;
    private String modelo;
    private String cor;
    private double quilometragem;
    private boolean motorLigado;

    public Carro(String placa, String modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.quilometragem = 0.0;
        this.motorLigado = false;
    }

    // Getters necessários
    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }

    // IMPLEMENTAÇÃO DO CONTRATO: Carro valida do jeito dele (placa)
    @Override
    public boolean validarDocumentacao() {
        System.out.println("🔍 Validando Documentação do Veículo (Placa): " + this.getPlaca());
        return true;
    }

    // ... métodos ligarMotor() e registrarViagem() permanecem iguais ...
}