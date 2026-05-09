package br.com.fiapride.model;

public interface Documentavel {
    // Contrato: define O QUE deve ser feito, mas não COMO.
    boolean validarDocumentacao();

    // Constante de interface (Padrão: public static final)
    String ALERTA_SEGURANCA = "⚠️ ATENÇÃO: Documentação pendente!";
}