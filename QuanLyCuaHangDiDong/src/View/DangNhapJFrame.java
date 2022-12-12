/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Database.ConnectDB;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
/**
 *
 * @author nguye
 */
public class DangNhapJFrame extends javax.swing.JFrame 
{
    ConnectDB cnn = new ConnectDB();
    
    public static int quyen=0;
    public static String ten="",user="";
    /**
     * Creates new form DangNhapJFrame
     */
    public DangNhapJFrame() {
        initComponents();
        File file = new File("luumk.txt");
  
            // if file doesnt exists, then create it
        String tendangnhap="",matkhau="";
  
        FileReader fw;
        try 
        {
            fw = new FileReader(file);
            BufferedReader bw = new BufferedReader(fw);
            try 
            {
                tendangnhap=  bw.readLine();
                matkhau=  bw.readLine();
                bw.close();
            } 
            catch (IOException ex) {}

        } catch (FileNotFoundException ex) {
            System.out.println("không tìm thấy file lưu mk");
        }

        txtTenDangNhap.setText(tendangnhap);
        txtMatKhau.setText(matkhau);
         if(!tendangnhap.equals(""))
         {
            chkNhoMatKhau.setSelected(rootPaneCheckingEnabled);
            System.out.println("checked lưu mật khẩu");
         }else
            System.out.println("đã bỏ checkbox lưu mật khẩu\n\n");
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        chkNhoMatKhau = new javax.swing.JCheckBox();
        btnDangNhap = new javax.swing.JButton();
        lableDangKy = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1.PNG"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lock (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lock (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTenDangNhap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMatKhau.setText("jPasswordField1");

        chkNhoMatKhau.setText("Nhớ mật khẩu");

        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseExited(evt);
            }
        });
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        lableDangKy.setText("Bạn chưa có tài khoản? Đăng ký ngay!");
        lableDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lableDangKyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lableDangKyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lableDangKyMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Đăng Nhập");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(chkNhoMatKhau)
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMatKhau)
                            .addComponent(txtTenDangNhap))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lableDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(chkNhoMatKhau)
                .addGap(28, 28, 28)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lableDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
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

    private void btnDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseEntered
        // TODO add your handling code here:
        btnDangNhap.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_btnDangNhapMouseEntered

    private void btnDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseExited
        // TODO add your handling code here:
        btnDangNhap.setBackground(new Color(0,84,104));
    }//GEN-LAST:event_btnDangNhapMouseExited

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        String strUsername = txtTenDangNhap.getText().trim();
        String strPassword1 = String.valueOf(txtMatKhau.getPassword()).trim();
        String mahoa = getMD5(strPassword1);
        
        String cautruyvan="select * from Users where TenDangNhap= '"+strUsername+"' and Password= '"+mahoa+"'";
        ResultSet rs= cnn.ExcuteQueryGetTable(cautruyvan);
        String luumk="",luutdn="";
        if(chkNhoMatKhau.isSelected())
        {
            luutdn  = strUsername;
            luumk = strPassword1;
            //System.out.println("lưu mật khẩu");
        }
        else
        {
            luutdn  ="";
            luumk="";
            //System.out.println("không lưu mật khẩu");
        }
        try
        {
            File file = new File("luumk.txt");
            if (!file.exists())
            {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(luutdn+"\n"+luumk);
            bw.close();
            if( chkNhoMatKhau.isSelected())
            System.out.println("lưu phiên đăng nhập thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(KiemTra(strUsername, mahoa))
        {
            String TenQuyen = null;
            String cautruyvan5 = "Select * from Users where TenDangNhap = '"+txtTenDangNhap.getText()+"'";
            ResultSet rs5 = cnn.ExcuteQueryGetTable(cautruyvan5);
            try
            {
                while (rs5.next())
                {
                    int MaQuyen = rs5.getInt("Quyen");
                    String ctv4 = "select * from Quyen where MaQuyen = "+ MaQuyen;
                    ResultSet rs4 = cnn.ExcuteQueryGetTable(ctv4);
                    while(rs4.next())
                    {
                        TenQuyen = rs4.getString("TenQuyen");
                        System.out.println(TenQuyen);
                    }
                }
            }catch (SQLException ex)
            {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(TenQuyen.equals("New"))
            {
                ThongBao("Tài khoản của bạn chưa được cấp quyền, vui lòng liên hệ QTV", "Thông báo", 2);
            }else
            {

                System.out.println(strUsername);
                System.out.println(mahoa);

                MainJFrame TC = new MainJFrame(txtTenDangNhap.getText());

                TC.show();
                this.dispose();
            }
        
        } else {
            ThongBao("Bạn nhập sai tài khoản hoặc mật khẩu", "Lỗi đăng nhập", 2);
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void lableDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableDangKyMouseClicked
        // TODO add your handling code here:
        DangKyJFrame dk = new DangKyJFrame();
        dk.show();
        this.dispose();
    }//GEN-LAST:event_lableDangKyMouseClicked

    private void lableDangKyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableDangKyMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);
        lableDangKy.setBorder(label_border);
    }//GEN-LAST:event_lableDangKyMouseEntered

    private void lableDangKyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableDangKyMouseExited
        // TODO add your handling code here:
        Border label_create_accont_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        lableDangKy.setBorder(label_create_accont_border);
    }//GEN-LAST:event_lableDangKyMouseExited
    
    private boolean KiemTra(String tdn, String mk) 
    {
        boolean kq = false;
        String cautruyvan = "select * from Users where TenDangNhap= '" + tdn + "' and Password= '" + mk + "'";
        System.out.println(cautruyvan);
        ResultSet rs = cnn.ExcuteQueryGetTable(cautruyvan);
        try {
            if (rs.next()) 
            {
                kq = true;
                quyen = rs.getInt("Quyen");
                ten=rs.getString("TenNhanVien");
                user=rs.getString("UserName");
                System.out.println(" " + quyen);
                
            }
        } catch (SQLException ex) 
        {
            System.out.println("lỗi đăng nhập");
        }

        return kq;
    }
    
    
    //Kiểm tra tdn và mk
    private boolean KiemTraChuaChuVaSo(String chuoiCanKiemTra)
    {
        boolean ketQua = false;
        Pattern p = Pattern.compile(".*[a-zA-Z].*");
        Matcher m = p.matcher(chuoiCanKiemTra);
        if (!(chuoiCanKiemTra == chuoiCanKiemTra.toLowerCase()))
        {
              ketQua= m.find();
        }
          return ketQua;
    }
    //Gọi thông báo
    public static void ThongBao(String noiDungThongBao,  String tieuDeThongBao, int icon )
    {
        JOptionPane.showMessageDialog( new JFrame(), noiDungThongBao,
                    tieuDeThongBao, icon );
    }
    // Mã hóa MD5 password
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
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JCheckBox chkNhoMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lableDangKy;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}