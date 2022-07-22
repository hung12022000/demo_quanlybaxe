package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import BLL.QLNhanVienBLL;
import DTO.NhanVienDTO;

import javax.swing.ScrollPaneConstants;
import javax.swing.JPasswordField;


public class QLNhanVienGUI {
	
	
	
	
	private JTable 	   tbQLNhanVien;
	private JTextField tfTenTaiKhoan;
	private JTextField tfTenNhanVien;
	private JTextField tfEmail;
	
	
	
	
	private JPanel pnTongQuanQLNhanVien;
	private JComboBox<String> cbbLoaiTaiKhoan;

	static QLNhanVienGUI instance=null;
	private JPasswordField pfPass;
	private boolean isShow = false;
	
	
	private QLNhanVienGUI(){
		initialize();
		loadResources();
	}
	
	private void loadResources() {
		tbQLNhanVien.setModel(QLNhanVienBLL.getInstance().getResources());
	}
	
	private void reloadResources() {
		DefaultTableModel dm = (DefaultTableModel) tbQLNhanVien.getModel();
		dm.getDataVector().removeAllElements();
		dm.fireTableDataChanged();
		//tbQLNhanVien.setModel(QLNhanVienBLL.getInstance().reloadResources());
	}
	
	
	public static QLNhanVienGUI getInstance() {
		if(instance == null)
			instance = new QLNhanVienGUI();
		return instance;
	}
	
	public JPanel getPnTongQuanQLNhanVien() {
		return pnTongQuanQLNhanVien;
	}
	
	private void clearField() {
		tfEmail.setText("");
		pfPass.setText("");
		tfTenNhanVien.setText("");
		tfTenTaiKhoan.setText("");
		cbbLoaiTaiKhoan.setSelectedIndex(0);
	}
	
