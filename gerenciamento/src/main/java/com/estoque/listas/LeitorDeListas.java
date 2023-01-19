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
    
    public static void gravarLista(Produtos p) {
        try {
            Arquivo.gravar(p, "listaDeProdutos");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

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
    
    public static void gravarLista(NotasFiscais nf) {
        try {
            Arquivo.gravar(nf, "listaDeNotasF");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
