/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import BLL.QLVeBLL;
import BLL.QLViTriBLL;
import com.toedter.calendar.JDateChooser;
import java.awt.Button;

/**
 *
 * @author MY LAPTOP
 */
public class HoaDonGUI {
    static HoaDonGUI instance = null;
        private JPanel pnMain;
        private JLabel lblMaHoaDon;
        private JLabel lTMaHoaDon;
        private JLabel lblMaNhanVien;
        private JLabel lTMaNhanVien;
        private JLabel lblBienSoXe;
        private JLabel lTBienSoXe;
        private JLabel lblMaVe;
        private JLabel lTMaVe;
        private JDateChooser jdNgayLap;
        private JLabel lblTenViTri;
	private JLabel lTMaViTri;
        private JLabel lblSoNgayGui;
        private JLabel lTSoNgayGui;
	private JLabel lblThanhTien;
        private JLabel lTThanhTien;
	
	private boolean isEdit = true;
	private JTextField tfTimKiem;
	
	private HoaDonGUI() {
		initialize();
		//loadResources();
	}

	/*private void loadResources() {
		tbViTri.setModel(QLVeBLL.getInstance().getResources());
	}*/
	
	public static HoaDonGUI getInstance() {
		if (instance == null)
			instance = new HoaDonGUI();
		return instance;
	}
	

	@SuppressWarnings("deprecation")
        private void initialize() {
                pnMain = new JPanel();
		pnMain.setLayout(null);
		pnMain.setBounds(0, 0, 1065, 560);
		pnMain.setBackground(Color.WHITE);
                
                JPanel pnTitle = new JPanel();
		pnTitle.setLayout(null);
		pnTitle.setBackground(SystemColor.activeCaption);
		pnTitle.setBounds(0, 0, 1078, 90);
		pnMain.add(pnTitle);
		
		JPanel pnHoaDon = new JPanel();
		pnHoaDon.setLayout(null);
		pnHoaDon.setBackground(SystemColor.activeCaption);
		pnHoaDon.setBounds(0, 92, 1078, 468);
		pnMain.add(pnHoaDon);
                
                JLabel lblTitle = new JLabel("Lập Hóa Đơn");
		lblTitle.setForeground(Color.RED);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblTitle.setBounds(350, 30, 300, 40);
		pnTitle.add(lblTitle);
                
                JLabel lblMaHoaDon = new JLabel("Mã Hóa Đơn   : ");
		lblMaHoaDon.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMaHoaDon.setBounds(200, 80, 140, 50);
		pnHoaDon.add(lblMaHoaDon);
                
                JLabel lTMaHoaDon = new JLabel("   *   ");
		lTMaHoaDon.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTMaHoaDon.setBounds(350, 80, 140, 50);
		pnHoaDon.add(lTMaHoaDon);
                
                JLabel lblMaNhanVien = new JLabel("Mã Nhân Viên : ");
		lblMaNhanVien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMaNhanVien.setBounds(600, 80, 150, 50);
		pnHoaDon.add(lblMaNhanVien);
                
                JLabel lTMaNhanVien = new JLabel("   *   ");
		lTMaNhanVien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTMaNhanVien.setBounds(750, 80, 150, 50);
		pnHoaDon.add(lTMaNhanVien);
                
                JLabel lblBienSoXe = new JLabel("Biển Số Xe      : ");
		lblBienSoXe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblBienSoXe.setBounds(200, 150, 140, 50);
		pnHoaDon.add(lblBienSoXe);
                
                JLabel lTBienSoXe = new JLabel("   *   ");
		lTBienSoXe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTBienSoXe.setBounds(350, 150, 140, 50);
		pnHoaDon.add(lTBienSoXe);
                
                JLabel lblMaVe = new JLabel("Mã Vé               : ");
		lblMaVe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMaVe.setBounds(600, 150, 150, 50);
		pnHoaDon.add(lblMaVe);
                
                JLabel lTMaVe = new JLabel("   *   ");
		lTMaVe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTMaVe.setBounds(750, 150, 150, 50);
		pnHoaDon.add(lTMaVe);
                
                JLabel lblNgayLap= new JLabel("Ngày Lập        : ");
		lblNgayLap.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNgayLap.setBounds(200, 220, 140, 50);
		pnHoaDon.add(lblNgayLap);
                
                JLabel lTNgayLap = new JLabel("   *   ");
		lTNgayLap.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTNgayLap.setBounds(350, 220, 140, 50);
		pnHoaDon.add(lTNgayLap);
                
                JLabel lblMaViTri = new JLabel("Mã Vị Trí          : ");
		lblMaViTri.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMaViTri.setBounds(600, 220, 150, 50);
		pnHoaDon.add(lblMaViTri);
                
                JLabel lTMaViTri = new JLabel("   *   ");
		lTMaViTri.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTMaViTri.setBounds(750, 220, 150, 50);
		pnHoaDon.add(lTMaViTri);
                
                JLabel lblSoNgayGui= new JLabel("Số Ngày Gửi   : ");
		lblSoNgayGui.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSoNgayGui.setBounds(200, 290, 140, 50);
		pnHoaDon.add(lblSoNgayGui);
                
                JLabel lTSoNgayGui= new JLabel("   *   ");
		lTSoNgayGui.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTSoNgayGui.setBounds(350, 290, 140, 50);
		pnHoaDon.add(lTSoNgayGui);
                
                JLabel lblThanhTien = new JLabel("Thành Tiền       : ");
		lblThanhTien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblThanhTien.setBounds(600, 290, 150, 50);
		pnHoaDon.add(lblThanhTien);
                
                JLabel lTThanhTien = new JLabel("   *   ");
		lTThanhTien.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTThanhTien.setBounds(750, 290, 150, 50);
		pnHoaDon.add(lTThanhTien);
                
                Button btnLap = new Button(" Lập ");
                btnLap.setFont(new Font("Times New Roman", Font.BOLD, 24));
                btnLap.setBounds(425,370 , 150, 50);
                btnLap.setForeground(Color.white);
                btnLap.setBackground(Color.MAGENTA);
                btnLap.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                   
                    }
                });
                pnHoaDon.add(btnLap);
        }
}
