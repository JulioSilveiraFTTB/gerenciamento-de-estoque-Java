/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estoque.listas;

import com.estoque.utils.*;

/**
 *
 * @author julio
 */
public class LeitorDeListas {

    /**
     * Método para realizar a leitura do arquivo listaDeProdutos.bin e recuperar todos os produtos registrados no arquivo.
     *
     * @param p
     * @throws java.lang.Exception Lança exceção quando o arquivo não existe/não foi encontrado.
     */
    public static Produtos lerLista(Produtos p) {
        try {
            Object obj;
            obj = Arquivo.ler("listaDeProdutos");
            p = (Produtos) obj;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return p;
    }

    /**
     * Método para gravar novos produtos no arquivo listaDeProdutos.
     *
     * @param p
     * @throws java.lang.Exception Lança exceção quando não é possível salvar o arquivo.
     */
    public static void gravarLista(Produtos p) {
        try {
            Arquivo.gravar(p, "listaDeProdutos");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Método para realizar a leitura do arquivo listaDeNotasF e recuperar as notas fiscais criadas.
     *
     * @param nf
     * @throws java.lang.Exception Lança exceção quando o arquivo não existe/não foi encontrado.
     */
    public static NotasFiscais lerLista(NotasFiscais nf) {
        try {
            Object obj;
            obj = Arquivo.ler("listaDeNotasF");
            nf = (NotasFiscais) obj;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return nf;
    }

    /**
     * Método para gravar novas notas fiscais no arquivo listaDeNotas.
     *
     * @param nf
     * @throws java.lang.Exception Lança exceção quando não é possível salvar o arquivo.
     */
    public static void gravarLista(NotasFiscais nf) {
        try {
            Arquivo.gravar(nf, "listaDeNotasF");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
