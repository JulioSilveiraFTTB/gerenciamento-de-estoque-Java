package com.estoque.listas;

import com.estoque.excecoes.notas.NotaFiscalInvalidaException;
import com.estoque.interfaces.*;
import com.estoque.objetos.*;
import com.estoque.excecoes.produtos.*;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author julio
 */
public class Produtos implements IProdutos, Serializable {
    private static final long serialVersionUID = -2030569513222902039L;
    private final ArrayList<Produto> produtos = new ArrayList<>();
    
    transient Scanner entrada = new Scanner(System.in);

    /**
     * Adiciona um produto à lista de produtos.
     * @param p
     */
    @Override
    public void addProduto(Produto p) {
        if(p != null) {
            produtos.add(p);
        }
    }

    /**
     * Remove o produto (de acordo com o código) da lista.
     * @param codigo
     * @throws ProdutoNaoEncontradoException Lança exceção quando o código informado não estiver registrado com um produto.
     */
    @Override
    public boolean removeProduto(int codigo) throws ProdutoNaoEncontradoException {
        try {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    produtos.remove(p);
                    return true;
                } 
            } return false;
        } catch (Exception ex) {
            throw new ProdutoNaoEncontradoException();
        }   
    }

    /**
     * Retorna o objeto produto (de acordo com o código informado).
     * @param codigo
     * @throws ProdutoNaoEncontradoException Lança exceção quando o código informado não estiver registrado com um produto.
     */
    @Override
    public Produto getProduto(int codigo) throws ProdutoNaoEncontradoException {
        for(Produto p : produtos) {
            if(p.getCodigo() == codigo) {
                return p;
            }
        } throw new ProdutoNaoEncontradoException();
    }
    
    /**
     * Atualiza a quantidade de um determinado produto (de acordo com o código informado).
     * @param codigo
     * @param nova
     * @throws NumberFormatException Lança exceção se o número inserido for inválido.
     */
    @Override
    public void updateQuantidade(int codigo, double nova) throws NumberFormatException {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    p.setQuantidade(nova);   
                }
            } throw new NumberFormatException();
    }

    /**
     * Atualiza o preço de um determinado produto (de acordo com o código informado).
     * @param codigo
     * @param novo
     * @throws NumberFormatException Lança exceção se o número inserido for inválido.
     */
    @Override
    public void updatePreco(int codigo, double novo) throws NumberFormatException {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                        p.setPreco(novo);   
                    }
            } throw new NumberFormatException();
    }

    /**
     * Adiciona um número (quantidade) a quantidade já existente de um determinado produto (de acordo com o código informado).
     * @param codigo
     * @param quantidade
     * @throws NumberFormatException Lança exceção se o número inserido for inválido.
     */
    @Override
    public void addQuantidade(int codigo, double quantidade) throws NumberFormatException {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                        quantidade = p.getQuantidade() + quantidade;
                        p.setQuantidade(quantidade);   
                    }
                } throw new NumberFormatException();
    }
    
    /**
     * Diminui um valor da quantidade do produto (de acordo com o código informado).
     * @param codigo
     * @param quantidade
     * @throws ProdutoNaoEncontradoException Lança a exceção se o código informado não estiver registrado com um produto.
     * @throws QuantidadeInvalidaException Lança uma exceção se a quantidade informada for inválida.
     */
    @Override
    public void subQuantidade(int codigo, double quantidade) throws ProdutoNaoEncontradoException, QuantidadeInvalidaException {
        try {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    try {
                        quantidade = p.getQuantidade() - quantidade;
                        p.setQuantidade(quantidade);
                    } catch (Exception e) {
                        throw new QuantidadeInvalidaException();
                    }
                }
            }   
        } catch (Exception ex) {
            throw new ProdutoNaoEncontradoException();
        }
    }

    /**
     * Retorna a lista de produtos.
     *
     * @return produtos
     */
    public List<Produto> getProdutos(){
        return produtos;
    }

    /**
     * Retorna o tamanho da lista de produtos.
     *
     * @return produtos.size()
     * @throws java.lang.Exception Lança exceção se a lista de produtos estiver vazia.
     */
    public int size() throws Exception {
        if(produtos.isEmpty()) {
            throw new Exception("Lista vazia!");
        }
        return this.produtos.size();
    }

    /**
     * Retorna o objeto produto (de acordo com o nome informado).
     * @param nome
     * @throws ProdutoNaoEncontradoException Lança exceção quando o código informado não estiver registrado com um produto.
     */
    public Produto get(String nome) throws ProdutoNaoEncontradoException {
        for(Produto p : produtos) {
            if(p.getNome().equals(nome)){
               return p;
            }
        } throw new ProdutoNaoEncontradoException();
        
    }
}
