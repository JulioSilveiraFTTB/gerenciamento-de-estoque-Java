package com.estoque.listas;

import com.estoque.interfaces.*;
import com.estoque.objetos.*;
import com.estoque.excecoes.produtos.*;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Produtos implements IProdutos, Serializable {
    private static final long serialVersionUID = -2030569513222902039L;
    private final ArrayList<Produto> produtos = new ArrayList<>();
    
    transient Scanner entrada = new Scanner(System.in);

    /** 
     * @param p
     * @throws com.estoque.excecoes.produtos.ProdutoNaoEncontradoException
     */
    @Override
    public void addProduto(Produto p) {
        if(p != null) {
            produtos.add(p);
        } 
    }
    
    /** 
     * @param codigo
     * @return 
     * @throws com.estoque.excecoes.produtos.ProdutoNaoEncontradoException
     */
    @Override
    public boolean removeProduto(int codigo) {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    produtos.remove(p);
                    return true;
                } 
            } return false;
    }
    
    /** 
     * @param codigo
     * @return Produto
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
     * @param codigo
     * @param nova
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
     * @param codigo
     * @param novo
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
     * @param codigo
     * @param quantidade
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
     * @param codigo
     * @param quantidade
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
        } catch (Exception e) {
            throw new ProdutoNaoEncontradoException();
        }
    }
    
    public int size() throws Exception {
        if(produtos.size() == 0) {
            throw new Exception("Lista vazia!");
        }
        return this.produtos.size();
    }
    
    public List<Produto> getProdutos(){
        return produtos;
    }
    
    public String getCodigoENome() throws ProdutoNaoEncontradoException {
        for(Produto p : produtos) {
                return p.getCodigo() + " | " + p.getNome();
        } throw new ProdutoNaoEncontradoException();
    }
    
    public Produto get(String nome) throws ProdutoNaoEncontradoException {
        for(Produto p : produtos) {
            if(p.getNome().equals(nome)){
               return p;
            }
        } throw new ProdutoNaoEncontradoException();
    }
    
    
}
