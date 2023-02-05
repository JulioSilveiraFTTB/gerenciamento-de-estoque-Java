/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.estoque.telas.notas;

import com.estoque.excecoes.produtos.ProdutoNaoEncontradoException;
import com.estoque.objetos.*;
import com.estoque.listas.LeitorDeListas;
import com.estoque.listas.NotasFiscais;
import com.estoque.listas.Produtos;
import com.estoque.telas.*;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class CriarNota extends javax.swing.JFrame {
    private NotaFiscal nf;
    private NotasFiscais notasFiscais;
    private Produto p;
    private Produtos produtos;
    private Item item;
    
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    /**
     * Creates new form CriarNota
     * @param notasFiscais
     */
    public CriarNota(NotasFiscais notasFiscais) {
        this.notasFiscais = LeitorDeListas.lerLista(notasFiscais);
        this.produtos = LeitorDeListas.lerLista(produtos);
        initComponents();

        // seta a dataEmissao como a data local do momento em que está sendo criada a nota
        LocalDate dataEmissao = LocalDate.now();
        // instancia uma nova NotaFiscal
        nf = new NotaFiscal(dataEmissao);
        dataEmissao = nf.getDataEmissao();

        // seta os campos do código e da data com os valores recuperados do objeto NotaFiscal que foi criado
        jTextFieldCodigo.setText(Integer.toString(nf.getCodigo()));
        jTextFieldData.setText(dtf.format(dataEmissao));
        // instancia uma nova ArrayList de itens da nota
        ArrayList<Item> itens;
        // atribui os itens usando o método getItens da nota (nesse ponto, a lista está vazia
        itens = nf.getItens();

        // cria um novo modelo de ComboBox
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();

        // try-catch para confirmar se a lista de produtos possui registros ou não
        try {
            // laço for para percorrer a lista de produtos inteira e adicionar os objetos da lista no modelo
            // do ComboBox
            for (int i = 0; i < produtos.size(); i++) {
                // dcbm.addElement(produtos.getCodigoENome());
                // recupera o nome dos produtos da lista e adiciona no ComboBox
                dcbm.addElement(produtos.getProdutos().get(i).getNome());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        // adiciona o modelo de ComboBox criado no ComboBox inseirod na tela
        jComboBoxProdutos.setModel(dcbm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonRetornarMenuProduto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodigo = new com.estoque.telas.icons.JTextFieldHint(new JTextField(), "empty", "Código");
        ;
        jButtonSalvar = new javax.swing.JButton();
        jComboBoxProdutos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextFieldData = new com.estoque.telas.icons.JTextFieldHint(new JTextField(), "empty", "Data de emissão");
        ;

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/estoque/telas/notas/icone.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\icone.png")); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADASTRAR NOTA FISCAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        jButtonRetornarMenuProduto.setBackground(new java.awt.Color(217, 81, 51));
        jButtonRetornarMenuProduto.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonRetornarMenuProduto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRetornarMenuProduto.setText("Retornar");
        jButtonRetornarMenuProduto.setToolTipText("");
        jButtonRetornarMenuProduto.setBorder(null);
        jButtonRetornarMenuProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRetornarMenuProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRetornarMenuProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRetornarMenuProdutoMouseExited(evt);
            }
        });
        jButtonRetornarMenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetornarMenuProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRetornarMenuProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 250, 40));

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Preencha as informações da nota:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 600, 40));

        jTextFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 200, 25));

        jButtonSalvar.setBackground(new java.awt.Color(58, 65, 84));
        jButtonSalvar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBorder(null);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 250, 40));

        jComboBoxProdutos.setBackground(new java.awt.Color(235, 235, 235));
        jComboBoxProdutos.setForeground(new java.awt.Color(60, 63, 65));
        jComboBoxProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProdutosActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 200, 30));

        jButton1.setBackground(new java.awt.Color(58, 65, 84));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Adicionar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 90, 30));

        jTextFieldData.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldData.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(jTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 200, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetornarMenuProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRetornarMenuProdutoMouseEntered
        jButtonRetornarMenuProduto.setBackground(new Color(235,235,235));
        jButtonRetornarMenuProduto.setForeground(new Color(217,81,51));
    }//GEN-LAST:event_jButtonRetornarMenuProdutoMouseEntered

    private void jButtonRetornarMenuProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRetornarMenuProdutoMouseExited
        jButtonRetornarMenuProduto.setBackground(new Color(217,81,51));
        jButtonRetornarMenuProduto.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonRetornarMenuProdutoMouseExited

    private void jButtonRetornarMenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetornarMenuProdutoActionPerformed
        new MenuNotas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRetornarMenuProdutoActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // cria os atributos necessários para as operações de salvar a nf
        int codigo;
        LocalDate dataDeEmissao;
        Item itens;
        double valorTotal = 0;

        // se os campos estiverem vazios, entra no if
        if (jTextFieldCodigo.getText() != "" && jTextFieldData.getText() != "") {
            // seta o codigo e a dataDeEmissao com os valores recuperados dos campos
            codigo = Integer.parseInt(jTextFieldCodigo.getText());
            dataDeEmissao = LocalDate.now();
            
            System.out.println(nf.toString());

            // se a nf não for nula, entra no if
            if (nf != null) {
                // adiciona a nf criada na lista de notas
                this.notasFiscais.addNotaFiscal(nf);
                // try-catch para confirmar que a nf existe (de acordo com o código)
                try {
                    // atribui o valorTotal utilizando o método getTotal que soma o preço de todos os
                    // itens inseridos na arraylist de itens da nota
                    valorTotal = notasFiscais.getTotal(codigo);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                // grava a lista de notas no arquivo .bin, salvando a nota criada
                LeitorDeListas.gravarLista(notasFiscais);
                JOptionPane.showMessageDialog(null, "Nota fiscal criada! \n" + "O valor total é: " + valorTotal);   
            }
        }

        // cria uma nova nota e já atribui o seu código e data nos campos para, caso seja da vontade do usuário,
        // já adicionar outra nota
        NotaFiscal nf1 = new NotaFiscal(dataDeEmissao = LocalDate.now());
        jTextFieldCodigo.setText(Integer.toString(nf1.getCodigo()));    
        jTextFieldData.setText(dtf.format(dataDeEmissao));
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        //r TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // atributos necessários para salvar o item em questão na arraylist
        double valor = 0;
        double valorTotal = 0;
        ArrayList<Item> itens = nf.getItens();

        // try-catch para confirmar que o produto selecionado no ComboBox existe
        try {
            // atribui um nome de acordo com a opção selecionada no ComboBox
            String nome = jComboBoxProdutos.getItemAt(jComboBoxProdutos.getSelectedIndex());

            // laço for que percorre a lista completa de produtos
            for (int i = 0; i < produtos.size(); i++) {
                // se o nome do produto selecionado no ComboBox for igual ao nome de um objeto produto
                // registrado na lista de produtos, retorna o mesmo e o seu valor
                if (produtos.getProdutos().get(i).getNome().equals(nome)) {
                    // recupera o produto de acordo com nome
                    p = produtos.get(nome);
                    // atribui o preço do produto no atributo 'valor'
                    valor = produtos.getProdutos().get(i).getPreco() * produtos.getProdutos().get(i).getQuantidade();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        // calcula o valorTotal da nota ao somar o valorTotal = 0 + o valor do produto em questão
        // repete o processo para todos os produtos adicionados
        valorTotal = valorTotal + valor;
        // instância um novo item usando como parâmetro o produto p e o valorTotal
        item = new Item(p, valorTotal);

        // try-catch para confirmar se o item foi adicionado na lista
        try {
            // adiciona o novo item na lista de itens da nota
            itens.add(item);
            JOptionPane.showMessageDialog(rootPane, "Item adicionado com sucesso!");    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O item não foi adicionado!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProdutosActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CriarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CriarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CriarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CriarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CriarNota().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRetornarMenuProduto;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxProdutos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldData;
    // End of variables declaration//GEN-END:variables
}
