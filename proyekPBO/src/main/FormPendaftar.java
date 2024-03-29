/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package main;

import decorator.PendaftarAlamatDecorator;
import decorator.PendaftarBasicTable;
import decorator.PendaftarJenisKelaminDecorator;
import decorator.PendaftarNamaDecorator;
import decorator.PendaftarNamaKegiatanDecorator;
import decorator.PendaftarNimDecorator;
import decorator.PendaftarTingkatDecorator;
import decorator.PendaftarTlpnDecorator;
import decorator.Table;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.RowFilter;
/**
 *
 * @author kadekpurna22
 */
public class FormPendaftar extends javax.swing.JInternalFrame {
    
    private ArrayList<Pendaftar> pfrList;
    
    private void show_data(){
        DefaultTableModel dtm = (DefaultTableModel)
        pendaftarTable.getModel();
        
        //refresh tabel
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        try{
            int no = 1;
            //isi tabel
            for(Pendaftar pfr:
                Database.getInstance().getListPendaftar()){
                dtm.addRow(new Object[]{
                    pfr.getNamaKegiatan(), 
                    pfr.getNim(), 
                    pfr.getNama(), 
                    pfr.getJk(), 
                    pfr.getTingkat(),
                    pfr.getAlamat(), 
                    pfr.getEmail(), 
                    pfr.getTlpn(), 
                    pfr.getTtl()});
            } 
            // Adjust the preferred height of the JScrollPane to show all rows
            int rowHeight = pendaftarTable.getRowHeight();
            int rowCount = dtm.getRowCount();
            int preferredHeight = rowHeight * rowCount;
            jScrollPane1.setPreferredSize(new Dimension(jScrollPane1.getPreferredSize().width, preferredHeight));
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void show_filter(){
        DefaultTableModel dtm = (DefaultTableModel)
        pendaftarTable.getModel();
        
        //refresh tabel
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        int no = 1;
        //isi tabel
        for(Pendaftar pfr:
                pfrList){
            dtm.addRow(new Object[]{
                pfr.getNamaKegiatan(), 
                pfr.getNim(), 
                pfr.getNama(), 
                pfr.getJk(), 
                pfr.getAlamat(), 
                pfr.getTingkat(), 
                pfr.getEmail(), 
                pfr.getTlpn(), 
                pfr.getTtl()});
        }
    }
    
    private void filterTable(){
        String namaKegiatan = namaKegiatanTextField.getText();
        String nim = nimTextField.getText();
        String nama = namaTextField.getText();
        String jk = "-".equals((String)jkComboBox.getSelectedItem())?
                "" : (String)jkComboBox.getSelectedItem();
        String tingkat = "-".equals((String)tingkatComboBox.getSelectedItem())?
                "" : (String)tingkatComboBox.getSelectedItem();
        String alamat = alamatTextField.getText();
        String tlpn = tlpnTextField.getText();
//        
        //Memuat isi interfecae table
        Table tabel = new PendaftarBasicTable();
        
        //Decorator untuk fiter nama kegiatan pada tabel
        Table namaKegiatanTable = new PendaftarNamaKegiatanDecorator(tabel, namaKegiatan);
        Table nimTable = new PendaftarNimDecorator(namaKegiatanTable, nim);
        Table namaTable = new PendaftarNamaDecorator(nimTable, nama);
        Table jenisKelaminTable = new PendaftarJenisKelaminDecorator(namaTable, jk);
        Table tingkatTable = new PendaftarTingkatDecorator(jenisKelaminTable, tingkat);
        Table alamatTable = new PendaftarAlamatDecorator(tingkatTable, alamat);
        Table tlpnTable = new PendaftarTlpnDecorator(alamatTable, tlpn);
        
        //Menampilkan tabel yang telah di filter pada kolom
        pfrList = tlpnTable.getList();
    }
    
    /**
     * Creates new form FormMahasiswaP
     */
    public FormPendaftar() throws SQLException {
        initComponents();
        show_data();
        // remove the title bar of a JInternalFrame in Java Swing
        ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).setNorthPane(null);
        setResizable(true);
        this.pfrList = (ArrayList<Pendaftar>) Database.getInstance().getListPendaftar();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namaKegiatanTextField = new javax.swing.JTextField();
        nimTextField = new javax.swing.JTextField();
        namaTextField = new javax.swing.JTextField();
        alamatTextField = new javax.swing.JTextField();
        tlpnTextField = new javax.swing.JTextField();
        jkComboBox = new javax.swing.JComboBox<>();
        tingkatComboBox = new javax.swing.JComboBox<>();
        filterButton = new javax.swing.JButton();
        clearFilterButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendaftarTable = new javax.swing.JTable();
        hapusButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(241, 241, 230));

        jLabel1.setFont(new java.awt.Font("Poppins Black", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FILTER TABEL");

        jLabel2.setText("Nama kegiatan");

        jLabel3.setText("NIM");

        jLabel4.setText("Nama");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Tingkat");

        jLabel7.setText("Alamat");

        jLabel8.setText("No.Telephone");

        jkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Laki-Laki", "Perempuan" }));

        tingkatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4" }));

        filterButton.setBackground(new java.awt.Color(204, 204, 204));
        filterButton.setText("Filter");
        filterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        clearFilterButton.setBackground(new java.awt.Color(204, 204, 204));
        clearFilterButton.setText("Hapus Filter");
        clearFilterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFilterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(namaKegiatanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alamatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tlpnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jkComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tingkatComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(filterButton)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(clearFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaKegiatanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tingkatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(alamatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tlpnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearFilterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(446, 348));
        jScrollPane1.setViewportView(pendaftarTable);

        pendaftarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Kegiatan", "NIM", "Nama", "Jenis Kelamin", "Tingkat", "Alamat", "Email", "No.Telepon", "Tanggal Lahir"
            }
        ));
        pendaftarTable.setMinimumSize(new java.awt.Dimension(120, 80));
        jScrollPane1.setViewportView(pendaftarTable);

        hapusButton.setText("Hapus Pendaftar");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hapusButton)
                .addContainerGap(528, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hapusButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) pendaftarTable.getModel();
        int i = pendaftarTable.getSelectedRow();
        String nim = (String)dtm.getValueAt(i, 1);
        try{
            Database.getInstance().deletePendaftar(nim);
            JOptionPane.showMessageDialog(this, "Data berhasil di hapus");
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menghapus data " + JOptionPane.ERROR_MESSAGE);
        }
        show_data();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        // TODO add your handling code here:
        filterTable();
        show_filter();
    }//GEN-LAST:event_filterButtonActionPerformed

    private void clearFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFilterButtonActionPerformed
        // TODO add your handling code here:
        namaKegiatanTextField.setText("");
        nimTextField.setText("");
        namaTextField.setText("");
        jkComboBox.setSelectedIndex(0);
        tingkatComboBox.setSelectedIndex(0);
        alamatTextField.setText("");
        tlpnTextField.setText("");
        
        try {
            pfrList = (ArrayList<Pendaftar>) Database.getInstance().getListPendaftar();
            show_data();
        } catch (SQLException ex) {
            Logger.getLogger(FormPendaftar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_clearFilterButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatTextField;
    private javax.swing.JButton clearFilterButton;
    private javax.swing.JButton filterButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jkComboBox;
    private javax.swing.JTextField namaKegiatanTextField;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JTable pendaftarTable;
    private javax.swing.JComboBox<String> tingkatComboBox;
    private javax.swing.JTextField tlpnTextField;
    // End of variables declaration//GEN-END:variables
}
