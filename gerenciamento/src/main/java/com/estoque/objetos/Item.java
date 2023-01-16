package com.estoque.objetos;

public class Item {
    private Produto produto;

    /**
     * Construtor do objeto Item
     * 
     * @param produto
     */
    public Item(Produto produto){
        this.produto = produto;
    }

    /**
     * Retorna o produto que foi vendido
     * 
     * @return
     */
    public Produto getProduto(){
        return produto;
    }

    /**
     * Atribui um produto para o objeto Item
     * 
     * @param produto
     */
    public void setProduto(Produto produto){
        this.produto = produto;
    }

    
    @Override
    public String toString(){
        return "Informações do item + \n"
        + "Produto: " + produto + "\n";
    }
}
