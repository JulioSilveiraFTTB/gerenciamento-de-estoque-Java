package com.estoque.objetos;

public class Item {
    protected Produto produto;
    protected double quantidade;

    /**
     * Construtor do objeto Item
     * 
     * @param produto
     */
    public Item(Produto produto, double quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
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
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString(){
        return "Informações do item + \n"
        + "Produto: " + produto + "\n"
        + "Quantidade: " + quantidade + "\n";
    }
}
