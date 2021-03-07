
package javaiii_notepads;

import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIII_Notepads extends javax.swing.JFrame {

  
  
    public JavaIII_Notepads() {
        
        initComponents();
        setTitle("Untitled");
    }

String fileName;
public Clipboard clipboard= getToolkit().getSystemClipboard();    
   
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
        emCut = new javax.swing.JMenuItem();
        emCopy = new javax.swing.JMenuItem();
        emPaste = new javax.swing.JMenuItem();

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
        miFileNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFileNewActionPerformed(evt);
            }
        });
        jMenu1.add(miFileNew);

        miFileOpen.setText("Open...");
        miFileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFileOpenActionPerformed(evt);
            }
        });
        jMenu1.add(miFileOpen);

        miFileSave.setText("Save");
        miFileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFileSaveActionPerformed(evt);
            }
        });
        jMenu1.add(miFileSave);

        miFileSaveAs.setText("Save As...");
        miFileSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFileSaveAsActionPerformed(evt);
            }
        });
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

        emCut.setText("Cut");
        emCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emCutActionPerformed(evt);
            }
        });
        jMenu2.add(emCut);

        emCopy.setText("Copy");
        emCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emCopyActionPerformed(evt);
            }
        });
        jMenu2.add(emCopy);

        emPaste.setText("Paste");
        emPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emPasteActionPerformed(evt);
            }
        });
        jMenu2.add(emPaste);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miFileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFileExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_miFileExitActionPerformed

    private void miFileNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFileNewActionPerformed
     taDocument.setText("");
     setTitle("Untitled");
    }//GEN-LAST:event_miFileNewActionPerformed

    private void miFileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFileOpenActionPerformed
     FileDialog fileDialog = new FileDialog(JavaIII_Notepads.this, "Open File", FileDialog.LOAD);
     fileDialog.setVisible(true);
     if(fileDialog.getFile() !=null){
         fileName =fileDialog.getDirectory() + fileDialog.getFile();
         setTitle(fileName);
         
     }
     try{
         BufferedReader reader = new BufferedReader(new FileReader(fileName));
         StringBuilder sb = new StringBuilder();
         String line = null;
         while((line = reader.readLine()) != null){
             sb.append(line + "\n");
             taDocument.setText(sb.toString());
             
         }
     }catch (IOException e){
         System.out.println("File Not Found");
     }
    }//GEN-LAST:event_miFileOpenActionPerformed

    private void miFileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFileSaveActionPerformed
     FileDialog fileDialog = new FileDialog(JavaIII_Notepads.this,"Save File", FileDialog.SAVE);
     fileDialog.setVisible(true);
     if(fileDialog.getFile() != null){
         fileName = fileDialog.getDirectory() + fileDialog.getFile();
         setTitle(fileName);
         try{
         FileWriter fileWriter = new FileWriter(fileName);
         fileWriter.write(taDocument.getText());
         setTitle(fileName);
         fileWriter.close();
         lblStatus.setText("File Saved");
     }catch(IOException e){
             System.out.println("File Not Found");
     }
     }
    }//GEN-LAST:event_miFileSaveActionPerformed

    private void miFileSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFileSaveAsActionPerformed
    FileDialog fileDialog = new FileDialog(JavaIII_Notepads.this,"Save File", FileDialog.SAVE);
     fileDialog.setVisible(true);
     if(fileDialog.getFile() != null){
         fileName = fileDialog.getDirectory() + fileDialog.getFile();
         setTitle(fileName);
         try{
         FileWriter fileWriter = new FileWriter(fileName);
         fileWriter.write(taDocument.getText());
         setTitle(fileName);
         fileWriter.close();
         lblStatus.setText("File Saved");
     }catch(IOException e){
             System.out.println("File Not Found");
     }
     }
    }//GEN-LAST:event_miFileSaveAsActionPerformed

    private void emCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emCutActionPerformed
        String cutString = taDocument.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipboard.setContents(cutSelection,cutSelection);
        taDocument.replaceRange("", taDocument.getSelectionStart(),taDocument.getSelectionEnd());
        
    }//GEN-LAST:event_emCutActionPerformed

    private void emCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emCopyActionPerformed
        String copyText = taDocument.getSelectedText();
        StringSelection copySelection = new StringSelection(copyText);
        clipboard.setContents(copySelection, copySelection);
    }//GEN-LAST:event_emCopyActionPerformed

    private void emPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emPasteActionPerformed
      try{
          Transferable pasteText = clipboard.getContents(JavaIII_Notepads.this);
          String sel = (String) pasteText.getTransferData(DataFlavor.stringFlavor);
          taDocument.replaceRange(sel, taDocument.getSelectionStart(),taDocument.getSelectionEnd());
      }catch (Exception e){
          System.out.println("Didn't work");
      }
    }//GEN-LAST:event_emPasteActionPerformed

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
    private javax.swing.JMenuItem emCopy;
    private javax.swing.JMenuItem emCut;
    private javax.swing.JMenuItem emPaste;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
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
