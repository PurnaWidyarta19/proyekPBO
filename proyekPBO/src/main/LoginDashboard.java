/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import assets.Warna;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import java.awt.Toolkit;
/**
 *
 * @author kadekpurna22
 */
public class LoginDashboard extends javax.swing.JFrame {
    
    /**
     * Creates new form LoginDashboard
     */
    public LoginDashboard() {
        initComponents();
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        anggotaButton = new javax.swing.JButton();
        pendaftarButton = new javax.swing.JButton();
        outButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bodyDesktopPane = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(51, 255, 0));
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());

        headerPanel.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Poppins Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplikasi Admin UKM GPA Cheby");

        jLabel3.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Politeknik Statistika STIS");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MENU");

        anggotaButton.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        anggotaButton.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Java\\proyekPBO\\proyekPBO\\src\\assets\\anggota.png")); // NOI18N
        anggotaButton.setText("Anggota UKM ");
        anggotaButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 0, true));
        anggotaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anggotaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                anggotaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                anggotaButtonMouseExited(evt);
            }
        });
        anggotaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anggotaButtonActionPerformed(evt);
            }
        });

        pendaftarButton.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        pendaftarButton.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Java\\proyekPBO\\proyekPBO\\src\\assets\\pendaftarfix.png")); // NOI18N
        pendaftarButton.setText("Pendaftar Kegiatan");
        pendaftarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        pendaftarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pendaftarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pendaftarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pendaftarButtonMouseExited(evt);
            }
        });
        pendaftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendaftarButtonActionPerformed(evt);
            }
        });

        outButton.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        outButton.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Java\\proyekPBO\\proyekPBO\\src\\assets\\logout.png")); // NOI18N
        outButton.setText("Log Out");
        outButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        outButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        outButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                outButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                outButtonMouseExited(evt);
            }
        });
        outButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outButtonActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Java\\proyekPBO\\proyekPBO\\src\\assets\\admdasbord.png")); // NOI18N

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pendaftarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(anggotaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(anggotaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pendaftarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        bodyDesktopPane.setBackground(new java.awt.Color(68, 165, 121));
        bodyDesktopPane.setPreferredSize(new java.awt.Dimension(1111, 504));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hi admin, semoga harimu cerah :)");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Java\\proyekPBO\\proyekPBO\\src\\assets\\hiadmin.png")); // NOI18N

        bodyDesktopPane.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bodyDesktopPane.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bodyDesktopPaneLayout = new javax.swing.GroupLayout(bodyDesktopPane);
        bodyDesktopPane.setLayout(bodyDesktopPaneLayout);
        bodyDesktopPaneLayout.setHorizontalGroup(
            bodyDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyDesktopPaneLayout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bodyDesktopPaneLayout.setVerticalGroup(
            bodyDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyDesktopPaneLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        footerPanel.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Created by: I Kadek Purna Widyarta");

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)))
            .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(bodyDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anggotaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anggotaButtonActionPerformed
        // TODO add your handling code here:
        FormAnggotaUKM fanggota = new FormAnggotaUKM();
        bodyDesktopPane.removeAll();
        bodyDesktopPane.add(fanggota);
        fanggota.setSize(bodyDesktopPane.getWidth(), bodyDesktopPane.getHeight());
        fanggota.setVisible(true);
    }//GEN-LAST:event_anggotaButtonActionPerformed

    private void pendaftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendaftarButtonActionPerformed
        try {
            // TODO add your handling code here:
            FormPendaftar fpendaftar = new FormPendaftar();
            bodyDesktopPane.removeAll();
            bodyDesktopPane.add(fpendaftar);
            fpendaftar.setSize(bodyDesktopPane.getWidth(), bodyDesktopPane.getHeight());
            fpendaftar.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LoginDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pendaftarButtonActionPerformed

    private void anggotaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anggotaButtonMouseEntered
        // TODO add your handling code here:
        anggotaButton.setBackground(Warna.HOVERIN);
    }//GEN-LAST:event_anggotaButtonMouseEntered

    private void anggotaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anggotaButtonMouseExited
        // TODO add your handling code here:
        anggotaButton.setBackground(Warna.HOVEROUT);
    }//GEN-LAST:event_anggotaButtonMouseExited

    private void outButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outButtonActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        dispose();
        JOptionPane.showMessageDialog(null, "Anda berhasil logout");
    }//GEN-LAST:event_outButtonActionPerformed

    private void pendaftarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendaftarButtonMouseEntered
        // TODO add your handling code here:
        pendaftarButton.setBackground(Warna.HOVERIN);
    }//GEN-LAST:event_pendaftarButtonMouseEntered

    private void pendaftarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendaftarButtonMouseExited
        // TODO add your handling code here:
        pendaftarButton.setBackground(Warna.HOVEROUT);
    }//GEN-LAST:event_pendaftarButtonMouseExited

    private void outButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outButtonMouseEntered
        // TODO add your handling code here:
        pendaftarButton.setBackground(Warna.HOVERIN);
    }//GEN-LAST:event_outButtonMouseEntered

    private void outButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outButtonMouseExited
        // TODO add your handling code here:
        pendaftarButton.setBackground(Warna.HOVEROUT);
    }//GEN-LAST:event_outButtonMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anggotaButton;
    private javax.swing.JDesktopPane bodyDesktopPane;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton outButton;
    private javax.swing.JButton pendaftarButton;
    // End of variables declaration//GEN-END:variables
}
