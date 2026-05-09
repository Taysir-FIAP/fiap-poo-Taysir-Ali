package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("=== 🛡️ OFICINA FIAPRIDE: CONTROLE DE ACESSO ===");

        // 1. Instanciamos classes de hierarquias diferentes
        Mecanico m1 = new Mecanico("Beto Silva", "M-123", 100.0, "Motores");
        Carro c1 = new Carro("ABC-1234", "Civic", "Preto");

        // 2. MÁGICA: Ambos podem entrar na mesma lista de Documentavel
        Documentavel[] itensParaRevisar = { m1, c1 };

        System.out.println("\n--- CHECKLIST DE ENTRADA ---");
        for (Documentavel item : itensParaRevisar) {
            // Não importa se é pessoa ou máquina, se é Documentavel, eu chamo o método
            if (item.validarDocumentacao()) {
                System.out.println("✅ OK: Entrada liberada no pátio.");
            } else {
                System.out.println(Documentavel.ALERTA_SEGURANCA);
            }
            System.out.println("----------------------------");
        }
    }
}