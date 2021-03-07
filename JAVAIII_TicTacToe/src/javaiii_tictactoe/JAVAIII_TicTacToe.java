/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiii_tictactoe;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author nxeno
 */
public class JAVAIII_TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form JAVAIII_TicTacToe
     */
    public JAVAIII_TicTacToe() {
        initComponents();
        addAction();

    }

    public void winPopUp() {
        if (lblCurrentPlayer.getText() == "X") {
            String msg = " O WINS!";
            JOptionPane.showMessageDialog(this, msg);
        } else {
            String msg = " X WINS!";
            JOptionPane.showMessageDialog(this, msg);
        }
    }

    public void winEffect(JButton b1, JButton b2, JButton b3) {
        b1.setBackground(Color.green);
        b2.setBackground(Color.green);
        b3.setBackground(Color.green);
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);
    }

    public void getTheWinner() {
        //first line across
        if (!bt1_1.getText().equals("") && bt1_1.getText().equals(bt1_2.getText()) && bt1_1.getText().equals(bt1_3.getText())) {
            winEffect(bt1_1, bt1_2, bt1_3);
            winPopUp();
        }
        //second  line across
        if (!bt2_1.getText().equals("") && bt2_1.getText().equals(bt2_2.getText()) && bt2_1.getText().equals(bt2_3.getText())) {
            winEffect(bt2_1, bt2_2, bt2_3);
            winPopUp();
        }
        //third line across
        if (!bt3_1.getText().equals("") && bt3_1.getText().equals(bt1_2.getText()) && bt3_1.getText().equals(bt1_3.getText())) {
            winEffect(bt3_1, bt3_2, bt3_3);
            winPopUp();
        }
        //top left to bottom right
        if (!bt1_1.getText().equals("") && bt1_1.getText().equals(bt2_2.getText()) && bt1_1.getText().equals(bt3_3.getText())) {
            winEffect(bt1_1, bt2_2, bt3_3);
            winPopUp();
        }
        //top right to bottom left
        if (!bt1_3.getText().equals("") && bt1_3.getText().equals(bt2_2.getText()) && bt1_3.getText().equals(bt3_1.getText())) {
            winEffect(bt1_3, bt2_2, bt3_1);
            winPopUp();
        }
        //first row across
        if (!bt1_1.getText().equals("") && bt1_1.getText().equals(bt2_1.getText()) && bt1_1.getText().equals(bt3_1.getText())) {
            winEffect(bt1_1, bt2_1, bt3_1);
            winPopUp();
        }
        //second row across
        if (!bt1_2.getText().equals("") && bt1_2.getText().equals(bt2_2.getText()) && bt1_2.getText().equals(bt3_2.getText())) {
            winEffect(bt1_2, bt2_2, bt3_2);
            winPopUp();
        }
        //third line across
        if (!bt1_3.getText().equals("") && bt1_3.getText().equals(bt2_3.getText()) && bt1_3.getText().equals(bt3_3.getText())) {
            winEffect(bt3_3, bt2_3, bt3_3);
            winPopUp();
        }
    }
//create action 
//     
    int turn = 0;
    int counter;

    public ActionListener createAction(JButton button) {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (button.getText().equals("")) {
                    if ((turn % 2) == 0) {
                        button.setText("X");
                        lblCurrentPlayer.setText("O");
                        getTheWinner();
                        // button.setForeground(Color.red);
                    } else {
                        button.setText("O");
                        lblCurrentPlayer.setText("X");
                        getTheWinner();
                    }
                }

                turn++;
                counter++;
                String countStr = String.format("%d", counter);
                lblCurrentTurn.setText(countStr);
            }

        };
        return al;
    }

    //function to add action to the buttons
    public void addAction() {

        Component[] comps = jPanel1.getComponents();
        for (Component comp : comps) {
            if (comp instanceof JButton) {
                JButton button = (JButton) comp;
                button.addActionListener(createAction(button));

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblCurrentPlayer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCurrentTurn = new javax.swing.JLabel();
        btResetGame = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bt1_1 = new javax.swing.JButton();
        bt1_2 = new javax.swing.JButton();
        bt1_3 = new javax.swing.JButton();
        bt2_1 = new javax.swing.JButton();
        bt2_2 = new javax.swing.JButton();
        bt2_3 = new javax.swing.JButton();
        bt3_1 = new javax.swing.JButton();
        bt3_2 = new javax.swing.JButton();
        bt3_3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jLabel1.setText("Turn of Player:");

        lblCurrentPlayer.setText("X/O");

        jLabel3.setText("Turn Number");

        lblCurrentTurn.setText("1");

        btResetGame.setText("Reset game");
        btResetGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetGameActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

        bt1_1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        bt1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClicked(evt);
            }
        });
        jPanel1.add(bt1_1);

        bt1_2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        bt1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClicked(evt);
            }
        });
        jPanel1.add(bt1_2);

        bt1_3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        bt1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClicked(evt);
            }
        });
        jPanel1.add(bt1_3);

        bt2_1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        bt2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClicked(evt);
            }
        });
        jPanel1.add(bt2_1);

        bt2_2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        bt2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClicked(evt);
            }
        });
        jPanel1.add(bt2_2);

        bt2_3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        bt2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClicked(evt);
            }
        });
        jPanel1.add(bt2_3);

        bt3_1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        bt3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClicked(evt);
            }
        });
        jPanel1.add(bt3_1);

        bt3_2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        bt3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClicked(evt);
            }
        });
        jPanel1.add(bt3_2);

        bt3_3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        bt3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClicked(evt);
            }
        });
        jPanel1.add(bt3_3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCurrentPlayer)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(lblCurrentTurn)
                        .addGap(41, 41, 41)
                        .addComponent(btResetGame)
                        .addGap(0, 126, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCurrentPlayer)
                    .addComponent(jLabel3)
                    .addComponent(lblCurrentTurn)
                    .addComponent(btResetGame))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClicked


    }//GEN-LAST:event_btClicked

    private void btResetGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetGameActionPerformed
        Component[] comps = jPanel1.getComponents();
        for (Component comp : comps) {
            if (comp instanceof JButton) {
                JButton button = (JButton) comp;
                button.setText("");
                button.setBackground(Color.white);
                button.setForeground(Color.black);
                counter = 0;
                String countStr = String.format("%d", counter);
                lblCurrentTurn.setText(countStr);
            }
        }
    }//GEN-LAST:event_btResetGameActionPerformed

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
            java.util.logging.Logger.getLogger(JAVAIII_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAVAIII_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAVAIII_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAVAIII_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAVAIII_TicTacToe().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1_1;
    private javax.swing.JButton bt1_2;
    private javax.swing.JButton bt1_3;
    private javax.swing.JButton bt2_1;
    private javax.swing.JButton bt2_2;
    private javax.swing.JButton bt2_3;
    private javax.swing.JButton bt3_1;
    private javax.swing.JButton bt3_2;
    private javax.swing.JButton bt3_3;
    private javax.swing.JButton btResetGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCurrentPlayer;
    private javax.swing.JLabel lblCurrentTurn;
    // End of variables declaration//GEN-END:variables
}
