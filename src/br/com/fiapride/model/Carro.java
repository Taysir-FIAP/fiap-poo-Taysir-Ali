package br.com.fiapride.model;

public class Carro {
    public String placa;
    public String modelo;
    public String cor;
    public double quilometragem;
    public boolean motorLigado;

    // Construtor: Exige os dados básicos no momento da criação e define o estado inicial
    public Carro(String placa, String modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.quilometragem = 0.0;
        this.motorLigado = false; // Todo carro nasce desligado
    }

    public void ligarMotor() {
        // Regra de negócio: Não faz sentido ligar um motor que já está ligado
        if (this.motorLigado) {
            System.out.println("Erro: O motor do carro " + this.placa + " já está ligado.");
            return;
        }
        this.motorLigado = true;
        System.out.println("Motor do carro " + this.placa + " ligado com sucesso.");
    }

    public void registrarViagem(double distanciaKm) {
        // Regra de negócio 1: O carro precisa estar ligado para viajar
        if (!this.motorLigado) {
            System.out.println("Erro: Não é possível viajar. O motor do carro " + this.placa + " está desligado.");
            return;
        }
        // Regra de negócio 2: A distância não pode ser negativa ou zero
        if (distanciaKm <= 0) {
            System.out.println("Erro: A distância da viagem (" + distanciaKm + "km) é inválida.");
            return;
        }

        this.quilometragem += distanciaKm;
        System.out.println("Viagem de " + distanciaKm + "km registrada no carro " + this.placa + ". KM total: " + this.quilometragem);
    }
}