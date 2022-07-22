package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import BLL.DangNhapBLL;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;



public class QLDangNhapGUI {
	public static QLDangNhapGUI instance;
	private JFrame frame;
	private JTextField tfTaiKhoan;
	private JPasswordField pfMatKhau;
	private JLabel lblMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLDangNhapGUI window = getInstance();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static QLDangNhapGUI getInstance() {
		if(instance == null)
			instance = new QLDangNhapGUI();
		return instance;
	}

	public JFrame getFrame() {
		return frame;
	}
	
	
	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public QLDangNhapGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(370, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JPanel pnTongQuanDangNhap = new JPanel();
		pnTongQuanDangNhap.setBounds(0, 0, 624, 441);
		frame.getContentPane().add(pnTongQuanDangNhap);
		pnTongQuanDangNhap.setLayout(null);
		
		JPanel pnHinh = new JPanel();
		pnHinh.setBounds(0, 0, 327, 441);
		pnTongQuanDangNhap.add(pnHinh);
		pnHinh.setLayout(null);
		
		JLabel lblHinh = new JLabel("");
		lblHinh.setIcon(new ImageIcon("icon\\dangnhap.png"));
		lblHinh.setBounds(0, 0, 327, 441);
		pnHinh.add(lblHinh);
		
		JPanel pnDangNhap = new JPanel();
		pnDangNhap.setBounds(326, 0, 298, 441);
		pnTongQuanDangNhap.add(pnDangNhap);
		pnDangNhap.setLayout(null);
		
		JLabel lblTaiKhoan = new JLabel("Tên tài khoản:*");
		lblTaiKhoan.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTaiKhoan.setBounds(10, 140, 102, 20);
		pnDangNhap.add(lblTaiKhoan);
		
		
		pfMatKhau = new JPasswordField();
		pfMatKhau.setBounds(111, 195, 167, 26);
		pfMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 13));
		pnDangNhap.add(pfMatKhau);
		pfMatKhau.setColumns(10);
		pfMatKhau.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					System.out.println(pfMatKhau.getText());
					if (DangNhapBLL.getInstance().dangNhap(tfTaiKhoan.getText(), pfMatKhau.getText()))
						frame.setVisible(false);
					else {
						lblMessage.setText("Đăng nhập không thành công! vui lòng kiểm tra lại");
					}
				}
			}
		});
		
		JLabel lblMatKhau = new JLabel("Mật khẩu:*");
		lblMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMatKhau.setBounds(10, 195, 76, 27);
		pnDangNhap.add(lblMatKhau);
		
		lblMessage = new JLabel("(*) Không được để trống");
		lblMessage.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblMessage.setForeground(Color.RED);
		lblMessage.setBounds(122, 243, 156, 27);
		pnDangNhap.add(lblMessage);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(pfMatKhau.getText());
				if (DangNhapBLL.getInstance().dangNhap(tfTaiKhoan.getText(), pfMatKhau.getText()))
					frame.setVisible(false);
				else {
					lblMessage.setText("Đăng nhập không thành công! vui lòng kiểm tra lại");
				}
			}
		});
		btnDangNhap.setBackground(SystemColor.textHighlight);
		btnDangNhap.setForeground(Color.WHITE);
		btnDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDangNhap.setBounds(10, 293, 130, 41);
		btnDangNhap.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					System.out.println(pfMatKhau.getText());
					if (DangNhapBLL.getInstance().dangNhap(tfTaiKhoan.getText(), pfMatKhau.getText()))
						frame.setVisible(false);
					else {
						lblMessage.setText("Đăng nhập không thành công! vui lòng kiểm tra lại");
					}
				}
			}
		});
		pnDangNhap.add(btnDangNhap);
		
		JButton btnThoat = new JButton("THOÁT");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnThoat.setBackground(SystemColor.textHighlight);
		btnThoat.setForeground(Color.WHITE);
		btnThoat.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnThoat.setBounds(158, 293, 120, 41);
		pnDangNhap.add(btnThoat);
		
		tfTaiKhoan = new JTextField();
		tfTaiKhoan.setBounds(111, 137, 167, 26);
		tfTaiKhoan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		pnDangNhap.add(tfTaiKhoan);
		tfTaiKhoan.setColumns(10);
		tfTaiKhoan.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					System.out.println(pfMatKhau.getText());
					if (DangNhapBLL.getInstance().dangNhap(tfTaiKhoan.getText(), pfMatKhau.getText()))
						frame.setVisible(false);
					else {
						lblMessage.setText("Đăng nhập không thành công! vui lòng kiểm tra lại");
					}
				}
			}
		});
		
		JLabel lblDangNhap = new JLabel("ĐĂNG NHẬP");
		lblDangNhap.setBounds(80, 57, 149, 35);
		pnDangNhap.add(lblDangNhap);
		lblDangNhap.setForeground(Color.BLUE);
		lblDangNhap.setFont(new Font("Times New Roman", Font.BOLD, 24));
	}

}
