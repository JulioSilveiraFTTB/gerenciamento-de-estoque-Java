package com.estoque.excecoes.produtos;

public class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException() {
        super("O preço informado é inválido!");
    }
}
