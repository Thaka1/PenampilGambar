/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;

/**
 *
 * @author LENOVO
 */
public class PenampilGambar extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambar
     */
    public PenampilGambar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonPanel = new javax.swing.JPanel();
        Gambar1Btn = new javax.swing.JButton();
        Gambar2Btn = new javax.swing.JButton();
        Gambar3Btn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        ImagePanel = new javax.swing.JPanel();
        Lg1 = new javax.swing.JLabel();
        Lg2 = new javax.swing.JLabel();
        Lg3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        Gambar1Btn.setText("Gambar 1");
        Gambar1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gambar1BtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(Gambar1Btn);

        Gambar2Btn.setText("Gambar 2");
        Gambar2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gambar2BtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(Gambar2Btn);

        Gambar3Btn.setText("Gambar 3");
        Gambar3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gambar3BtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(Gambar3Btn);

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(ExitBtn);

        getContentPane().add(ButtonPanel, java.awt.BorderLayout.PAGE_START);

        ImagePanel.setLayout(new java.awt.CardLayout());

        Lg1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hafizh\\Downloads\\0001.jpg")); // NOI18N
        ImagePanel.add(Lg1, "1");

        Lg2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hafizh\\Downloads\\WhatsApp Image 2022-11-27 at 09.48.11.jpeg")); // NOI18N
        ImagePanel.add(Lg2, "2");

        Lg3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hafizh\\Downloads\\WhatsApp Image 2022-11-27 at 09.49.12.jpeg")); // NOI18N
        ImagePanel.add(Lg3, "3");

        getContentPane().add(ImagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void Gambar1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gambar1BtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(ImagePanel.getLayout());
        c1.show(ImagePanel, "1");
    }//GEN-LAST:event_Gambar1BtnActionPerformed

    private void Gambar2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gambar2BtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(ImagePanel.getLayout());
        c1.show(ImagePanel, "2");
    }//GEN-LAST:event_Gambar2BtnActionPerformed

    private void Gambar3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gambar3BtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(ImagePanel.getLayout());
        c1.show(ImagePanel, "3");
    }//GEN-LAST:event_Gambar3BtnActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenampilGambar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton Gambar1Btn;
    private javax.swing.JButton Gambar2Btn;
    private javax.swing.JButton Gambar3Btn;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JLabel Lg1;
    private javax.swing.JLabel Lg2;
    private javax.swing.JLabel Lg3;
    // End of variables declaration//GEN-END:variables
}