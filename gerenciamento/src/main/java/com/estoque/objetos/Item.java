package com.estoque.objetos;

public class Item {
    protected Produto produto;
    protected double quantidade;
    protected double valorTotal;

    /**
     * Construtor do objeto Item
     * 
     * @param produto
     */
    public Item(Produto produto, double quantidade, double valorTotal) {
        this.produto = produto;
        this.quantidade = quantidade;
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
    public void setValorTotal(double valorTotal) {
        valorTotal = produto.getPreco() * quantidade;
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
