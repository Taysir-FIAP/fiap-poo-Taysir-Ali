package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Instância 1
        Carro meuCarro = new Carro();
        meuCarro.placa = "ABC-1234";
        meuCarro.modelo = "Sedan";
        meuCarro.cor = "Prata";

        // Instância 2
        Carro carroDoProfessor = new Carro();
        carroDoProfessor.placa = "XYZ-9876";
        carroDoProfessor.modelo = "Hatch";
        carroDoProfessor.cor = "Preto";

        // Saída no console
        System.out.println("--- Teste FiapRide: Objeto Carro ---");
        System.out.println("Meu carro: " + meuCarro.modelo + " | Cor: " + meuCarro.cor + " | Placa: " + meuCarro.placa);
        System.out.println("Carro do professor: " + carroDoProfessor.modelo + " | Cor: " + carroDoProfessor.cor + " | Placa: " + carroDoProfessor.placa);
    }
}