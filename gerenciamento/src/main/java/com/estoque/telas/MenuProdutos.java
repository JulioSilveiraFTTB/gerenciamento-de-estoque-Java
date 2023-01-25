package com.estoque.telas;

import com.estoque.listas.Produtos;
import com.estoque.telas.produto.CadastrarProduto;
import com.estoque.telas.produto.ConsultarProduto;
import com.estoque.telas.produto.EditarProduto;
import com.estoque.telas.produto.RemoverProduto;

import static com.estoque.listas.LeitorDeListas.lerLista;

import java.awt.Color;
import java.awt.Point;

// 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

/**
 *
 * @author julio
 */
public class MenuProdutos extends javax.swing.JFrame {
    private final Point point = new Point();
    
    private Produtos produtos = new Produtos();

    /**
     * Creates new form TelaInicial
     * @param produtos
     */  
    public MenuProdutos(Produtos produtos) {
        this.produtos = lerLista(this.produtos);
        initComponents();     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jButtonSair1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonRetornar = new javax.swing.JButton();
        jButtonCadastrarProduto = new javax.swing.JButton();
        jButtonRemoverProduto = new javax.swing.JButton();
        jButtonConsultarProduto = new javax.swing.JButton();
        jButtonEditarProduto = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jButtonSair.setBackground(new java.awt.Color(217, 81, 51));
        jButtonSair.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("Sair");
        jButtonSair.setBorder(null);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSairMouseExited(evt);
            }
        });
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonSair1.setBackground(new java.awt.Color(217, 81, 51));
        jButtonSair1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonSair1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair1.setText("Sair");
        jButtonSair1.setBorder(null);
        jButtonSair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSair1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSair1MouseExited(evt);
            }
        });
        jButtonSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSair1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de estoque");
        setForeground(java.awt.Color.black);
        setIconImages(null);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

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
        jLabel2.setText("PRODUTOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        jButtonRetornar.setBackground(new java.awt.Color(217, 81, 51));
        jButtonRetornar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButtonRetornar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRetornar.setText("Retornar para o menu principal");
        jButtonRetornar.setToolTipText("");
        jButtonRetornar.setBorder(null);
        jButtonRetornar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRetornar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRetornarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRetornarMouseExited(evt);
            }
        });
        jButtonRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetornarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 250, 40));

        jButtonCadastrarProduto.setBackground(new java.awt.Color(58, 65, 84));
        jButtonCadastrarProduto.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonCadastrarProduto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarProduto.setText("Cadastrar");
        jButtonCadastrarProduto.setToolTipText("");
        jButtonCadastrarProduto.setBorder(null);
        jButtonCadastrarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCadastrarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCadastrarProdutoMouseExited(evt);
            }
        });
        jButtonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 250, 40));

        jButtonRemoverProduto.setBackground(new java.awt.Color(58, 65, 84));
        jButtonRemoverProduto.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonRemoverProduto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoverProduto.setText("Remover");
        jButtonRemoverProduto.setToolTipText("");
        jButtonRemoverProduto.setBorder(null);
        jButtonRemoverProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoverProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRemoverProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRemoverProdutoMouseExited(evt);
            }
        });
        jButtonRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemoverProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 250, 40));

        jButtonConsultarProduto.setBackground(new java.awt.Color(58, 65, 84));
        jButtonConsultarProduto.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonConsultarProduto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarProduto.setText("Consultar");
        jButtonConsultarProduto.setToolTipText("");
        jButtonConsultarProduto.setBorder(null);
        jButtonConsultarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultarProdutoMouseExited(evt);
            }
        });
        jButtonConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConsultarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 250, 40));

        jButtonEditarProduto.setBackground(new java.awt.Color(58, 65, 84));
        jButtonEditarProduto.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonEditarProduto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarProduto.setText("Editar");
        jButtonEditarProduto.setToolTipText("");
        jButtonEditarProduto.setBorder(null);
        jButtonEditarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEditarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEditarProdutoMouseExited(evt);
            }
        });
        jButtonEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 250, 40));

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

    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        //r TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
        
    }//GEN-LAST:event_formMouseDragged

    private void jButtonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetornarActionPerformed
        new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRetornarActionPerformed

    private void jButtonRetornarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRetornarMouseExited
       jButtonSair.setBackground(new Color(217,81,51));
        jButtonSair.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonRetornarMouseExited

    private void jButtonRetornarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRetornarMouseEntered
        jButtonSair.setBackground(new Color(235,235,235));
        jButtonSair.setForeground(new Color(217,81,51));
    }//GEN-LAST:event_jButtonRetornarMouseEntered

    private void jButtonCadastrarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarProdutoMouseEntered
        jButtonCadastrarProduto.setBackground(new Color(235, 235, 235));
        jButtonCadastrarProduto.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButtonCadastrarProdutoMouseEntered

    private void jButtonCadastrarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarProdutoMouseExited
        jButtonCadastrarProduto.setBackground(new Color(58,65,84));
        jButtonCadastrarProduto.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonCadastrarProdutoMouseExited

    private void jButtonCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarProdutoActionPerformed
        new CadastrarProduto(this.produtos).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCadastrarProdutoActionPerformed

    private void jButtonSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseEntered
        jButtonSair.setBackground(new Color(235,235,235));
        jButtonSair.setForeground(new Color(217,81,51));
    }//GEN-LAST:event_jButtonSairMouseEntered

    private void jButtonSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseExited
        jButtonSair.setBackground(new Color(217,81,51));
        jButtonSair.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonSairMouseExited

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSair1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSair1MouseEntered
        jButtonSair.setBackground(new Color(235,235,235));
        jButtonSair.setForeground(new Color(217,81,51));
    }//GEN-LAST:event_jButtonSair1MouseEntered

    private void jButtonSair1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSair1MouseExited
        jButtonSair.setBackground(new Color(217,81,51));
        jButtonSair.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonSair1MouseExited

    private void jButtonSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSair1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSair1ActionPerformed

    private void jButtonRemoverProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemoverProdutoMouseEntered
        jButtonRemoverProduto.setBackground(new Color(235, 235, 235));
        jButtonRemoverProduto.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButtonRemoverProdutoMouseEntered

    private void jButtonRemoverProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemoverProdutoMouseExited
        jButtonRemoverProduto.setBackground(new Color(58,65,84));
        jButtonRemoverProduto.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonRemoverProdutoMouseExited

    private void jButtonRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverProdutoActionPerformed
        new RemoverProduto(this.produtos).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRemoverProdutoActionPerformed

    private void jButtonConsultarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarProdutoMouseEntered
        jButtonConsultarProduto.setBackground(new Color(235, 235, 235));
        jButtonConsultarProduto.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButtonConsultarProdutoMouseEntered

    private void jButtonConsultarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarProdutoMouseExited
        jButtonConsultarProduto.setBackground(new Color(58,65,84));
        jButtonConsultarProduto.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonConsultarProdutoMouseExited

    private void jButtonConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarProdutoActionPerformed
        new ConsultarProduto(this.produtos).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConsultarProdutoActionPerformed

    private void jButtonEditarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarProdutoMouseEntered
        jButtonEditarProduto.setBackground(new Color(235, 235, 235));
        jButtonEditarProduto.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButtonEditarProdutoMouseEntered

    private void jButtonEditarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarProdutoMouseExited
        jButtonEditarProduto.setBackground(new Color(58,65,84));
        jButtonEditarProduto.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonEditarProdutoMouseExited

    private void jButtonEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarProdutoActionPerformed
        new EditarProduto().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEditarProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
    // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        // try {
        //    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        //        if ("".equals(info.getName())) {
        //            javax.swing.UIManager.setLookAndFeel(info.getClassName());
        //            break;
        //        }
        //    }
        //} catch (ClassNotFoundException ex) {
        //    java.util.logging.Logger.getLogger(MenuProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (InstantiationException ex) {
        //    java.util.logging.Logger.getLogger(MenuProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (IllegalAccessException ex) {
        //    java.util.logging.Logger.getLogger(MenuProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (javax.swing.UnsupportedLookAndFeelException ex) {
        //    java.util.logging.Logger.getLogger(MenuProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //}
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    //    java.awt.EventQueue.invokeLater(new Runnable() {
    //        public void run() {
    //            new MenuProdutos(this.p).setVisible(true);
    //        }
    //    });
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarProduto;
    private javax.swing.JButton jButtonConsultarProduto;
    private javax.swing.JButton jButtonEditarProduto;
    private javax.swing.JButton jButtonRemoverProduto;
    private javax.swing.JButton jButtonRetornar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSair1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
