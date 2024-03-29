package com.estoque.telas;

import static com.estoque.listas.LeitorDeListas.lerLista;
import com.estoque.listas.NotasFiscais;
import com.estoque.telas.notas.*;

import java.awt.Color;
import java.awt.Point;

// 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

/**
 *
 * @author julio
 */
public class MenuNotas extends javax.swing.JFrame {
    private final Point point = new Point();
    
    public NotasFiscais notasFiscais = new NotasFiscais();

    /**
     * Cria um novo fomr MenuNotas
     */  
    public MenuNotas() {
        this.notasFiscais = lerLista(this.notasFiscais);
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
        jLabel6 = new javax.swing.JLabel();
        jButtonRetornar = new javax.swing.JButton();
        jButtonCriarNF = new javax.swing.JButton();
        jButtonConsultarNF = new javax.swing.JButton();
        jButtonEditarNF = new javax.swing.JButton();

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
        jLabel2.setText("NOTAS FISCAIS");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\julio\\Downloads\\icone.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addGap(101, 101, 101)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jButtonCriarNF.setBackground(new java.awt.Color(58, 65, 84));
        jButtonCriarNF.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonCriarNF.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCriarNF.setText("Criar NF");
        jButtonCriarNF.setToolTipText("");
        jButtonCriarNF.setBorder(null);
        jButtonCriarNF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCriarNF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCriarNFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCriarNFMouseExited(evt);
            }
        });
        jButtonCriarNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarNFActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCriarNF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 250, 40));

        jButtonConsultarNF.setBackground(new java.awt.Color(58, 65, 84));
        jButtonConsultarNF.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonConsultarNF.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarNF.setText("Consultar");
        jButtonConsultarNF.setToolTipText("");
        jButtonConsultarNF.setBorder(null);
        jButtonConsultarNF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultarNF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultarNFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultarNFMouseExited(evt);
            }
        });
        jButtonConsultarNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarNFActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConsultarNF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 250, 40));

        jButtonEditarNF.setBackground(new java.awt.Color(58, 65, 84));
        jButtonEditarNF.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonEditarNF.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarNF.setText("Editar");
        jButtonEditarNF.setToolTipText("");
        jButtonEditarNF.setBorder(null);
        jButtonEditarNF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditarNF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEditarNFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEditarNFMouseExited(evt);
            }
        });
        jButtonEditarNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarNFActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditarNF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 250, 40));

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
        jButtonRetornar.setBackground(new Color(217,81,51));
        jButtonRetornar.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonRetornarMouseExited

    private void jButtonRetornarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRetornarMouseEntered
        jButtonRetornar.setBackground(new Color(235,235,235));
        jButtonRetornar.setForeground(new Color(217,81,51));
    }//GEN-LAST:event_jButtonRetornarMouseEntered

    private void jButtonCriarNFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCriarNFMouseEntered
        jButtonCriarNF.setBackground(new Color(235, 235, 235));
        jButtonCriarNF.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButtonCriarNFMouseEntered

    private void jButtonCriarNFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCriarNFMouseExited
        jButtonCriarNF.setBackground(new Color(58,65,84));
        jButtonCriarNF.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonCriarNFMouseExited

    private void jButtonCriarNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarNFActionPerformed
        new CriarNota(this.notasFiscais).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCriarNFActionPerformed

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

    private void jButtonConsultarNFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarNFMouseEntered
        jButtonConsultarNF.setBackground(new Color(235, 235, 235));
        jButtonConsultarNF.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButtonConsultarNFMouseEntered

    private void jButtonConsultarNFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarNFMouseExited
        jButtonConsultarNF.setBackground(new Color(58,65,84));
        jButtonConsultarNF.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonConsultarNFMouseExited

    private void jButtonConsultarNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarNFActionPerformed
        new ConsultarNota(this.notasFiscais).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConsultarNFActionPerformed

    private void jButtonEditarNFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarNFMouseEntered
        jButtonEditarNF.setBackground(new Color(235, 235, 235));
        jButtonEditarNF.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButtonEditarNFMouseEntered

    private void jButtonEditarNFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarNFMouseExited
        jButtonEditarNF.setBackground(new Color(58,65,84));
        jButtonEditarNF.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jButtonEditarNFMouseExited

    private void jButtonEditarNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarNFActionPerformed
        new EditarNota(this.notasFiscais).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEditarNFActionPerformed

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
//                if ("".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuNotas(this.notasFiscais).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarNF;
    private javax.swing.JButton jButtonCriarNF;
    private javax.swing.JButton jButtonEditarNF;
    private javax.swing.JButton jButtonRetornar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSair1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
