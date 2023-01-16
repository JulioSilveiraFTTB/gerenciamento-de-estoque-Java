package com.estoque.listas;

import com.estoque.interfaces.*;
import com.estoque.objetos.*;
import com.estoque.objetos.tiposDeProduto.*;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Produtos implements IProdutos, Serializable {
    private final List<Produto> produtos = new ArrayList();
    
    Scanner entrada = new Scanner(System.in);

    @Override
    public void addProduto(Produto p) {
         if(p != null) {
            produtos.add(p);
         }
    }

    @Override
    public void removeProduto(int codigo) {
        for(Produto p : produtos) {
            if(p.getCodigo() == codigo) {
                produtos.remove(p);
            }
        }
    }

    @Override
    public Produto getProduto(int codigo) {
        for(Produto p : produtos) {
            if(p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void updateQuantidade(int codigo, float nova) {
        for(Produto p : produtos) {
            if(p.getCodigo() == codigo) {
                System.out.println("Digite a quantidade atualizada do produto: ");
                nova = entrada.nextFloat();
                p.setQuantidadeKg(nova);
            }
        }
    }

    @Override
    public void updatePreco(int codigo, float novo) {
        for(Produto p : produtos) {
            if(p.getCodigo() == codigo) {
                System.out.println("Atualize o preço do produto: ");
                novo = entrada.nextFloat();
                p.setPreco(novo);
            }
        }
    }

    @Override
    public void addQuantidade(int codigo, int quantidade) {
        for(Produto p : produtos) {
            if(p.getCodigo() == codigo) {
                System.out.println("Quantas unidades você deseja adicionar ao produto? ");
                quantidade = entrada.nextInt();
                p.setQuantidade(quantidade);
            }
        }
    }

    @Override
    public void subQuantidade(int codigo, int quantidade) {
        for(Produto p : produtos) {
            if(p.getCodigo() == codigo) {
                System.out.println("Digite a quantidade que você deseja subtrair: ");
                quantidade = entrada.nextInt();
                int novaQuantidade = p.getQuantidade() - quantidade;
                p.setQuantidade(novaQuantidade);
            }
        }
    }
}
