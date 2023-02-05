package com.estoque.objetos;

import java.io.Serializable;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NotaFiscal implements Serializable {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final long serialVersionUID = 10L;
    
    protected Integer codigo;
    protected final LocalDate dataEmissao;
    protected ArrayList<Item> itens = new ArrayList<>();

    /**
     * Construtor do objeto Nota Fiscal
     * 
     * @param dataEmissao
     */
    public NotaFiscal(LocalDate dataEmissao) {
        Random random = new Random();

        this.codigo = random.nextInt(100000);
        this.dataEmissao = LocalDate.now();
        this.itens = itens;
    }

    /**
     * Retorna o código da nota fiscal
     * 
     * @return
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Retorna a data de emissão da nota
     * 
     * @return
     */
    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Retorna a lista com os itens da nota
     * 
     * @return
     */
    public ArrayList<Item> getItens() {
        return itens;
    }

    /**
     * Atribui os itens da lista
     * 
     * @param itens
     */
    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    /**
     * Retorna a string completa do produto
     * 
     * @return
     */
    @Override
    public String toString() {
        return "Código: " + codigo + "\n"
        + "Data de emissão: " + dtf.format(dataEmissao) + "\n"
        + "Relação de items: " + itens.toString() + "\n";
        
    }
}
