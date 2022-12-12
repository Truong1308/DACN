        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.DanhMucBean;
import View.BaoHanhJPanel;
import View.ChiTietThongKeJPanel;
import View.DiemDanhJPanel;
import View.DoiTacJPanel;
import View.GiamDocJPanel;
import View.HDJPanel;

import View.KhachHangJPanel;
import View.LuongNhanVienJPanel;
import View.NhanVienJPanel;
import View.SanPhamJPanel;
import View.ThongKeJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author nguye
 */
public class ChuyenManHinhController 
{
    private JPanel root;
    private String kindSelected = "";
    private List<DanhMucBean> listItem = null;
    

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
        
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem)
    {
        kindSelected = "SanPham";
        jpnItem.setBackground(new Color(96,100,101));
        jlbItem.setBackground(new Color(96,100,101));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new SanPhamJPanel());
        root.validate();
        root.repaint();
    }
    public void setView1(JPanel jpnItem, JLabel jlbItem)
    {
        kindSelected = "KhacHang";
        jpnItem.setBackground(new Color(96,100,101));
        jlbItem.setBackground(new Color(96,100,101));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new KhachHangJPanel());
        root.validate();
        root.repaint();
    }
    public void setView2(JPanel jpnItem, JLabel jlbItem)
    {
        kindSelected = "ChiTietThongKe";
        jpnItem.setBackground(new Color(96,100,101));
        jlbItem.setBackground(new Color(96,100,101));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new ThongKeJPanel());
        root.validate();
        root.repaint();
    }
    public void setView3(JPanel jpnItem, JLabel jlbItem)
    {
        kindSelected = "NhanVien";
        jpnItem.setBackground(new Color(96,100,101));
        jlbItem.setBackground(new Color(96,100,101));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new NhanVienJPanel());
        root.validate();
        root.repaint();
    }
    public void setEnvent(List<DanhMucBean> listItem)
    {
        this.listItem = listItem;
        for (DanhMucBean item : listItem) 
        {
           item.getJlb().addMouseListener(new LableEnvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    class LableEnvent implements MouseListener
    {
        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LableEnvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        
        
        
        @Override
        public void mouseClicked(MouseEvent e) 
        {
            switch(kind)
            {   
                
                case "SanPham":
                    node = new SanPhamJPanel();
                    break;
                case "KhachHang":
                    node = new KhachHangJPanel();
                    break;
                case "HoaDon":
                    node = new HDJPanel();
                    break;
                case "DoiTac":
                    node = new DoiTacJPanel();
                    break;
                case "NhanVien":
                    node = new NhanVienJPanel();
                    break;
                case "LuongNhanVien":
                    node = new LuongNhanVienJPanel();
                    break;
                case "ChiTietThongKe":
                    node = new ChiTietThongKeJPanel();
                    break;
                case "DiemDanh":
                    node = new DiemDanhJPanel();
                    break;   
                case "BaoHanh":
                    node = new BaoHanhJPanel();
                    break;
                case "GiamDoc":
                    node = new GiamDocJPanel();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new  BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) 
        {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96,100,101));
            jlbItem.setBackground(new Color(96,100,101));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) 
        {
            jpnItem.setBackground(new Color(96,100,101));
            jlbItem.setBackground(new Color(96,100,101));
        }

        @Override
        public void mouseExited(MouseEvent e) 
        {
            if(!kindSelected.equalsIgnoreCase(kind))
            {
                jpnItem.setBackground(new Color(204,204,255));
                jlbItem.setBackground(new Color(204,204,255));
            }
        }
        
    }
    private void setChangeBackground(String kind)
    {
        for(DanhMucBean item : listItem)
        {
            if(item.getKind().equalsIgnoreCase(kind))
            {
                item.getJpn().setBackground(new Color(0,0,204));
                item.getJlb().setBackground(new Color(0,0,204));
            }else{
                item.getJpn().setBackground(new Color(204,204,255));
                item.getJlb().setBackground(new Color(204,204,255));
            }
        }
    }
}
