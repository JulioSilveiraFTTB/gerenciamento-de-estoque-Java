package com.estoque.objetos.tiposDeProduto;

import com.estoque.objetos.Produto;

public class ProdutoUnidade extends Produto {
    private int quantidade;

    /**
     * Construtor do objeto ProdutoUnidade - produto vendido por unidade
     * 
     * @param nome
     * @param descricao
     * @param preco
     * @param quantidade
     */
    public ProdutoUnidade(String nome, String descricao, float preco, int quantidade){
        super(nome, descricao, preco);
        this.quantidade = quantidade;
    }

    /**
     * Retorna a quantidade que foi vendida do produto (em unidade)
     * 
     * @return
     */
    @Override
    public int getQuantidade(){
        return quantidade;
    }

    /**
     * Atribui a quantidade do produto (em unidades)
     * 
     * @param quantidade
     */
    @Override
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    /**
     * Retorna a string completa do produto vendido por unidadde
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
        + "Quantidade (und.): " + quantidade + "\n";
    }
}
