package com.estoque.objetos;

import java.io.Serializable;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NotaFiscal implements Serializable {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Integer codigo;
    private final LocalDate dataEmissao;
    private List<Item> itens;

    /**
     * Construtor do objeto Nota Fiscal
     * 
     * @param dataEmissao
     * @param relacaoItem
     */
    public NotaFiscal(LocalDate dataEmissao, Item relacaoItem){
        Random random = new Random();

        this.codigo = random.nextInt(100000);
        this.dataEmissao = LocalDate.now();
        this.itens = new ArrayList<Item>();
    }

    /**
     * 
     * @return
     */
    public Integer getCodigo(){
        return codigo;
    }

    /**
     * 
     * @return
     */
    public LocalDate getDataEmissao(){
        return dataEmissao;
    }

    /**
     * 
     * @return
     */
    public List<Item> getItens(){
        return itens;
    }

    /**
     * 
     * @param itens
     */
    public void setItens(List<Item> itens){
        this.itens = itens;
    }

    /**
     * Retorna a string completa do produto
     * 
     * @return
     */
    @Override
    public String toString(){
        return "Informações da NF: \n" 
        + "Código: " + codigo + "\n"
        + "Data de emissão: " + dtf.format(dataEmissao) + "\n"
        + "Relação de items: " + itens + "\n";
    }
}