	private void initialize() {
		
		
		pnTongQuanQLNhanVien = new JPanel();
		pnTongQuanQLNhanVien.setBackground(SystemColor.activeCaption);
		pnTongQuanQLNhanVien.setBounds(0, 0, 1065, 560);
		pnTongQuanQLNhanVien.setLayout(null);
		
		JPanel pnTieuDeQLNhanVien = new JPanel();
		pnTieuDeQLNhanVien.setBackground(SystemColor.activeCaption);
		pnTieuDeQLNhanVien.setBounds(0, 0, 1065, 71);
		pnTongQuanQLNhanVien.add(pnTieuDeQLNhanVien);
		pnTieuDeQLNhanVien.setLayout(null);
		
		JLabel lblQLNhanVien = new JLabel("QUẢN LÝ TÀI KHOẢN");
		lblQLNhanVien.setForeground(Color.RED);
		lblQLNhanVien.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblQLNhanVien.setBounds(394, 11, 291, 31);
		pnTieuDeQLNhanVien.add(lblQLNhanVien);
		
		JPanel pnQLNhanVien = new JPanel();
		pnQLNhanVien.setBounds(0, 71, 1065, 230);
		pnTongQuanQLNhanVien.add(pnQLNhanVien);
		pnQLNhanVien.setLayout(null);
		
		tbQLNhanVien = new JTable();
		tbQLNhanVien.setBounds(0, 0, 1050, 200);
		JScrollPane sc = new JScrollPane(tbQLNhanVien, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		sc.setBounds(0, 0, 1055, 230);
		tbQLNhanVien.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if (tbQLNhanVien.getSelectedRow()<0)
					return;
				tfTenTaiKhoan.setText(tbQLNhanVien.getValueAt(tbQLNhanVien.getSelectedRow(), 2).toString());
				//pfPass.setText(tbQLNhanVien.getValueAt(tbQLNhanVien.getSelectedRow(), 3).toString());
				tfTenNhanVien.setText(tbQLNhanVien.getValueAt(tbQLNhanVien.getSelectedRow(), 4).toString());
				cbbLoaiTaiKhoan.setSelectedItem(tbQLNhanVien.getValueAt(tbQLNhanVien.getSelectedRow(), 5).toString());
				tfEmail.setText(tbQLNhanVien.getValueAt(tbQLNhanVien.getSelectedRow(), 6).toString());
			}
		});
		pnQLNhanVien.add(sc,BorderLayout.CENTER);
		
		JPanel pnThongTinNhanVien = new JPanel();
		pnThongTinNhanVien.setBackground(SystemColor.activeCaption);
		pnThongTinNhanVien.setBounds(0, 304, 1065, 256);
		pnTongQuanQLNhanVien.add(pnThongTinNhanVien);
		pnThongTinNhanVien.setLayout(null);
		
		JLabel lblThongTinNhanVien = new JLabel("THÔNG TIN TÀI KHOẢN");
		lblThongTinNhanVien.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblThongTinNhanVien.setBounds(10, 5, 208, 22);
		pnThongTinNhanVien.add(lblThongTinNhanVien);
		
		JPanel pnThongTinNhap = new JPanel();
		pnThongTinNhap.setBackground(SystemColor.inactiveCaptionBorder);
		pnThongTinNhap.setBounds(10, 27, 842, 219);
		pnThongTinNhanVien.add(pnThongTinNhap);
		pnThongTinNhap.setLayout(null);
		
		JLabel lblMessage = new JLabel("(*) Không được bỏ trống");
		lblMessage.setForeground(Color.RED);
		lblMessage.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblMessage.setBounds(125, 11, 654, 34);
		pnThongTinNhap.add(lblMessage);
		
		JLabel lblTenNhanVien = new JLabel("Tên nhân viên:*");
		lblTenNhanVien.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTenNhanVien.setBounds(24, 116, 91, 30);
		pnThongTinNhap.add(lblTenNhanVien);
		
		tfTenNhanVien = new JTextField();
		tfTenNhanVien.setBounds(125, 116, 258, 31);
		pnThongTinNhap.add(tfTenNhanVien);
		tfTenNhanVien.setColumns(10);
		
		JLabel lblLoaiTaiKhoan = new JLabel("Chức vụ:*");
		lblLoaiTaiKhoan.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblLoaiTaiKhoan.setBounds(420, 116, 91, 30);
		pnThongTinNhap.add(lblLoaiTaiKhoan);
		
		cbbLoaiTaiKhoan = new JComboBox<String>();
		cbbLoaiTaiKhoan.setBounds(521,  116, 258, 31);
		cbbLoaiTaiKhoan.addItem("");
		cbbLoaiTaiKhoan.addItem("Nhân viên");
		cbbLoaiTaiKhoan.addItem("Quản trị hệ thống");
		pnThongTinNhap.add(cbbLoaiTaiKhoan);
		
		
		JLabel lblTaiKhoan = new JLabel("Tên tài khoản:*");
		lblTaiKhoan.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTaiKhoan.setBounds(24, 56, 91, 30);
		pnThongTinNhap.add(lblTaiKhoan);
		
		tfTenTaiKhoan = new JTextField();
		tfTenTaiKhoan.setBounds(125, 56, 258, 31);
		pnThongTinNhap.add(tfTenTaiKhoan);
		tfTenTaiKhoan.setColumns(10);
		
		JLabel lblMatKhau = new JLabel("Mật khẩu:*");
		lblMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblMatKhau.setBounds(420, 56, 91, 30);
		pnThongTinNhap.add(lblMatKhau);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblEmail.setBounds(24, 177, 91, 30);
		pnThongTinNhap.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(125, 177, 258, 31);
		pnThongTinNhap.add(tfEmail);
		
		pfPass = new JPasswordField();
		pfPass.setBounds(521, 56, 152, 30);
		pnThongTinNhap.add(pfPass);
		
		JButton btnShowPass = new JButton("Hiển thị");
		btnShowPass.setBounds(683, 56, 96, 30);
		pnThongTinNhap.add(btnShowPass);
		btnShowPass.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isShow) {
					isShow = false;
					pfPass.setEchoChar((char)0);
				}
				else {
					isShow = true;
					pfPass.setEchoChar('*');
				}
			}
		});
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setIcon(new ImageIcon("icon\\new.png"));
		btnThem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnThem.setBounds(896, 26, 138, 41);
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		pnThongTinNhanVien.add(btnThem);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.setIcon(new ImageIcon("icon\\setting.png"));
		btnSua.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSua.setBounds(896, 85, 138, 41);
		btnSua.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		pnThongTinNhanVien.add(btnSua);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.setIcon(new ImageIcon("icon\\del.png"));
		btnHuy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnHuy.setBounds(896, 143, 138, 41);
		btnHuy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				clearField();
			}
		});
		pnThongTinNhanVien.add(btnHuy);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setIcon(new ImageIcon("icon\\delete.png"));
		btnXoa.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnXoa.setBounds(896, 204, 138, 41);
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		pnThongTinNhanVien.add(btnXoa);
	}
}
