package com.estoque.excecoes.produtos;

public class ProdutoNaoEncontradoException extends Exception {
    public ProdutoNaoEncontradoException() {
        super("O produto não foi encontrado!");
    }
}
