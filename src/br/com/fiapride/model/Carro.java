package br.com.fiapride.model;

public class Carro {
    // Passo 1: Trancando as Portas (Private)
    private String placa;
    private String modelo;
    private String cor;
    private double quilometragem;
    private boolean motorLigado;

    public Carro(String placa, String modelo, String cor) {
        this.setPlaca(placa);
        this.setModelo(modelo);
        this.setCor(cor);
        this.quilometragem = 0.0;
        this.motorLigado = false;
    }

    // Passo 2: Criando as Portas de Acesso (Get e Set)

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    // Regra especial: Não permitir que a quilometragem seja reduzida
    private void setQuilometragem(double novaQuilometragem) {
        if (novaQuilometragem >= this.quilometragem) {
            this.quilometragem = novaQuilometragem;
        } else {
            System.out.println("Erro de Segurança: Tentativa de reduzir a quilometragem bloqueada!");
        }
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    // O Setter do motorLigado foi omitido intencionalmente, pois o controle
    // deve ser feito apenas pelos métodos ligarMotor() e desligarMotor() (se existir).

    // --- Métodos de Comportamento (Aula 2) ---

    public void ligarMotor() {
        if (this.motorLigado) {
            System.out.println("Erro: O motor do carro " + this.getPlaca() + " já está ligado.");
            return;
        }
        this.motorLigado = true;
        System.out.println("Motor do carro " + this.getPlaca() + " ligado com sucesso.");
    }

    public void registrarViagem(double distanciaKm) {
        if (!this.motorLigado) {
            System.out.println("Erro: Não é possível viajar. O motor do carro " + this.getPlaca() + " está desligado.");
            return;
        }
        if (distanciaKm <= 0) {
            System.out.println("Erro: A distância da viagem (" + distanciaKm + "km) é inválida.");
            return;
        }

        // Em vez de alterar o atributo diretamente, usamos o Setter seguro.
        this.setQuilometragem(this.getQuilometragem() + distanciaKm);
        System.out.println("Viagem de " + distanciaKm + "km registrada no carro " + this.getPlaca() + ". KM total: " + this.getQuilometragem());
    }
}