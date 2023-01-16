package com.estoque.objetos.tiposDeProduto;

import com.estoque.objetos.Produto;

public class ProdutoKG extends Produto {
    private float quantidadeKg;

    /**
     * Construtor do objeto ProdutoKG - produto vendido por quilo 
     * 
     * @param nome
     * @param descricao
     * @param preco
     * @param quantidade
     */
    public ProdutoKG(String nome, String descricao, float preco, float quantidadeKg){
        super(nome, descricao, preco);
        this.quantidadeKg = quantidadeKg;
    }

    /**
     * Retorna a quantidade do produto que foi vendida (em KG)
     * 
     * @return
     */
    @Override
    public float getQuantidadeKg(){
        return quantidadeKg;
    }

    /**
     * Atribui a quantidade do produto (em KG)
     * 
     * @param quantidade
     */
    @Override
    public void setQuantidadeKg(float quantidadeKg){
        this.quantidadeKg = quantidadeKg;
    }

    /**
     * Retorna a string completa do produto vendido por quilo
     * 
     * @return
     */
    @Override
    public String toString(){
        return "Informações do produto \n" 
        + "Código: " + codigo + "\n"
        + "Nome: " + nome + "\n"
        + "Descrição: " + descricao + "\n"
        + "Preço: " + preco + "\n"
        + "Quantidade (KG): " + quantidade + "\n";
    }
}
