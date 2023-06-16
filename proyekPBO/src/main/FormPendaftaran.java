/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 *
 * @author kadekpurna22
 */
public class FormPendaftaran extends javax.swing.JFrame {
    
    /**
     * Creates new form FormPendaftaran
     */
    public FormPendaftaran() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jkbuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namaKegiatanLabel = new javax.swing.JLabel();
        nimLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        jkLabel = new javax.swing.JLabel();
        tingkatLabel = new javax.swing.JLabel();
        alamatLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        tlpnLabel = new javax.swing.JLabel();
        ttlLabel = new javax.swing.JLabel();
        nimTextField = new javax.swing.JTextField();
        namaTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatTextArea = new javax.swing.JTextArea();
        emailTextField = new javax.swing.JTextField();
        tlpnTextField = new javax.swing.JTextField();
        hapusButton = new javax.swing.JButton();
        daftarButton = new javax.swing.JButton();
        tingkatComboBox = new javax.swing.JComboBox<>();
        ttlDateChooser = new com.toedter.calendar.JDateChooser();
        lakiRadioButton = new javax.swing.JRadioButton();
        perempuanRadioButton = new javax.swing.JRadioButton();
        closeLabel = new javax.swing.JLabel();
        namaKegiatanComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel1.setFont(new java.awt.Font("Poppins Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulir Pendaftaran");

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Java\\proyekPBO\\proyekPBO\\src\\assets\\formdaftar.png")); // NOI18N

        namaKegiatanLabel.setForeground(new java.awt.Color(255, 255, 255));
        namaKegiatanLabel.setText("Nama kegiatan");

        nimLabel.setForeground(new java.awt.Color(255, 255, 255));
        nimLabel.setText("NIM");

        namaLabel.setForeground(new java.awt.Color(255, 255, 255));
        namaLabel.setText("Nama");

        jkLabel.setForeground(new java.awt.Color(255, 255, 255));
        jkLabel.setText("Jenis Kelamin");

        tingkatLabel.setForeground(new java.awt.Color(255, 255, 255));
        tingkatLabel.setText("Tingkat");

        alamatLabel.setForeground(new java.awt.Color(255, 255, 255));
        alamatLabel.setText("Alamat");

        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        tlpnLabel.setForeground(new java.awt.Color(255, 255, 255));
        tlpnLabel.setText("No.Telepon");

        ttlLabel.setForeground(new java.awt.Color(255, 255, 255));
        ttlLabel.setText("Tanggal Lahir");

        nimTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nimTextFieldKeyTyped(evt);
            }
        });

        alamatTextArea.setColumns(20);
        alamatTextArea.setRows(5);
        alamatTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(alamatTextArea);

        tlpnTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tlpnTextFieldKeyTyped(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        daftarButton.setText("Daftar");
        daftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButtonActionPerformed(evt);
            }
        });

        tingkatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jkbuttonGroup.add(lakiRadioButton);
        lakiRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        lakiRadioButton.setText("Laki-Laki");

        jkbuttonGroup.add(perempuanRadioButton);
        perempuanRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        perempuanRadioButton.setText("Perempuan");

        closeLabel.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Java\\proyekPBO\\proyekPBO\\src\\assets\\close.png")); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });

        namaKegiatanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih kegiatan.....", "Pelatihan Internal Renang", "Pelatihan Internal RC", "Pendakian Umum", "PDT (Pembangunan Desa Tertinggal)" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaKegiatanLabel)
                    .addComponent(nimLabel)
                    .addComponent(namaLabel)
                    .addComponent(jkLabel)
                    .addComponent(tingkatLabel)
                    .addComponent(alamatLabel)
                    .addComponent(tlpnLabel)
                    .addComponent(ttlLabel)
                    .addComponent(emailLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(hapusButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(daftarButton)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTextField)
                            .addComponent(jLabel2)
                            .addComponent(lakiRadioButton)
                            .addComponent(perempuanRadioButton)
                            .addComponent(tingkatComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaTextField)
                            .addComponent(nimTextField)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(ttlDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tlpnTextField)
                            .addComponent(namaKegiatanComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(closeLabel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKegiatanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaKegiatanLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nimLabel)
                    .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaLabel)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jkLabel)
                    .addComponent(lakiRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perempuanRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tingkatLabel)
                    .addComponent(tingkatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alamatLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tlpnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tlpnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttlLabel)
                    .addComponent(ttlDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusButton)
                    .addComponent(daftarButton))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        namaKegiatanComboBox.setSelectedItem(this);
        nimTextField.setText("");
        namaTextField.setText("");
        jkbuttonGroup.clearSelection();
        tingkatComboBox.setSelectedIndex(0);
        alamatTextArea.setText("");
        emailTextField.setText("");
        tlpnTextField.setText("");
        ttlDateChooser.setCalendar(null);
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void tlpnTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tlpnTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
    }//GEN-LAST:event_tlpnTextFieldKeyTyped

    private void nimTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nimTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch) || tlpnTextField.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_nimTextFieldKeyTyped

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeLabelMouseClicked

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        // TODO add your handling code here:
        Pendaftar mhs = new Pendaftar();
        mhs.setNamaKegiatan(namaKegiatanComboBox.getSelectedItem().toString());
        mhs.setNim(nimTextField.getText());
        mhs.setNama(namaTextField.getText());
        if(lakiRadioButton.isSelected()){
            mhs.setJk("Laki-Laki");
        }
        if(perempuanRadioButton.isSelected()){
            mhs.setJk("Perempuan");
        }
        mhs.setTingkat(tingkatComboBox.getSelectedItem().toString());
        mhs.setAlamat(alamatTextArea.getText());
        mhs.setEmail(emailTextField.getText());
        mhs.setTlpn(tlpnTextField.getText());
        String kalender = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(kalender);
        String tanggal = String.valueOf(fm.format(ttlDateChooser.getDate()));
        mhs.setTtl(tanggal);
        try{
            Database.getInstance().insertPendaftar(mhs);
            JOptionPane.showMessageDialog(null, "Anda telah Mendaftar");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_daftarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JTextArea alamatTextArea;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jkLabel;
    private javax.swing.ButtonGroup jkbuttonGroup;
    private javax.swing.JRadioButton lakiRadioButton;
    private javax.swing.JComboBox<String> namaKegiatanComboBox;
    private javax.swing.JLabel namaKegiatanLabel;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JLabel nimLabel;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JRadioButton perempuanRadioButton;
    private javax.swing.JComboBox<String> tingkatComboBox;
    private javax.swing.JLabel tingkatLabel;
    private javax.swing.JLabel tlpnLabel;
    private javax.swing.JTextField tlpnTextField;
    private com.toedter.calendar.JDateChooser ttlDateChooser;
    private javax.swing.JLabel ttlLabel;
    // End of variables declaration//GEN-END:variables
}
