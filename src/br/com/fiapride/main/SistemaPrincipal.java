package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Instanciação utilizando o novo Construtor
        Carro meuCarro = new Carro("ABC-1234", "Sedan", "Prata");
        Carro carroDoProfessor = new Carro("XYZ-9876", "Hatch", "Preto");

        System.out.println("--- Sistema FiapRide: Testes de Comportamento ---");

        System.out.println("\n[Testando o Meu Carro]");
        // Tentando viajar com o carro desligado (Deve gerar erro)
        meuCarro.registrarViagem(15.5);

        // Ligando o carro e viajando corretamente
        meuCarro.ligarMotor();
        meuCarro.registrarViagem(15.5);

        // Tentando ligar um carro que já está ligado (Deve gerar erro)
        meuCarro.ligarMotor();

        System.out.println("\n[Testando o Carro do Professor]");
        carroDoProfessor.ligarMotor();
        // Tentando registrar uma viagem com distância negativa (Deve gerar erro)
        carroDoProfessor.registrarViagem(-5.0);
        carroDoProfessor.registrarViagem(42.8);
    }
}