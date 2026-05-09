package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Profissional;
import br.com.fiapride.model.OrdemDeServico;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("--- Oficina FiapRide: Gestão de Ordens ---");

        // 1. Criamos os objetos base
        // Usamos a classe Profissional que já tem construtor obrigatório
        Profissional prof = new Profissional("Taysir Fauzi", "MEC-2026", 100.0);
        Carro meuCarro = new Carro("ABC-1234", "Sedan", "Prata");

        // 2. Criamos a Ordem de Serviço associando os objetos
        OrdemDeServico os = new OrdemDeServico("Revisão Geral de Sistema", prof, meuCarro);

        // 3. Exibimos o resumo para validar a comunicação entre as classes
        os.exibirResumoOS();

        // 4. Teste de Referência: Se mudarmos o valor/hora do profissional...
        // O sistema deve refletir isso na OS automaticamente.
        System.out.println("Valor/Hora consultado via OS: R$ " + os.getTecnicoResponsavel().getValorHora());
    }
}