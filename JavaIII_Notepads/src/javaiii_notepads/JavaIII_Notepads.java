/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiii_notepads;

import java.awt.event.KeyListener;
import java.io.File;

/**
 *
 * @author nxeno
 */
public class JavaIII_Notepads extends javax.swing.JFrame {

   File currentFile;
   boolean isModified;
  
    public JavaIII_Notepads() {
        initComponents();
   //      taDocument.addKeyListener(new KeyListener(){
       
   //  }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        lblStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDocument = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miFileNew = new javax.swing.JMenuItem();
        miFileOpen = new javax.swing.JMenuItem();
        miFileSave = new javax.swing.JMenuItem();
        miFileSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miFileExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblStatus.setText("...");
        lblStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblStatus, java.awt.BorderLayout.PAGE_END);

        taDocument.setColumns(20);
        taDocument.setRows(5);
        jScrollPane1.setViewportView(taDocument);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        miFileNew.setText("New");
        jMenu1.add(miFileNew);

        miFileOpen.setText("Open...");
        jMenu1.add(miFileOpen);

        miFileSave.setText("Save");
        jMenu1.add(miFileSave);

        miFileSaveAs.setText("Save As...");
        jMenu1.add(miFileSaveAs);
        jMenu1.add(jSeparator1);

        miFileExit.setText("Exit");
        miFileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFileExitActionPerformed(evt);
            }
        });
        jMenu1.add(miFileExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("jMenuItem2");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miFileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFileExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miFileExitActionPerformed

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
            java.util.logging.Logger.getLogger(JavaIII_Notepads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaIII_Notepads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaIII_Notepads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaIII_Notepads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaIII_Notepads().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenuItem miFileExit;
    private javax.swing.JMenuItem miFileNew;
    private javax.swing.JMenuItem miFileOpen;
    private javax.swing.JMenuItem miFileSave;
    private javax.swing.JMenuItem miFileSaveAs;
    private javax.swing.JTextArea taDocument;
    // End of variables declaration//GEN-END:variables
}
