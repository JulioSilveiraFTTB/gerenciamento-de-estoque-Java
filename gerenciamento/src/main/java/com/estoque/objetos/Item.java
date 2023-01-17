package com.estoque.objetos;

public class Item {
    protected Produto produto;
    protected double quantidade;

    /**
     * Construtor do objeto Item
     * 
     * @param produto
     */
    public Item(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /**
     * Retorna o produto que foi vendido
     * 
     * @return
     */
    public Produto getProduto() {
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
    
    /** 
     * Retorna a quantidade do produto
     * 
     * @return double
     */
    public double getQuantidade() {
        return quantidade;
    }
    
    /** 
     * Atribui a quantidade do produto
     * 
     * @param quantidade
     */
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    /** 
     * Retorna a string completa do item
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "Informações do item + \n"
        + "Produto: " + produto + "\n"
        + "Quantidade: " + quantidade + "\n";
    }
}
