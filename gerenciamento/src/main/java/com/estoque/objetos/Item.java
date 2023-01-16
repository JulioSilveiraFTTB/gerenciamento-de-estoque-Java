package com.estoque.objetos;

public class Item {
    private Produto produto;

    public Item(Produto produto){
        this.produto = produto;
    }

    public Produto getProduto(){
        return produto;
    }

    public Produto setProduto(Produto produto){
        return this.produto = produto;
    }
}
