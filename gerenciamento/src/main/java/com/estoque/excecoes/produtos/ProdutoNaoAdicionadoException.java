package com.estoque.excecoes.produtos;

public class ProdutoNaoAdicionadoException extends Exception {
    public ProdutoNaoAdicionadoException() {
        super("O produto não foi adicionado!");
    }
}