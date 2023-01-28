package com.estoque.telas;

import com.estoque.listas.*;

import java.awt.Color;
import java.awt.Point;

// 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

/**
 *
 * @author julio
 */
public class Menu extends javax.swing.JFrame {
    private final Point point = new Point();

    private Produtos produtos = new Produtos();
    private NotasFiscais notasFiscais = new NotasFiscais();
    
    /**
     * Creates new form TelaInicial
     */  
    public Menu() {
        this.produtos = LeitorDeListas.lerLista(produtos);
        this.notasFiscais = LeitorDeListas.lerLista(notasFiscais);
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
        jLabel1 = new javax.swing.JLabel();
        jButtonRetornar = new javax.swing.JButton();
        jButtonProduto1 = new javax.swing.JButton();
        jButtonNF1 = new javax.swing.JButton();

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
        jLabel2.setText("GERENCIAMENTO DE ESTOQUE");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jButtonRetornar.setBackground(new java.awt.Color(217, 81, 51));
        jButtonRetornar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonRetornar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRetornar.setText("Encerrar sessão");
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

        jButtonProduto1.setBackground(new java.awt.Color(58, 65, 84));
        jButtonProduto1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonProduto1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProduto1.setText("Produtos");
        jButtonProduto1.setToolTipText("");
        jButtonProduto1.setBorder(null);
        jButtonProduto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonProduto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonProduto1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonProduto1MouseExited(evt);
            }
        });
        jButtonProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProduto1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonProduto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 250, 40));

        jButtonNF1.setBackground(new java.awt.Color(58, 65, 84));
        jButtonNF1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonNF1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNF1.setText("Notas Fiscais");
        jButtonNF1.setToolTipText("");
        jButtonNF1.setBorder(null);
        jButtonNF1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNF1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNF1MouseExited(evt);
            }
        });
        jButtonNF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNF1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 250, 40));

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
        new TelaInicial().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRetornarActionPerformed

    private void jButtonRetornarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRetornarMouseExited
        jButtonRetornar.setBackground(new Color(217,81,51));
        jButtonRetornar.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonRetornarMouseExited

    private void jButtonRetornarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRetornarMouseEntered
        jButtonRetornar.setBackground(new Color(235,235,235));
        jButtonRetornar.setForeground(new Color(217,81,51));
    }//GEN-LAST:event_jButtonRetornarMouseEntered

    private void jButtonProduto1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProduto1MouseEntered
        jButtonProduto1.setBackground(new Color(235, 235, 235));
        jButtonProduto1.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButtonProduto1MouseEntered

    private void jButtonProduto1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProduto1MouseExited
        jButtonProduto1.setBackground(new Color(58,65,84));
        jButtonProduto1.setForeground(new Color(235, 235, 235));
    }//GEN-LAST:event_jButtonProduto1MouseExited

    private void jButtonProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProduto1ActionPerformed
        new MenuProdutos(this.produtos).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonProduto1ActionPerformed

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

    private void jButtonNF1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNF1MouseEntered
        jButtonNF1.setBackground(new Color(235, 235, 235));
        jButtonNF1.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButtonNF1MouseEntered

    private void jButtonNF1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNF1MouseExited
        jButtonNF1.setBackground(new Color(58,65,84));
        jButtonNF1.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonNF1MouseExited

    private void jButtonNF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNF1ActionPerformed
        new MenuNotas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonNF1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNF1;
    private javax.swing.JButton jButtonProduto1;
    private javax.swing.JButton jButtonRetornar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSair1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
