package com.estoque;

import com.estoque.objetos.*;

public class App 
{
    public static void main( String[] args )
    {
        Produto produto;
        
        produto = new Produto("Teste", "Apenas testando...", 10);
        System.out.println(produto.toString());
    }
}
