
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sindy
 */
public class permainansuit extends javax.swing.JFrame {

    private int Permainan1;

    /**
     * Creates new form permainansuit
     */
    public permainansuit() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TombolMain = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Gunting = new javax.swing.JRadioButton();
        Batu = new javax.swing.JRadioButton();
        Kertas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("PERMAINAN SUIT SEDERHANA");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TombolMain.setBackground(new java.awt.Color(0, 255, 0));
        TombolMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolMain.setText("MAIN");
        TombolMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolMainActionPerformed(evt);
            }
        });
        jPanel2.add(TombolMain);

        Keluar.setBackground(new java.awt.Color(255, 0, 0));
        Keluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel2.add(Keluar);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.PAGE_AXIS));

        buttonGroup1.add(Gunting);
        Gunting.setText("Gunting");
        jPanel4.add(Gunting);

        buttonGroup1.add(Batu);
        Batu.setText("Batu");
        jPanel4.add(Batu);

        buttonGroup1.add(Kertas);
        Kertas.setText("Kertas");
        jPanel4.add(Kertas);

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jLabel2.setText("Pilih Permainan");
        jPanel3.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TombolMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolMainActionPerformed
        // TODO add your handling code here:
        JRadioButton Batu1 = this.Batu;
        JRadioButton Gunting1 = this.Gunting;
        JRadioButton Kertas1 = this.Kertas;
        
        int Permainan = 0; 
        Permainan1 = 1;
        
        if (Gunting.isSelected()) {
            int Permainan1 = Permainan;
        } else if (Batu.isSelected()) {
            int Permainan1 = Permainan;
        } else if (Kertas.isSelected()) {
            int Permainan1 = Permainan;
        } else {
            JOptionPane.showMessageDialog(this, "PILIH PERMAINAN DULU!", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
            return;
        }  
        
        if (Gunting.isSelected()) {
            int Permainan1 = Permainan;
        } else if (Batu.isSelected()) {
            int Permainan1 = Permainan;
        } else if (Kertas.isSelected()) {
            int Permainan1 = Permainan;
        } else {
            JOptionPane.showMessageDialog(this, "Anda KALAH!", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
            return;
        }  
    }//GEN-LAST:event_TombolMainActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(permainansuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(permainansuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(permainansuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(permainansuit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new permainansuit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Batu;
    private javax.swing.JRadioButton Gunting;
    private javax.swing.JButton Keluar;
    private javax.swing.JRadioButton Kertas;
    private javax.swing.JButton TombolMain;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
