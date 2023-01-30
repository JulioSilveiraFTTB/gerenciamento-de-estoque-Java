package com.estoque.objetos;

import java.io.Serializable;

public class Item implements Serializable {
    private static final long serialVersionUID = 100L;
    protected Produto produto;
    protected double valorTotal;

    /**
     * Construtor do objeto Item
     * 
     * @param produto
     */
    public Item(Produto produto, double valorTotal) {
        this.produto = produto;
        this.valorTotal = valorTotal;
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
     * Retorna o valor total (preço) dos produtos selecionados
     * 
     * @return
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Atribui o valor total (preço) dos produtos
     * 
     * @param valorTotal
     */
    public void setValorTotal(double valorTotal, double quantidade) {
        valorTotal = produto.getPreco() * quantidade;
    }
    
    /** 
     * Retorna a string completa do item
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "Produto: " + produto + "\n";
    }
}
