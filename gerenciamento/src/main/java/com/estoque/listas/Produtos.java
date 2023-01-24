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
     * @throws com.estoque.excecoes.produtos.ProdutoNaoEncontradoException
     */
    @Override
    public void removeProduto(int codigo) throws ProdutoNaoEncontradoException {
        try {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    produtos.remove(p);
                }
            }   
        } catch (Exception e) {
            throw new ProdutoNaoEncontradoException();
        }
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
                        System.out.println("Digite a quantidade atualizada do produto: ");
                        nova = entrada.nextDouble();
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
                        System.out.println("Atualize o preço do produto: ");
                        novo = entrada.nextFloat();
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
    public void addQuantidade(int codigo, int quantidade) throws ProdutoNaoEncontradoException, QuantidadeInvalidaException {
        try {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    try {
                        System.out.println("Quantas unidades você deseja adicionar ao produto? ");
                        quantidade = entrada.nextInt();
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
    public void subQuantidade(int codigo, int quantidade) throws ProdutoNaoEncontradoException, QuantidadeInvalidaException {
        try {
            for(Produto p : produtos) {
                if(p.getCodigo() == codigo) {
                    try {
                        System.out.println("Digite a quantidade que você deseja subtrair: ");
                        quantidade = entrada.nextInt();
                        double novaQuantidade = p.getQuantidade() - quantidade;
                        p.setQuantidade(novaQuantidade);
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
