/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day07notepad;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

/**
 *
 * @author Teacher
 */
public class Day07Notepad extends javax.swing.JFrame {

    File currentFile; // or String
    boolean isModified; // set to false on New, Save, SaveAs
    
    /**
     * Creates new form Day07Notepad
     */
    public Day07Notepad() {
        initComponents();
        taDocument.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                isModified = true;
            }

            @Override
            public void keyPressed(KeyEvent e) {
                isModified = true;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                isModified = true;
            }
        });
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

        miFileOpen.setText("Open ...");
        jMenu1.add(miFileOpen);

        miFileSave.setText("Save");
        jMenu1.add(miFileSave);

        miFileSaveAs.setText("Save as ...");
        jMenu1.add(miFileSaveAs);
        jMenu1.add(jSeparator1);

        miFileExit.setText("Exit");
        jMenu1.add(miFileExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Day07Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Day07Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Day07Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Day07Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Day07Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
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
