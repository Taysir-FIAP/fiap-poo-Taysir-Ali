package br.com.fiapride.model;

// 'extends' estabelece que Mecanico herda tudo de Profissional
public class Mecanico extends Profissional {

    private String especialidadeMotor;

    public Mecanico(String nome, String registro, double valorHora, String especialidadeMotor) {
        // super() envia os dados base para o construtor da Superclasse (Profissional)
        super(nome, registro, valorHora);
        this.especialidadeMotor = especialidadeMotor;
    }

    public String getEspecialidadeMotor() {
        return especialidadeMotor;
    }
}