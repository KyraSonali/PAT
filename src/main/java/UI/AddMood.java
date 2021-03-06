/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Backend.MoodManagement;

/**
 *
 * @author Kyra Balliram
 */
public class AddMood extends javax.swing.JFrame {

    /**
     * Creates new form AddMood
     */
    MoodManagement Mn;

    public AddMood() {
        initComponents();
        Mn = new MoodManagement();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        unhappyB = new javax.swing.JButton();
        sadB = new javax.swing.JButton();
        normalB = new javax.swing.JButton();
        goodB = new javax.swing.JButton();
        happyB = new javax.swing.JButton();
        BackB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(190, 144, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setText("Your Daily Mood:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 12, 135, 28));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("How do you feel Today");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, 42));

        unhappyB.setText("Unhappy");
        unhappyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unhappyBActionPerformed(evt);
            }
        });
        jPanel1.add(unhappyB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 80, 30));

        sadB.setText("Sad");
        sadB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sadBActionPerformed(evt);
            }
        });
        jPanel1.add(sadB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 70, 30));

        normalB.setText("normal");
        normalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalBActionPerformed(evt);
            }
        });
        jPanel1.add(normalB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 70, 30));

        goodB.setText("good");
        goodB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodBActionPerformed(evt);
            }
        });
        jPanel1.add(goodB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 80, 30));

        happyB.setText("Happy");
        happyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                happyBActionPerformed(evt);
            }
        });
        jPanel1.add(happyB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 80, 30));

        BackB.setText("Back");
        BackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBActionPerformed(evt);
            }
        });
        jPanel1.add(BackB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sadBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sadBActionPerformed
        // TODO add your handling code here:
        Mn.addOverallMood("Sad");
        dispose();
        new sadScreen().setVisible(true);

    }//GEN-LAST:event_sadBActionPerformed

    private void unhappyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unhappyBActionPerformed
        // TODO add your handling code here
        Mn.addOverallMood("unhappy");
        dispose();
        new unhappyScreen().setVisible(true);
    }//GEN-LAST:event_unhappyBActionPerformed

    private void happyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_happyBActionPerformed
        // TODO add your handling code here:
        Mn.addOverallMood("Happy");
        dispose();
        new happyScreen().setVisible(true);
    }//GEN-LAST:event_happyBActionPerformed

    private void goodBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodBActionPerformed
        // TODO add your handling code here:
        Mn.addOverallMood("Good");
        dispose();
        new goodScreen().setVisible(true);

    }//GEN-LAST:event_goodBActionPerformed

    private void normalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalBActionPerformed
        // TODO add your handling code here:
        Mn.addOverallMood("Normal");
        dispose();
        new normalScreen().setVisible(true);
    }//GEN-LAST:event_normalBActionPerformed

    private void BackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomeScreen().setVisible(true);
    }//GEN-LAST:event_BackBActionPerformed

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
            java.util.logging.Logger.getLogger(AddMood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackB;
    private javax.swing.JButton goodB;
    private javax.swing.JButton happyB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton normalB;
    private javax.swing.JButton sadB;
    private javax.swing.JButton unhappyB;
    // End of variables declaration//GEN-END:variables
}
