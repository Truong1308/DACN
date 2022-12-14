  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Database.ConnectDB;
import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author nguye
 */
public class DangKyJFrame extends javax.swing.JFrame 
{

    ConnectDB cnn = new ConnectDB();
    public static int quyen = 0;
    public static String ten = "";
    /**
     * Creates new form DangKyJFrame
     */
    public DangKyJFrame() {
        initComponents();
        cbbNhanVien.setModel(LayDuLieucbb("NhanVien", "TenNhanVien", "MaNhanVien"));
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
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNhapLaiMatKhau = new javax.swing.JPasswordField();
        txtMatKhau = new javax.swing.JPasswordField();
        txtTenDangNhap1 = new javax.swing.JTextField();
        btnTaotaikhoan = new javax.swing.JButton();
        lableDangNhap = new javax.swing.JLabel();
        cbbNhanVien = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4.PNG"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 102));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/manhavien.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/avatar (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 102));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lock (4).png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lock (3).png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        txtNhapLaiMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNhapLaiMatKhau.setForeground(new java.awt.Color(153, 153, 153));
        txtNhapLaiMatKhau.setText("jPasswordField1");

        txtMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(153, 153, 153));
        txtMatKhau.setText("jPasswordField1");

        txtTenDangNhap1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenDangNhap1.setForeground(new java.awt.Color(153, 153, 153));
        txtTenDangNhap1.setText("T??n ????ng nh???p");
        txtTenDangNhap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDangNhap1ActionPerformed(evt);
            }
        });

        btnTaotaikhoan.setText("T???o t??i kho???n");
        btnTaotaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTaotaikhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTaotaikhoanMouseExited(evt);
            }
        });
        btnTaotaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaotaikhoanActionPerformed(evt);
            }
        });

        lableDangNhap.setText("B???n ???? c?? t??i kho???n? ????ng nh???p ngay!");
        lableDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lableDangNhapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lableDangNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lableDangNhapMouseExited(evt);
            }
        });

        cbbNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbbNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhau)
                            .addComponent(txtNhapLaiMatKhau)
                            .addComponent(txtTenDangNhap1)
                            .addComponent(cbbNhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lableDangNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTaotaikhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenDangNhap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNhapLaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnTaotaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(lableDangNhap)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnTaotaikhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaotaikhoanMouseEntered
        // TODO add your handling code here:
        btnTaotaikhoan.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_btnTaotaikhoanMouseEntered

    private void btnTaotaikhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaotaikhoanMouseExited
        // TODO add your handling code here:
        btnTaotaikhoan.setBackground(new Color(0,84,104));
    }//GEN-LAST:event_btnTaotaikhoanMouseExited

    private void btnTaotaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaotaikhoanActionPerformed
        // TODO add your handling code here:
        String MaNhanVien, TenDangNhap1, Password, NhapLai, Quyen = "";

        MaNhanVien = GetCbbSelected(cbbNhanVien);
        TenDangNhap1 = txtTenDangNhap1.getText();
        Password = String.valueOf(txtMatKhau.getPassword()).trim();
        NhapLai = String.valueOf(txtNhapLaiMatKhau.getPassword()).trim();
        String cautruyvan = "select *from Quyen ";
        ResultSet rs = cnn.ExcuteQueryGetTable(cautruyvan);
        try {
            while (rs.next())
            {
                if (rs.getString("TenQuyen").equals("New"))
                {
                    Quyen = rs.getString("MaQuyen");
                }
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }

        boolean kt = true;

        try {
            if (MaNhanVien.equals("")|| checkNumber(MaNhanVien)==false)
            {
                ThongBao("M?? nh??n vi??n ch??a ch??nh x??c", "Th??ng b??o", 2);
            } else {
                if (TenDangNhap1.length() < 6 || TenDangNhap1.length() > 10)
                {
                    ThongBao("T??n ????ng nh???p ph???i t??? 6-10 k?? t???", "Th??ng b??o", 2);
                }
                else if (Password.length() < 6 || Password.length() > 50)
                {
                    ThongBao("M???t kh???u ph???i nh???p nhi???u h??n 6 k?? t??? v?? ??t h??n 50 k?? t???", "L???i ????ng k??", 2);
                }
                else if (!KiemTraChuaChuVaSo(Password))
                {
                    ThongBao("M???t kh???u ph???i bao g???m ch??? IN HOA, ch??? th?????ng v?? s???", "Th??ng b??o", 2);
                }
                else if (!Password.equals(NhapLai))
                {
                    ThongBao("Nh???p l???i m???t kh???u kh??ng kh???p", "Th??ng b??o", 2);
                    System.out.println(Password);
                    System.out.println(NhapLai);
                }
                else
                {
                    String cautruyvan3 = "select MaNhanVien from Users where MaNhanVien = '" + MaNhanVien + "'";
                    ResultSet rs3 = cnn.ExcuteQueryGetTable(cautruyvan3);
                    try {
                        rs3.next();
                        if (rs3.getString("MaNhanVien").equals(MaNhanVien))
                        {
                            kt = false;
                            ThongBao("Nh??n vi??n tr??n ???? c?? t??i kho???n", "Th??ng b??o", 2);
                        }

                    } catch (SQLException ex) {

                    }

                    String cautruyvan2 = "select TenDangNhap from Users where TenDangNhap= '" + TenDangNhap1 + "'";
                    ResultSet rs2 = cnn.ExcuteQueryGetTable(cautruyvan2);
                    try {
                        rs2.next();
                        if (rs2.getString("TenDangNhap").equals(TenDangNhap1))
                        {
                            kt = false;
                            ThongBao("???? t???n t???i t??n ????ng nh???p tr??n", "Th??ng b??o", 2);
                        }

                    } catch (SQLException ex) {
                        System.out.println("kh??ng c?? trong sql !c?? th??? t???o th??m");
                        kt = true;
                    }
                    if (kt == true)
                    {

                        String hashedText = getMD5(Password);
                        String ctv = "insert into Users values(" + MaNhanVien+ " ,'" + TenDangNhap1 + "' , '" + hashedText + "' ," + Quyen+ ", N' ')";
                        cnn.ExcuteQueryUpdateDB(ctv);
                        System.out.println(hashedText);
                        ThongBao("???? t???o t??i kho???n th??nh c??ng th??nh c??ng", "Th??ng b??o", 2);
                        Resall();
                    } else {
                        ThongBao("Kh??ng th??? Th??m t??i kho???n", "l???i", 2);
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(DangKyJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTaotaikhoanActionPerformed

    private void lableDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableDangNhapMouseClicked
        // TODO add your handling code here:
        DangNhapJFrame dn = new DangNhapJFrame();
        dn.show();
        this.dispose();
    }//GEN-LAST:event_lableDangNhapMouseClicked

    private void lableDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableDangNhapMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);
        lableDangNhap.setBorder(label_border);
    }//GEN-LAST:event_lableDangNhapMouseEntered

    private void lableDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableDangNhapMouseExited
        // TODO add your handling code here:
        Border label_create_accont_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        lableDangNhap.setBorder(label_create_accont_border);
    }//GEN-LAST:event_lableDangNhapMouseExited

    private void cbbNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbNhanVienActionPerformed

    private void txtTenDangNhap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDangNhap1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDangNhap1ActionPerformed
    
    public void Resall()
    {
        cbbNhanVien.setSelectedIndex(1);
        txtMatKhau.setText("");
        txtNhapLaiMatKhau.setText("");
        txtTenDangNhap1.setText("");
    }
    private boolean KiemTraChuaChuVaSo(String chuoi) {
        boolean ketqua = false;
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(chuoi);
        if (!(chuoi == chuoi.toLowerCase())) {
            ketqua = m.find();
        }
        return ketqua;
    }
   /* private String md5(char[] c)
    {
        try{
            MessageDigest digs = MessageDigest.getInstance("MD5");
            
            digs.update((new String(c)).getBytes("UTF8"));
            
            String str = new String (digs.digest());
            
            return str;
            
        }catch(Exception ex)
        {
            return "";
        }
    }*/
    public static boolean checkNumber(String s) throws Exception 
    {
        for(int i =0 ; i< s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
               
            }else return false;
        }
        return true;
    }
    public static String getMD5(String input) 
    {
        try 
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            return convertByteToHex(messageDigest);
        } catch (NoSuchAlgorithmException e) 
        {
            throw new RuntimeException(e);
        }
    }
    public static String convertByteToHex(byte[] data) 
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < data.length; i++) 
        {
          sb.append(Integer.toString((data[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    public boolean KiemTraEmail(String email) {
        boolean kq = false;
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern v = Pattern.compile(EMAIL_PATTERN);
        Matcher m = v.matcher(email);
        kq = m.matches();
        return kq;
    }
       
     public DefaultComboBoxModel LayDuLieucbb(String bang, String Ten, String Ma) 
    {
        String cautruyvan = "select *from " + bang;
        ResultSet rs = cnn.ExcuteQueryGetTable(cautruyvan);
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        try {
            while (rs.next()) {
                displayvalueModel valueModel = new displayvalueModel(rs.getString(Ten), rs.getString(Ma));
                cbbmodel.addElement(valueModel);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return cbbmodel;
    }
     
     public String GetCbbSelected(JComboBox cbb) 
    {
        Object[] obj = cbb.getSelectedObjects();
        displayvalueModel item = (displayvalueModel) obj[0];
        return item.displayvalue.toString();

    }
     public void setSelectedCombobox(String cbbselected, JComboBox cbb) 
    {
        for (int i = 0; i < cbb.getItemCount(); i++) {
            Object obj = cbb.getItemAt(i);
            if (obj != null) {
                displayvalueModel m = (displayvalueModel) obj;
                if (cbbselected.trim().equals(m.displayMember)) {
                    cbb.setSelectedItem(m);
                }
            }
        }
    }
     
    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
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
            java.util.logging.Logger.getLogger(DangKyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKyJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaotaikhoan;
    private javax.swing.JComboBox<String> cbbNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lableDangNhap;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtNhapLaiMatKhau;
    private javax.swing.JTextField txtTenDangNhap1;
    // End of variables declaration//GEN-END:variables
}
