/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Backend.MoodManagement;
import static UI.happyScreen.currentTxt;

/**
 *
 * @author Kyra Balliram
 */
public class sadScreen extends javax.swing.JFrame {

    /**
     * Creates new form SadMood
     */
    public sadScreen() {
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

        jPanel1 = new javax.swing.JPanel();
        HappyTxt = new javax.swing.JLabel();
        anxiousCh = new javax.swing.JCheckBox();
        painfulCh = new javax.swing.JCheckBox();
        nervousCh = new javax.swing.JCheckBox();
        envyCh = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTxt = new javax.swing.JTextArea();
        OutputTxt = new javax.swing.JLabel();
        AddB = new javax.swing.JButton();
        nolCh = new javax.swing.JCheckBox();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 152, 117));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HappyTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HappyTxt.setForeground(new java.awt.Color(255, 255, 255));
        HappyTxt.setText("SAD");
        jPanel1.add(HappyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 26, 135, 28));

        anxiousCh.setForeground(new java.awt.Color(255, 255, 255));
        anxiousCh.setText("anxious");
        jPanel1.add(anxiousCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 30));

        painfulCh.setForeground(new java.awt.Color(255, 255, 255));
        painfulCh.setText("painful");
        jPanel1.add(painfulCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, 30));

        nervousCh.setForeground(new java.awt.Color(255, 255, 255));
        nervousCh.setText("nervous");
        jPanel1.add(nervousCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, 30));

        envyCh.setForeground(new java.awt.Color(255, 255, 255));
        envyCh.setText("envious");
        jPanel1.add(envyCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, 30));

        outputTxt.setColumns(20);
        outputTxt.setRows(5);
        jScrollPane1.setViewportView(outputTxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 60, 159, 206));

        OutputTxt.setBackground(new java.awt.Color(0, 0, 0));
        OutputTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OutputTxt.setForeground(new java.awt.Color(255, 255, 255));
        OutputTxt.setText("Output");
        jPanel1.add(OutputTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 33, 54, -1));

        AddB.setText("Add");
        AddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBActionPerformed(evt);
            }
        });
        jPanel1.add(AddB, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 284, 73, -1));

        nolCh.setForeground(new java.awt.Color(255, 255, 255));
        nolCh.setText("nostalgic");
        jPanel1.add(nolCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 30));

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 11, 73, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBActionPerformed
        // TODO add your handling code here:
        if (anxiousCh.isSelected()) {
            MoodManagement.addEmotion("anxious");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + "anxious,");
        }
        if (painfulCh.isSelected()) {
            MoodManagement.addEmotion("painful");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " painful");
        }
        if (nervousCh.isSelected()) {
            MoodManagement.addEmotion("nervous");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " nervous,");
        }
        if (nolCh.isSelected()) {
            MoodManagement.addEmotion("nolstagic");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " nolstagic,");
        }
        if (envyCh.isSelected()) {
            MoodManagement.addEmotion("envious");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " envious,");
        }

    }//GEN-LAST:event_AddBActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomeScreen().setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(sadScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sadScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sadScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sadScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sadScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddB;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel HappyTxt;
    private javax.swing.JLabel OutputTxt;
    private javax.swing.JCheckBox anxiousCh;
    private javax.swing.JCheckBox envyCh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox nervousCh;
    private javax.swing.JCheckBox nolCh;
    private javax.swing.JTextArea outputTxt;
    private javax.swing.JCheckBox painfulCh;
    // End of variables declaration//GEN-END:variables
}
