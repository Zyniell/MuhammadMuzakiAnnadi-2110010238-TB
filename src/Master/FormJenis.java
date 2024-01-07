/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Master;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mmuzaki.a
 */
public class FormJenis extends javax.swing.JPanel {

    /**
     * Creates new form FormJenis
     */
    
    public Statement stmt;
    public ResultSet rs;
    public PreparedStatement pstmt;
    Connection con = Koneksi.KoneksiD.BukaKoneksi();
    
    public FormJenis() {
        initComponents();
        isitabel();
        BtnHapus.setVisible(false);
        BtnBatal.setVisible(false);
    }

    private void bersih() {
        TextIDJenis.setText("");
        TextNama.setText("");
    }
    
    private void isitabel() {
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM jns_barang");
            
            DefaultTableModel model = new DefaultTableModel();
                TableJenis.setModel(model);
                model.addColumn("ID Jenis");
                model.addColumn("Nama Jenis");
                
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] data = {
                  rs.getString("id_jenis"),
                  rs.getString("nm_jenis"),
                };
                model.addRow(data);
            }
            
        } catch (Exception e) {
            System.err.println("Error : " + e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        PanelJenis = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnTambah = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnBatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableJenis = new javax.swing.JTable();
        PanelTambah = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BtnTambah1 = new javax.swing.JButton();
        BtnHapus1 = new javax.swing.JButton();
        BtnBatal1 = new javax.swing.JButton();
        IDJenis = new javax.swing.JLabel();
        TextIDJenis = new javax.swing.JTextField();
        NamaJenis = new javax.swing.JLabel();
        TextNama = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new java.awt.CardLayout());

        PanelJenis.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATA JENIS");

        BtnTambah.setText("TAMBAH");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        BtnHapus.setText("HAPUS");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        BtnBatal.setText("BATAL");
        BtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalActionPerformed(evt);
            }
        });

        TableJenis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableJenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableJenisMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableJenis);

        javax.swing.GroupLayout PanelJenisLayout = new javax.swing.GroupLayout(PanelJenis);
        PanelJenis.setLayout(PanelJenisLayout);
        PanelJenisLayout.setHorizontalGroup(
            PanelJenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJenisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelJenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelJenisLayout.createSequentialGroup()
                        .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelJenisLayout.setVerticalGroup(
            PanelJenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJenisLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(PanelJenisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainPanel.add(PanelJenis, "card2");

        PanelTambah.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TAMBAH DATA JENIS");

        BtnTambah1.setText("TAMBAH");
        BtnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambah1ActionPerformed(evt);
            }
        });

        BtnHapus1.setText("HAPUS");
        BtnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapus1ActionPerformed(evt);
            }
        });

        BtnBatal1.setText("BATAL");
        BtnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatal1ActionPerformed(evt);
            }
        });

        IDJenis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDJenis.setText("ID Jenis");

        TextIDJenis.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        NamaJenis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NamaJenis.setText("Nama Jenis");

        TextNama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelTambahLayout = new javax.swing.GroupLayout(PanelTambah);
        PanelTambah.setLayout(PanelTambahLayout);
        PanelTambahLayout.setHorizontalGroup(
            PanelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTambahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextIDJenis)
                    .addComponent(TextNama, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(PanelTambahLayout.createSequentialGroup()
                        .addGroup(PanelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTambahLayout.createSequentialGroup()
                                .addComponent(BtnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(IDJenis)
                            .addComponent(NamaJenis))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelTambahLayout.setVerticalGroup(
            PanelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTambahLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(PanelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(IDJenis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextIDJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaJenis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        MainPanel.add(PanelTambah, "card2");

        add(MainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();
        
        MainPanel.add(PanelTambah);
        MainPanel.repaint();
        MainPanel.revalidate();
        
        if (BtnTambah.getText() == "UBAH") {
            MainPanel.removeAll();
            MainPanel.repaint();
            MainPanel.revalidate();
        
            MainPanel.add(PanelTambah);
            MainPanel.repaint();
            MainPanel.revalidate();
            
            jLabel3.setText("UBAH DATA JENIS");
            BtnTambah1.setText("SIMPAN");
            
        }
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Apakah Yakin Ingin Menghapus Data", "Message", JOptionPane.YES_NO_OPTION);
            if (a==0) {
                try {
                    stmt = con.createStatement();
                    String hapus = "DELETE FROM jns_barang WHERE id_jenis = '" + TextIDJenis.getText() + "'";
                    stmt.executeUpdate(hapus);  
                    
                    isitabel();
                    
                    JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus");
                    BtnTambah.setText("TAMBAH");
                    BtnHapus.setVisible(false);
                    BtnBatal.setVisible(false);
                    
                    bersih();
                    BtnHapus1.setVisible(true);
                    TextIDJenis.setEditable(true);
                } catch (Exception e) {
                    System.err.println("Error : " + e.getMessage());
                }
            }
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
        BtnHapus.setVisible(false);
        BtnBatal.setVisible(false);
        
        BtnTambah.setText("TAMBAH");
        
        jLabel3.setText("TAMBAH DATA JENIS");
        TextIDJenis.setEditable(true);        
        BtnTambah1.setText("TAMBAH");
        BtnHapus1.setVisible(true);
        
        bersih();
    }//GEN-LAST:event_BtnBatalActionPerformed

    private void BtnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambah1ActionPerformed
        try {
            stmt = con.createStatement();
            if(TextIDJenis.getText().equals("") || TextNama.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Isi semua data terlebih dahulu");
                return;
            }
            
            //simpan
            if(BtnTambah1.getText() == "TAMBAH") {
                String cek = "SELECT * FROM jns_barang WHERE id_jenis = '" + TextIDJenis.getText() + "'";
                rs = stmt.executeQuery(cek);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "ID Jenis ini Sudah Ada");
                }else{
                    String sql = "INSERT INTO jns_barang VALUES ('" + TextIDJenis.getText() + 
                            "','" + TextNama.getText() + "')";
                    stmt.executeUpdate(sql);
                    
                    JOptionPane.showMessageDialog(null, "Data Berhasil di Input");
                    bersih();
                    isitabel();
                    
                    MainPanel.removeAll();
                    MainPanel.repaint();
                    MainPanel.revalidate();
        
                    MainPanel.add(PanelJenis);
                    MainPanel.repaint();
                    MainPanel.revalidate();
                }
            }else{
                String update = "UPDATE jns_barang SET nm_jenis = '" + TextNama.getText() +
                        "' WHERE id_jenis = '" + TextIDJenis.getText() + "'";
                stmt.executeUpdate(update);
                
                JOptionPane.showMessageDialog(null, "Data Berhasil di Ubah");
                bersih();
                isitabel();
                
                BtnHapus.setVisible(false);
                BtnBatal.setVisible(false);
                jLabel3.setText("TAMBAH DATA JENIS");
                BtnTambah.setText("TAMBAH");
                
                BtnTambah1.setText("TAMBAH");
                BtnHapus1.setVisible(true);
        
                MainPanel.removeAll();
                MainPanel.repaint();
                MainPanel.revalidate();
        
                MainPanel.add(PanelJenis);
                MainPanel.repaint();
                MainPanel.revalidate();
            }
        } catch (Exception e) {
            System.err.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_BtnTambah1ActionPerformed

    private void BtnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapus1ActionPerformed
        bersih();
    }//GEN-LAST:event_BtnHapus1ActionPerformed

    private void BtnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatal1ActionPerformed
        MainPanel.removeAll();
        MainPanel.repaint();
        MainPanel.revalidate();
        
        MainPanel.add(PanelJenis);
        MainPanel.repaint();
        MainPanel.revalidate();
        
        bersih();
    }//GEN-LAST:event_BtnBatal1ActionPerformed

    private void TableJenisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableJenisMouseClicked
        BtnHapus.setVisible(true);
        BtnBatal.setVisible(true);
        
        BtnTambah.setText("UBAH");
        BtnHapus1.setVisible(false);
        
        TextIDJenis.setText(TableJenis.getValueAt(TableJenis.getSelectedRow(), 0).toString());
        TextNama.setText(TableJenis.getValueAt(TableJenis.getSelectedRow(), 1).toString());
        
        TextIDJenis.setEditable(false);
    }//GEN-LAST:event_TableJenisMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBatal;
    private javax.swing.JButton BtnBatal1;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnHapus1;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JButton BtnTambah1;
    private javax.swing.JLabel IDJenis;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel NamaJenis;
    private javax.swing.JPanel PanelJenis;
    private javax.swing.JPanel PanelTambah;
    private javax.swing.JTable TableJenis;
    private javax.swing.JTextField TextIDJenis;
    private javax.swing.JTextField TextNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
