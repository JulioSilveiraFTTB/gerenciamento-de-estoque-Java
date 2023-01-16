package com.estoque.objetos;

import java.io.Serializable;
import java.util.Random;

public class Produto implements Serializable {
    protected Integer codigo;
    protected String nome;
    protected String descricao;
    protected float preco;

    /**
     * Construtor do objeto Produto
     * 
     * @param nome
     * @param descricao
     * @param preco
     */
    public Produto(String nome, String descricao, float preco){
        Random random = new Random();

        this.codigo = random.nextInt(100000);
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * Retorna o código único que identifica o produto
     * 
     * @return codigo
     */
    public Integer getCodigo(){
        return codigo;
    }

    /**
     * Retorna o nome do produto
     * 
     * @return nome
     */
    public String getNome(){
        return nome;
    }

    /**
     * Atribui um nome para o produto
     * 
     * @param nome
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Retorna a descrição do produto
     * 
     * @return descricao
     */
    public String getDescricao(){
        return descricao;
    }

    /**
     * Atribui uma descrição para o produto
     * 
     * @param descricao
     */
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    /**
     * Retorna o valor (preço) do produto
     * 
     * @return
     */
    public float getPreco(){
        return preco;
    }

    /**
     * Atribui um valor (preço) para o produto
     * 
     * @param preco
     */
    public void setPreco(float preco){
        this.preco = preco;
    }

    /**
     * Retorna a string completa do produto
     * 
     * @return
     */
    @Override
    public String toString(){
        return "Informações do produto: \n" 
        + "Código: " + codigo + "\n"
        + "Nome: " + nome + "\n"
        + "Descrição: " + descricao + "\n"
        + "Preço: " + preco + "\n";
    }
}
