package com.estoque;

import com.estoque.objetos.*;
import com.estoque.objetos.enums.*;

public class App 
{
    public static void main( String[] args )
    {
        Produto produto;
        NotaFiscal nf;
        
        produto = new Produto("Água", "Teste...", 50, TipoQuantidade.KG);
        produto.setQuantidade(100);
        System.out.println(produto.toString());
    }
}
