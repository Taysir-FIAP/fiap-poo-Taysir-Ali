package br.com.fiapride.main;

import br.com.fiapride.model.Profissional;
import br.com.fiapride.model.Mecanico;
import br.com.fiapride.model.Eletricista;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("--- 🛠️ OFICINA FIAPRIDE: SISTEMA DE ORÇAMENTOS ---");

        // 1. Lista da SUPERCLASSE: Aceita qualquer herdeiro!
        List<Profissional> equipe = new ArrayList<>();

        equipe.add(new Mecanico("Beto Silva", "MEC-123", 100.0, "Motores V8"));
        equipe.add(new Eletricista("Ana Luz", "ELE-999", 100.0, true));

        // 2. A MÁGICA: O mesmo comando produz cálculos diferentes
        for (Profissional p : equipe) {
            System.out.println("Profissional: " + p.getNome());
            // Mesmo ambos tendo valor/hora de 100.0, os resultados serão diferentes
            System.out.println(p.calcularOrcamento(5));
            System.out.println("------------------------------------------------");
        }
    }
}