package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Mecanico;
import br.com.fiapride.model.Eletricista;
import br.com.fiapride.model.OrdemDeServico;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("--- OFICINA FIAPRIDE: Teste de Herança ---");

        // 1. Instanciando especialistas (Subclasses)
        Mecanico m1 = new Mecanico("Beto Silva", "MEC-123", 150.0, "Motores V8");
        Eletricista e1 = new Eletricista("Ana Luz", "ELE-999", 180.0, true);

        Carro carroCliente = new Carro("ABC-1234", "Sedan", "Prata");

        // 2. A MÁGICA: A OS aceita o Mecânico porque ele É UM Profissional
        OrdemDeServico os1 = new OrdemDeServico("Revisão de Motor", m1, carroCliente);

        // 3. E também aceita o Eletricista!
        OrdemDeServico os2 = new OrdemDeServico("Reparo de Alternador", e1, carroCliente);

        System.out.println("\nResumo da OS 1:");
        os1.exibirResumoOS();
        System.out.println("Especialidade do técnico: " + m1.getEspecialidadeMotor());

        System.out.println("\nResumo da OS 2:");
        os2.exibirResumoOS();
    }
}