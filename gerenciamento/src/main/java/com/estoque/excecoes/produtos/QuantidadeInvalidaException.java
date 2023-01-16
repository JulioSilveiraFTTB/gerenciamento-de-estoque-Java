package com.estoque.excecoes.produtos;

public class QuantidadeInvalidaException extends Exception {
    public QuantidadeInvalidaException() {
        super("A quantidade informada não é válida!");
    }    
}
