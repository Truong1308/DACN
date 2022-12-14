/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Database.ConnectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguye
 */
public class CaNhanJFrame extends javax.swing.JFrame 
{
    ConnectDB cnn = new ConnectDB();
    Locale localeEN = new Locale("en", "EN");
    NumberFormat en = NumberFormat.getInstance(localeEN);
    Calendar cal = Calendar.getInstance();

    int day = cal.get(Calendar.DAY_OF_MONTH);
    int month = cal.get(Calendar.MONTH) + 1;
    int year = cal.get(Calendar.YEAR);
    /**
     * Creates new form CaNhanJFrame
     */
    int manv;
    public CaNhanJFrame() {
        initComponents();
    }
    public CaNhanJFrame(int a) 
    {
        initComponents();
        manv = a;
        HienLuong();
        HienVang();
        
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVang = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        cbbThangNghi = new javax.swing.JComboBox<>();
        cbbNamNghi = new javax.swing.JComboBox<>();
        chkXemThanh = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLuong = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        cbbThan = new javax.swing.JComboBox<>();
        cbbNam = new javax.swing.JComboBox<>();
        chkXem = new javax.swing.JCheckBox();

        tblVang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "H??? T??n", "Ng??y V???ng", "Ph??p"
            }
        ));
        jScrollPane2.setViewportView(tblVang);

        cbbThangNghi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThangNghiItemStateChanged(evt);
            }
        });

        cbbNamNghi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbNamNghiItemStateChanged(evt);
            }
        });

        chkXemThanh.setText("Xem th??ng");
        chkXemThanh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkXemThanhItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(chkXemThanh)
                .addGap(18, 18, 18)
                .addComponent(cbbThangNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cbbNamNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbThangNghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNamNghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkXemThanh))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(489, 489, 489)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(108, 108, 108))
        );

        jTabbedPane1.addTab("Ng??y ngh???", jPanel2);

        tblLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "H??? T??n", "L????ng C?? B???n", "H??? S???", "T???ng L????ng", "Ghi Ch??"
            }
        ));
        jScrollPane1.setViewportView(tblLuong);
        if (tblLuong.getColumnModel().getColumnCount() > 0) {
            tblLuong.getColumnModel().getColumn(0).setMinWidth(50);
            tblLuong.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        cbbThan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThanItemStateChanged(evt);
            }
        });

        cbbNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbNamItemStateChanged(evt);
            }
        });

        chkXem.setText("Xem l????ng");
        chkXem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkXemItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkXem)
                .addGap(18, 18, 18)
                .addComponent(cbbThan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbThan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkXem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(567, 567, 567)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("L????ng", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbbThangNghiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThangNghiItemStateChanged
        // TODO add your handling code here:
        if (chkXemThanh.isSelected())
        {
            XemVang("YEAR(NgayVang) = "+cbbNamNghi.getSelectedItem().toString()+"and MONTH(NgayVang) = "+cbbThangNghi.getSelectedItem().toString());
        }
        
    }//GEN-LAST:event_cbbThangNghiItemStateChanged

    private void cbbNamNghiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbNamNghiItemStateChanged
        // TODO add your handling code here:
        if (chkXemThanh.isSelected())
        {
            XemVang("YEAR(NgayVang) = "+cbbNamNghi.getSelectedItem().toString()+"and MONTH(NgayVang) = "+cbbThangNghi.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbbNamNghiItemStateChanged

    private void chkXemThanhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkXemThanhItemStateChanged
        // TODO add your handling code here:
        if (chkXemThanh.isSelected())
        {
            HienVang();
        }
        if (!chkXemThanh.isSelected())
        {
            HienVang();
        }
    }//GEN-LAST:event_chkXemThanhItemStateChanged

    private void chkXemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkXemItemStateChanged
        // TODO add your handling code here:
        if (chkXem.isSelected())
        {
            layDuLieuLuongNhanVien(manv);
        }
        if (!chkXem.isSelected())
        {
            layDuLieuLuongNhanVien(manv);
        }
    }//GEN-LAST:event_chkXemItemStateChanged

    private void cbbNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbNamItemStateChanged
        // TODO add your handling code here:
        if (chkXem.isSelected())
        {
            XemLuong("YEAR(NgayNhan) = "+cbbNam.getSelectedItem().toString()+"and MONTH(NgayNhan) = "+cbbThan.getSelectedItem().toString());

        }
    }//GEN-LAST:event_cbbNamItemStateChanged

    private void cbbThanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThanItemStateChanged
        // TODO add your handling code here:
        if (chkXem.isSelected())
        {
            XemLuong("YEAR(NgayNhan) = "+cbbNam.getSelectedItem().toString()+"and MONTH(NgayNhan) = "+cbbThan.getSelectedItem().toString());

        }
    }//GEN-LAST:event_cbbThanItemStateChanged

    
    public void HienLuong()
    {
        layDuLieuLuongNhanVien(manv);
        
        
        for (int i = 1; i < 13; i++)
        {
            cbbThan.addItem(String.valueOf(i));
        }
        for (int i = year; i > 2000; i--)
        {
            cbbNam.addItem(String.valueOf(i));
        }
        cbbThan.setSelectedItem(String.valueOf(month));
        cbbNam.setSelectedItem(String.valueOf(year));
        for (int i = 1; i < 13; i++)
        {
            cbbThangNghi.addItem(String.valueOf(i));
        }
        for (int i = year; i > 2000; i--)
        {
            cbbNamNghi.addItem(String.valueOf(i));
        }
        cbbNamNghi.setSelectedItem(String.valueOf(year));
        cbbThangNghi.setSelectedItem(String.valueOf(month));
    }
    public void XemLuong(String wherethang)
    {
        String cautruyvan ="select MaLuongNhanVien,NhanVien.TenNhanVien as TenNhanVien,"
                + "LuongCoBan,HeSoLuong,TienThuong,TongLuong,NgayNhan,LuongNhanVien.GhiChu as GhiChu "
                + "from LuongNhanVien,NhanVien where LuongNhanVien.MaNhanVien = NhanVien.MaNhanVien and NhanVien.MaNhanVien = "+manv+"and " +wherethang;
        ResultSet rs = cnn.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "T??n NV", "L????ng C?? B???n", "H??? S???", "Ti???n Th?????ng","T???ng L????ng", "Ch?? Th??ch"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblLuong.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[7];
                item[0] = c;
                Locale localeVN = new Locale("vi", "VN");
                NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
                item[1] = rs.getString("TenNhanVien");
                long LCB = rs.getLong("LuongCoBan");
                String str = currencyVN.format(LCB);
                item[2] = str;
                item[3] = rs.getString("HeSoLuong");
                long longNumber = rs.getLong("TienThuong");  
                String str1 = currencyVN.format(longNumber);
                item[4] = str1;
                long longNumber1 = rs.getLong("TongLuong");
                String str2 = currencyVN.format(longNumber1);
                item[5] = str2;
                
                item[6] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public void layDuLieuLuongNhanVien(int Manv) 
    {
        String cautruyvan = "";
        cautruyvan = "select MaLuongNhanVien,NhanVien.TenNhanVien as TenNhanVien,LuongCoBan,HeSoLuong,TienThuong,TongLuong,NgayNhan,LuongNhanVien.GhiChu as GhiChu from LuongNhanVien,NhanVien where LuongNhanVien.MaNhanVien = NhanVien.MaNhanVien and NhanVien.MaNhanVien = "+manv;
        ResultSet rs = cnn.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "T??n NV", "L????ng C?? B???n", "H??? S???", "Ti???n Th?????ng","T???ng L????ng", "Ch?? Th??ch"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblLuong.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[7];
                item[0] = c;
                Locale localeVN = new Locale("vi", "VN");
                NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
                item[1] = rs.getString("TenNhanVien");
                long LCB = rs.getLong("LuongCoBan");
                String str = currencyVN.format(LCB);
                item[2] = str;
                item[3] = rs.getString("HeSoLuong");
                long longNumber = rs.getLong("TienThuong");
                
                
                String str1 = currencyVN.format(longNumber);
                item[4] = str1;
                long longNumber1 = rs.getLong("TongLuong");
                String str2 = currencyVN.format(longNumber1);
                item[5] = str2;
                
                item[6] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }  
    public void XemVang(String wherethnam)
    {
        String TT ="1";
        String cautruyvan = "select NhanVien.TenNhanVien as TenNV,DiemDanh.NgayVang as Ngay,DiemDanh.CoVang as Vang,DiemDanh.CoPhep as Phep from DiemDanh,NhanVien where NhanVien.MaNhanVien = DiemDanh.MaNhanVien and DiemDanh.CoVang = "+TT+"and NhanVien.MaNhanVien = "+manv+"and "+wherethnam;
        ResultSet rs = cnn.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "H??? T??n","Ng??y V???ng","Ph??p"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblVang.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[4];
                item[0] = c;                
                item[1] = rs.getString("TenNV");                              
                item[2] = rs.getString("Ngay");
                if (rs.getInt("Phep") == 1) {
                    item[3] = "C??";
                } else {
                    item[3] = "Kh??ng";
                }
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public void HienVang()
    {
        String TT ="1";
        String cautruyvan = "select NhanVien.TenNhanVien as TenNV,DiemDanh.NgayVang as Ngay,DiemDanh.CoVang as Vang,DiemDanh.CoPhep as Phep from DiemDanh,NhanVien where NhanVien.MaNhanVien = DiemDanh.MaNhanVien and DiemDanh.CoVang = "+TT+"and DiemDanh.MaNhanVien = "+manv;
        ResultSet rs = cnn.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "H??? T??n","Ng??y V???ng","Ph??p"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblVang.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[4];
                item[0] = c;                
                item[1] = rs.getString("TenNV");                              
                item[2] = rs.getString("Ngay");
                if (rs.getInt("Phep") == 1) {
                    item[3] = "C??";
                } else {
                    item[3] = "Kh??ng";
                }
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
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
            java.util.logging.Logger.getLogger(CaNhanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaNhanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaNhanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaNhanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaNhanJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbNam;
    private javax.swing.JComboBox<String> cbbNamNghi;
    private javax.swing.JComboBox<String> cbbThan;
    private javax.swing.JComboBox<String> cbbThangNghi;
    private javax.swing.JCheckBox chkXem;
    private javax.swing.JCheckBox chkXemThanh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblLuong;
    private javax.swing.JTable tblVang;
    // End of variables declaration//GEN-END:variables
}
