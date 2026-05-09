package br.com.fiapride.main;

import br.com.fiapride.model.Profissional;
import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Sistema FiapRide: Gestão de Profissionais --- \n");

        // TESTE 1: Nascimento Legalizado
        Profissional p1 = new Profissional("Taysir Fauzi", "MEC-2026", 85.0);
        System.out.println("✅ Profissional cadastrado: " + p1.getNome());

        // TESTE 2: Tentativa de Criar "Profissional Fantasma"
        // Descomente a linha abaixo para ver o erro de compilação:
        //Profissional p2 = new Profissional();

        // O erro ocorre porque o Java agora EXIGE os 3 parâmetros que definimos no construtor.
    }
}