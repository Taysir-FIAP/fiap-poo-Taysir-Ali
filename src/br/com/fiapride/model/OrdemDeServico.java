package br.com.fiapride.model;

public class OrdemDeServico {

    private String descricao;
    private double valorOrcado;

    // ASSOCIAÇÃO: A OS tem um Profissional (Pai) e um Carro
    private Profissional tecnicoResponsavel;
    private Carro carroEmManutencao;

    // CONSTRUTOR: Exige a abstração 'Profissional'
    public OrdemDeServico(String descricao, Profissional tecnicoResponsavel, Carro carroEmManutencao) {
        this.descricao = descricao;
        this.tecnicoResponsavel = tecnicoResponsavel;
        this.carroEmManutencao = carroEmManutencao;
        this.valorOrcado = 0.0;

        System.out.println("📝 OS Registrada: " + this.descricao);
    }

    public void exibirResumoOS() {
        System.out.println("\n--- ORDEM DE SERVIÇO FIAPRIDE ---");
        System.out.println("Serviço: " + this.descricao);

        // Navegação: OS -> Profissional -> Nome
        System.out.println("Técnico: " + this.tecnicoResponsavel.getNome() + " (Reg: " + this.tecnicoResponsavel.getRegistro() + ")");

        // Navegação: OS -> Carro -> Modelo e Placa
        System.out.println("Veículo: " + this.carroEmManutencao.getModelo() + " | Placa: " + this.carroEmManutencao.getPlaca());
        System.out.println("---------------------------------\n");
    }

    // Getters para os objetos associados
    public Profissional getTecnicoResponsavel() { return tecnicoResponsavel; }
    public Carro getCarroEmManutencao() { return carroEmManutencao; }
}