package com.estoque.excecoes.notas;

public class NotaFiscalInvalidaException extends Exception {
    public NotaFiscalInvalidaException() {
        super("A nota fiscal não foi encontrada!");
    }
}
