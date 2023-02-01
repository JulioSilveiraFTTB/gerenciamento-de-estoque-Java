package com.estoque.listas;

import com.estoque.interfaces.*;
import com.estoque.objetos.*;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class NotasFiscais implements INotasFiscais, Serializable {
    private static final long serialVersionUID = 1L;
    private final List<NotaFiscal> notasFiscais = new ArrayList<>();
    
    private Produto produto;

    transient Scanner entrada = new Scanner(System.in);

    @Override
    public void addNotaFiscal(NotaFiscal nf) {
        if(nf != null) {
            notasFiscais.add(nf);
        }
    }

    @Override
    public void removeNotaFiscal(int codigo) {
        for(NotaFiscal nf : notasFiscais) {
            if(nf.getCodigo() == codigo) {
                notasFiscais.remove(nf);
            }
        }
    }

    @Override
    public NotaFiscal getNotaFiscal(int codigo) {
        for(NotaFiscal nf : notasFiscais) {
            if(nf.getCodigo() == codigo) {
                return nf;
            }
        }
        return null;
    }

    @Override
    public double getTotal(int codigo) {
        double soma = 0;

        for(NotaFiscal nf : notasFiscais) {
            if(nf.getCodigo() == codigo) {
                List<Item> listaDeItens = nf.getItens();
                for (Item item : listaDeItens) {
                    double preco = produto.getPreco();
                    double quantidade = produto.getQuantidade();
                    soma += quantidade * preco;
                    
                    return soma;
                }
        }
    }
        return soma;
}

    @Override
    public void addItem(int codigo, Item item) {
        for(NotaFiscal nf : notasFiscais) {
            if(nf.getCodigo() == codigo) {
                List<Item> listaDeItens = nf.getItens();
                    if (item != null) {
                        listaDeItens.add(item);
                    }
            }
        }
    }

    @Override
    public void removeItem(int codigo) {
        for(NotaFiscal nf : notasFiscais) {
            if(nf.getCodigo() == codigo) {
                List<Item> listaDeItens = nf.getItens();
                    for (Item item : listaDeItens) {
                        listaDeItens.remove(item);
                    }
            }
        }
    }
}
