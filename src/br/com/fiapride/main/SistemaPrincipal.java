package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("--- 🏛️ OFICINA FIAPRIDE: ARQUITETURA ABSTRATA ---");

        // TESTE 1: O bloqueio do Molde
        // Se você descomentar a linha abaixo, o código NÃO COMPILA.
        // Profissional p = new Profissional("Generico", "000", 10.0);
        // Erro: 'Profissional is abstract; cannot be instantiated'

        // TESTE 2: Polimorfismo com Base Abstrata (Isso funciona e é LINDO!)
        Profissional[] oficina = {
                new Mecanico("Beto", "M-1", 100.0, "V8"),
                new Eletricista("Ana", "E-1", 120.0, true)
        };

        for (Profissional p : oficina) {
            System.out.println("Nome: " + p.getNome());
            p.exibirEspecialidade(); // Chama o método que a classe foi OBRIGADA a ter
            System.out.println(p.calcularOrcamento(2));
            System.out.println("-------------------");
        }
    }
}