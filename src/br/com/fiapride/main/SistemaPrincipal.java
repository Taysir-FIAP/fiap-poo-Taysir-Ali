package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Iniciando o Sistema FiapRide --- \n");

        // Instanciação usando o Construtor
        Carro meuCarro = new Carro("ABC-1234", "Sedan", "Prata");
        Carro carroDoProfessor = new Carro("XYZ-9876", "Hatch", "Preto");

        System.out.println(">>> Status Inicial:");
        // Uso dos Getters para leitura segura. Não usamos mais "meuCarro.modelo".
        System.out.println("Carro: " + meuCarro.getModelo() + " | Placa: " + meuCarro.getPlaca() + " | KM: " + meuCarro.getQuilometragem());
        System.out.println("Carro: " + carroDoProfessor.getModelo() + " | Placa: " + carroDoProfessor.getPlaca() + " | KM: " + carroDoProfessor.getQuilometragem());

        System.out.println("\n--- Realizando Viagens ---");
        meuCarro.ligarMotor();
        meuCarro.registrarViagem(25.5);

        System.out.println("\n>>> Status Pós-Viagem:");
        System.out.println("Carro: " + meuCarro.getModelo() + " | KM Atualizado: " + meuCarro.getQuilometragem());

        // --- O TESTE DE BLINDAGEM ---
        // Tente hackear o sistema descomentando (removendo as barras) a linha abaixo:
        //meuCarro.quilometragem = 5.0;

        // Se você remover as barras, o IntelliJ vai sublinhar "quilometragem" de vermelho.
        // Isso prova que o atributo está privado e o objeto está protegido.
    }
}