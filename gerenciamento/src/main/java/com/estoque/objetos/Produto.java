package com.estoque.objetos;

import com.estoque.objetos.enums.*;

import java.io.Serializable;
import java.util.Random;

public class Produto implements Serializable {
    protected Integer codigo;
    protected String nome;
    protected String descricao;
    protected double quantidade;
    // protected double quantidadeKg;
    protected double preco;
    protected TipoQuantidade tipoQuantidade;

    // Possivelmente usar ENUM para determinar o tipo de quantidade (unidade ou KG), facilitando a vida na hora de
    // manipular o atributo nas outras classes

    /**
     * Construtor do objeto Produto
     * 
     * @param nome
     * @param descricao
     * @param preco
     */
    public Produto(String nome, String descricao, double preco, double quantidade, TipoQuantidade tipoQuantidade) {
        Random random = new Random();

        this.codigo = random.nextInt(100000);
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.tipoQuantidade = tipoQuantidade;
    }

    /**
     * Retorna o código único que identifica o produto
     * 
     * @return codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Retorna o nome do produto
     * 
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Atribui um nome para o produto
     * 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a descrição do produto
     * 
     * @return descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Atribui uma descrição para o produto
     * 
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retona a quantidade do produto em questão
     * 
     * @return
     */
    public double getQuantidade() {
        return quantidade;
    }

    /**
     * Atribui a quantidade ao produto
     * 
     * @param quantidade
     */
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Retorna o valor (preço) do produto
     * 
     * @return
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Atribui um valor (preço) para o produto
     * 
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoQuantidade getTipoQuantidade() {
        return tipoQuantidade;
    }

    /**
     * Retorna a string completa do produto
     * 
     * @return
     */
    @Override
    public String toString() {
        return "Informações do produto: \n" 
        + "Código: " + codigo + "\n"
        + "Nome: " + nome + "\n"
        + "Descrição: " + descricao + "\n"
        + "Preço: " + preco + "\n"
        + "Quantidade " + "(" + getTipoQuantidade() + ")" + ": " + quantidade;
    }
}
