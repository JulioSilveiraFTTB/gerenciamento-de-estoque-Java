package com.estoque.listas;

import com.estoque.excecoes.notas.NotaFiscalInvalidaException;
import com.estoque.interfaces.*;
import com.estoque.objetos.*;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class NotasFiscais implements INotasFiscais, Serializable {
    private static final long serialVersionUID = 1L;
    private final ArrayList<NotaFiscal> notasFiscais = new ArrayList<>();
    
    private Produto p;
    private Produtos produtos;

    transient Scanner entrada = new Scanner(System.in);

    @Override
    public void addNotaFiscal(NotaFiscal nf) {
        if(nf != null) {
            notasFiscais.add(nf);
        }
    }

    @Override
    public void removeNotaFiscal(int codigo) throws NotaFiscalInvalidaException {
        for(NotaFiscal nf : notasFiscais) {
            if(nf.getCodigo() == codigo) {
                notasFiscais.remove(nf);
            }
        } 
        throw new NotaFiscalInvalidaException();
    }

    @Override
    public NotaFiscal getNotaFiscal(int codigo) throws NotaFiscalInvalidaException {
        for(NotaFiscal nf : notasFiscais) {
            if(nf.getCodigo() == codigo) {
                return nf;
            }
        }
        throw new NotaFiscalInvalidaException();
    }

    @Override
    public double getTotal(int codigo) throws NotaFiscalInvalidaException {
        for (NotaFiscal notaFiscal : notasFiscais) {
            if (notaFiscal.getCodigo() == codigo) {
            double total = 0.0;
                for (Item item : notaFiscal.getItens()) {
                    total += item.getValor();
                }
                return total;
            }
        }
        throw new NotaFiscalInvalidaException();
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
    
    public List<NotaFiscal> getNotas(){
        return notasFiscais;
    }
    
    public int size() throws Exception {
        if(notasFiscais.isEmpty()) {
            throw new Exception("Lista vazia!");
        }
        return this.notasFiscais.size();
    }
}
