package com.estoque.objetos;

import java.io.Serializable;

public class Item implements Serializable {
    private static final long serialVersionUID = 100L;
    protected Produto produto;
    protected double valor;

    /**
     * Construtor do objeto Item
     * 
     * @param produto
     */
    public Item(Produto produto, double valorTotal) {
        this.produto = produto;
        this.valor = valor;
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
    public double getValor() {
        return valor = getProduto().getPreco();
    }
    
    /** 
     * Retorna a string completa do item
     * 
     * @return String
     */
    @Override
    public String toString() {
        return produto.toStringItem();
    }
}
