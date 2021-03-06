/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiiiday06manyinputs;

import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

/**
 *
 * @author nxeno
 */
public class JavaIIIDay06ManyInputs extends javax.swing.JFrame {

    /**
     * Creates new form JavaIIIDay06ManyInputs
     */
    public JavaIIIDay06ManyInputs() {
        initComponents();
    }

    ArrayList<String> petsList = new ArrayList<>();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ageGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        catCheck = new javax.swing.JCheckBox();
        dogCheck = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        sliderTemp = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        otherCheck = new javax.swing.JCheckBox();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblTemp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        jLabel3.setText("Pets");

        catCheck.setText("Cat");
        catCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catCheckActionPerformed(evt);
            }
        });

        dogCheck.setText("Dog");
        dogCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogCheckActionPerformed(evt);
            }
        });

        jLabel4.setText("Continent");

        sliderTemp.setMajorTickSpacing(1);
        sliderTemp.setMaximum(35);
        sliderTemp.setMinimum(15);
        sliderTemp.setMinorTickSpacing(1);
        sliderTemp.setPaintTicks(true);
        sliderTemp.setPaintTrack(false);
        sliderTemp.setSnapToTicks(true);
        sliderTemp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderTempStateChanged(evt);
            }
        });

        jLabel5.setText("Prefered Temp C");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ageGroup.add(jRadioButton1);
        jRadioButton1.setText("Below 18");

        ageGroup.add(jRadioButton2);
        jRadioButton2.setText("18-35");

        otherCheck.setText("Other");
        otherCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherCheckActionPerformed(evt);
            }
        });

        ageGroup.add(jRadioButton3);
        jRadioButton3.setText("36 and up");

        jLabel6.setText("15");

        jLabel7.setText("35");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "America", "Europe", "Africa", "Asia", "Oceania" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(43, 43, 43)
                                .addComponent(jRadioButton2)
                                .addGap(32, 32, 32)
                                .addComponent(jRadioButton3))
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sliderTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(catCheck)
                                .addGap(18, 18, 18)
                                .addComponent(dogCheck)
                                .addGap(18, 18, 18)
                                .addComponent(otherCheck))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTemp)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catCheck)
                    .addComponent(dogCheck)
                    .addComponent(otherCheck)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(sliderTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTemp)
                        .addGap(27, 27, 27)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void catCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catCheckActionPerformed
        if(catCheck.isSelected()){
           petsList.add("Cat");
           
        }else{
            petsList.remove("Cat");
        }
    }//GEN-LAST:event_catCheckActionPerformed

    private void otherCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherCheckActionPerformed
       if(otherCheck.isSelected()){
           
           petsList.add("other");
        }else{
           petsList.remove("other");
       }
    }//GEN-LAST:event_otherCheckActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = tfName.getText();
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Name Must Not Be Empty",
                    "Input error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        Enumeration<AbstractButton> ageSelected =  ageGroup.getElements();
        //if(ageSelected.isEmpty){
        
        String msg = ("Hello"+ name + String.valueOf(ageSelected) + petsList );
        JOptionPane.showMessageDialog(this, msg);    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dogCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogCheckActionPerformed
if(dogCheck.isSelected()){
           
          petsList.add("Dog");
        }  else{
    petsList.remove("Dog");
}

    }//GEN-LAST:event_dogCheckActionPerformed

    private void sliderTempStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderTempStateChanged
        int temp = sliderTemp.getValue();
        lblTemp.setText(String.format("%d C", temp));
    }//GEN-LAST:event_sliderTempStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaIIIDay06ManyInputs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ageGroup;
    private javax.swing.JCheckBox catCheck;
    private javax.swing.JCheckBox dogCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JCheckBox otherCheck;
    private javax.swing.JSlider sliderTemp;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
