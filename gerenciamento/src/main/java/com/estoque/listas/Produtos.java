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
    private final List<Produto> produtos = new ArrayList<>();
    
    transient Scanner entrada = new Scanner(System.in);

    /** 
     * @param p
     * @throws com.estoque.excecoes.produtos.ProdutoNaoEncontradoException
     */
    @Override
    public void addProduto(Produto p) throws ProdutoNaoEncontradoException {
        try {
            if(p != null) {
                produtos.add(p);
             }  
        } catch (Exception e) {
            throw new ProdutoNaoEncontradoException();
        } 
    }
    
    /** 
     * @param codigo
     * @return 
     * @throws com.estoque.excecoes.produtos.ProdutoNaoEncontradoException
     */
    @Override
    public boolean removeProduto(int codigo) throws ProdutoNaoEncontradoException {
        try {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    produtos.remove(p);
                    return true;
                }
            }   
        } catch (Exception e) {
            throw new ProdutoNaoEncontradoException();
        }
        return false;
    }
    
    /** 
     * @param codigo
     * @return Produto
     */
    @Override
    public Produto getProduto(int codigo) throws ProdutoNaoEncontradoException {
        try {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    return p;
                }
            }
            return null;   
        } catch (Exception e) {
            throw new ProdutoNaoEncontradoException();
        }
    }
    
    /** 
     * @param codigo
     * @param nova
     */
    @Override
    public void updateQuantidade(int codigo, double nova) throws ProdutoNaoEncontradoException, QuantidadeInvalidaException {
        try {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    try {
                        p.setQuantidade(nova);   
                    } catch (Exception e) {
                        throw new QuantidadeInvalidaException();
                    }
                }
            }   
        } catch (Exception e) {
            throw new ProdutoNaoEncontradoException();
        }
    }
    
    /** 
     * @param codigo
     * @param novo
     */
    @Override
    public void updatePreco(int codigo, double novo) throws ProdutoNaoEncontradoException, PrecoInvalidoException {
        try {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    try {
                        p.setPreco(novo);   
                    } catch (Exception e) {
                        throw new PrecoInvalidoException();
                    }
                }
            }   
        } catch (Exception e) {
            throw new ProdutoNaoEncontradoException();
        }
    }

    /** 
     * @param codigo
     * @param quantidade
     */
    @Override
    public void addQuantidade(int codigo, double quantidade) throws ProdutoNaoEncontradoException, QuantidadeInvalidaException {
        try {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    try {
                        quantidade = p.getQuantidade() + quantidade;
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
}
