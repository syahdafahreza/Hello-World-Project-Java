/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sf_helloworld;

import javax.swing.JOptionPane;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

/**
 *
 * @author Entahlah
 */
public class MyFirstForm extends javax.swing.JFrame {

    /**
     * Creates new form MyFirstForm
     */
    public MyFirstForm() {
        initComponents();

    }

    String KataKata;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _btnMunculTxt = new javax.swing.JButton();
        _helloWorldMaker = new javax.swing.JButton();
        btnHpsText = new javax.swing.JButton();
        my_textfield = new javax.swing.JTextField();
        btnCopyTxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello World Project");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        _btnMunculTxt.setText("Munculkan Dialog Dari Text Diatas");
        _btnMunculTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnMunculTxtActionPerformed(evt);
            }
        });

        _helloWorldMaker.setText("Buatkan Saya Hello World!");
        _helloWorldMaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _helloWorldMakerActionPerformed(evt);
            }
        });

        btnHpsText.setText("Hapus Text");
        btnHpsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHpsTextActionPerformed(evt);
            }
        });

        my_textfield.setText("Masukkan teks disini / klik tombol dibawah ini untuk membuat teks...");

        btnCopyTxt.setText("Salin Text");
        btnCopyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(my_textfield)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(_helloWorldMaker)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_btnMunculTxt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHpsText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCopyTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(my_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopyTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_btnMunculTxt)
                    .addComponent(_helloWorldMaker)
                    .addComponent(btnHpsText))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void _btnMunculTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnMunculTxtActionPerformed
       KataKata = my_textfield.getText();
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, KataKata);
    }//GEN-LAST:event__btnMunculTxtActionPerformed

    private void _helloWorldMakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__helloWorldMakerActionPerformed
        // TODO add your handling code here:
        my_textfield.setText("Hello World");
    }//GEN-LAST:event__helloWorldMakerActionPerformed

    private void btnHpsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHpsTextActionPerformed
        // TODO add your handling code here:
        my_textfield.setText("");
    }//GEN-LAST:event_btnHpsTextActionPerformed

    private void btnCopyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyTxtActionPerformed
        // TODO add your handling code here:
        KataKata = my_textfield.getText();
        StringSelection stringSelection = new StringSelection(KataKata);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopyTxtActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyFirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFirstForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _btnMunculTxt;
    private javax.swing.JButton _helloWorldMaker;
    private javax.swing.JButton btnCopyTxt;
    private javax.swing.JButton btnHpsText;
    private javax.swing.JTextField my_textfield;
    // End of variables declaration//GEN-END:variables
}
