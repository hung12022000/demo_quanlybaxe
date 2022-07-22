package GUI;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class QuanTriHeThongGUI {

	private JFrame frmMain;
	private static QuanTriHeThongGUI instance = null;
	private QuanTriHeThongGUI(){
		init();
	}
	
	public static QuanTriHeThongGUI getInstance() {
		if (instance == null)
			instance = new QuanTriHeThongGUI();
		return instance;
	}
	
	public JFrame getFrmMain() {
		return frmMain;
	}
	
	void init() {
		frmMain = new JFrame("Quản lý bãi xe");
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.setBounds(100, 100, 1072, 650);//595
		frmMain.getContentPane().add(QLNhanVienGUI.getInstance().getPnTongQuanQLNhanVien());
		frmMain.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 560, 1072, 50);
		frmMain.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnThoat.setIcon(new ImageIcon("icon//logout.png"));
		btnThoat.setBounds(896, 5, 138, 41);
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frmMain.setVisible(false);
				QLDangNhapGUI.getInstance().getFrame().setVisible(true);
			}
		});
		panel.add(btnThoat);
		panel.setBackground(SystemColor.activeCaption);
		frmMain.repaint();
		frmMain.invalidate();
	}
	
}
