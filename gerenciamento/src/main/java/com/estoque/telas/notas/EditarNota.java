/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.estoque.telas.notas;

import com.estoque.objetos.*;
import com.estoque.listas.NotasFiscais;
import com.estoque.telas.*;

import static com.estoque.listas.LeitorDeListas.lerLista;
import com.estoque.utils.MultiLineLabelUI;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author julio
 */
public class EditarNota extends javax.swing.JFrame {
    public NotaFiscal nf;
    public NotasFiscais notasFiscais;
    
    /**
     * Creates new form EditarNota
     * @param notasFiscais
     */
    public EditarNota(NotasFiscais notasFiscais) {
        this.notasFiscais = lerLista(notasFiscais);
        initComponents();
        jLabelItens.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonRetornarMenuProduto = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldCodigo = new com.estoque.telas.icons.JTextFieldHint(new JTextField(), "empty", "Código");
        ;
        jButtonEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelItens = new javax.swing.JLabel();

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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EDITAR NOTA");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/estoque/telas/notas/icone.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\icone.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(63, 63, 63)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
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

        jTextFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 200, 25));

        jButtonEditar.setBackground(new java.awt.Color(58, 65, 84));
        jButtonEditar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.setBorder(null);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 120, 30));

        jLabel4.setBackground(new java.awt.Color(204, 0, 0));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Informe o código da nota:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 600, 40));
        jLabelItens.setUI(MultiLineLabelUI.labelUI);
        jPanel1.add(jLabelItens, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 240, 60));

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

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        jLabelItens.setVisible(true);
        jButtonEditar.setVisible(false);
        jTextFieldCodigo.setVisible(false);
        jLabel4.setVisible(false);
        
        int codigo;
        codigo = Integer.parseInt(jTextFieldCodigo.getText());
        
        if(codigo != 0) {
            
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        //r TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

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
//            java.util.logging.Logger.getLogger(EditarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditarNota().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonRetornarMenuProduto;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelItens;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCodigo;
    // End of variables declaration//GEN-END:variables
}
