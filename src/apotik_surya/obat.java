/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apotik_surya;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author altec
 */
public class obat extends javax.swing.JFrame {
    private String sql;
    private Statement st;
    private DefaultTableModel dtm;
    private ResultSet rs;
    /**
     * Creates new form obat
     */
    public obat() {
        initComponents();
        tampil_tabel();
    }
    public void tampil_tabel ()
    {
    try {
        Object [] rows = {"KODE OBAT", "NAMA OBAT", "JENIS OBAT", "HARGA OBAT", "STOK OBAT"};
        dtm = new DefaultTableModel(null, rows);
        tabel_obat.setModel(dtm);
        
        String kdobat="", nmobat="", jnsobat="", hrgobat="", stok="";
        try {
            Connection c = koneksiDB.getkoneksi();
            sql = "Select * from  obat order by kdobat asc";
            st = c.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                kdobat = rs.getString("kdobat");
                nmobat = rs.getString("nmobat");
                jnsobat = rs.getString("jnsobat");
                hrgobat = rs.getString("hrgobat");
                stok = rs.getString("stok");
                
                String [] tampil = {kdobat, nmobat , jnsobat, hrgobat, stok};
                dtm.addRow(tampil);
            }           
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Query Salah"+e.getMessage());
        }
        
    } catch (Exception e) {    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtkodeobat = new javax.swing.JTextField();
        txtnamaobat = new javax.swing.JTextField();
        txthargaobat = new javax.swing.JTextField();
        txtstokobat = new javax.swing.JTextField();
        cmbjnsobat = new javax.swing.JComboBox();
        save_obat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_obat = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_transaksi = new javax.swing.JButton();
        goto_menu = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Kode Obat");

        jLabel3.setText("Nama Obat");

        jLabel4.setText("Jenis Obat");

        jLabel5.setText("Harga Obat");

        jLabel6.setText("Stok Obat");

        cmbjnsobat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OBAT RINGAN", "OBAT SEDANG", "OBAT KERAS" }));

        save_obat.setBackground(new java.awt.Color(102, 255, 153));
        save_obat.setText("SIMPAN");
        save_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_obatActionPerformed(evt);
            }
        });

        tabel_obat.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_obat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_obatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_obat);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("ENTRY DATA OBAT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        btn_transaksi.setText("TRANSAKSI");
        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });

        goto_menu.setText("<<");
        goto_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goto_menuActionPerformed(evt);
            }
        });

        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbjnsobat, 0, 317, Short.MAX_VALUE)
                                    .addComponent(txtnamaobat)
                                    .addComponent(txthargaobat)
                                    .addComponent(txtkodeobat)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(txtstokobat, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(save_obat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus)
                        .addGap(34, 34, 34)
                        .addComponent(btn_transaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(goto_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtkodeobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbjnsobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txthargaobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtstokobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtnamaobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(btn_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(goto_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save_obat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_obatActionPerformed
        try {
            Connection c = koneksiDB.getkoneksi();
            sql = "insert into obat values ('"+txtkodeobat.getText()+"','"
                                              +txtnamaobat.getText()+"','"
                                              +cmbjnsobat.getSelectedItem()+"','"
                                              +txthargaobat.getText()+"','"
                                              +txtstokobat.getText()+"')";
            st = c.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_tabel ();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_save_obatActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        transaksi buka = new transaksi();
        buka.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void goto_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goto_menuActionPerformed
        halaman_utama buka = new halaman_utama();
        buka.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goto_menuActionPerformed

    private void tabel_obatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_obatMouseClicked
        txtkodeobat.setText(tabel_obat.getValueAt(tabel_obat.getSelectedRow(),0).toString());
        txtnamaobat.setText(tabel_obat.getValueAt(tabel_obat.getSelectedRow(),1).toString());
        cmbjnsobat.setActionCommand(tabel_obat.getValueAt(tabel_obat.getSelectedRow(),2).toString());
        txthargaobat.setText(tabel_obat.getValueAt(tabel_obat.getSelectedRow(),3).toString());
        txtstokobat.setText(tabel_obat.getValueAt(tabel_obat.getSelectedRow(),4).toString());
    }//GEN-LAST:event_tabel_obatMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        try {
            Connection c = koneksiDB.getkoneksi();
           sql = "update obat set nmobat = '"+txtnamaobat.getText()+
                                                "',jnsobat = '"+cmbjnsobat.getSelectedItem()+
                                                "', hrgobat = '"+txthargaobat.getText()+
                                                "', stok = '"+txtstokobat.getText()+
                                                "' where kdobat = '"+txtkodeobat.getText()+"'";
           
            st = c.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Berhasil Diedit","Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_tabel ();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diedit"+e.getMessage());
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
       int ok=JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin ?","Peringatan", JOptionPane.YES_NO_OPTION);
       if(ok==0){
           try {
               Connection c = koneksiDB.getkoneksi();
               sql = "delete from obat where kdobat = '"+txtkodeobat.getText()+"'";
               st = c.createStatement();
               st.executeUpdate(sql);
               JOptionPane.showMessageDialog(null, "Data Dihapus","Informasi", JOptionPane.INFORMATION_MESSAGE);
               tampil_tabel();
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+e.getMessage());
           }
       }
    }//GEN-LAST:event_btn_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new obat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JComboBox cmbjnsobat;
    private javax.swing.JButton goto_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save_obat;
    private javax.swing.JTable tabel_obat;
    private javax.swing.JTextField txthargaobat;
    private javax.swing.JTextField txtkodeobat;
    private javax.swing.JTextField txtnamaobat;
    private javax.swing.JTextField txtstokobat;
    // End of variables declaration//GEN-END:variables
}
