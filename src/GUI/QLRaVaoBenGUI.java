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

import BLL.QLRaVaoBenBLL;
import BLL.QLViTriBLL;

public class QLRaVaoBenGUI {
	static QLRaVaoBenGUI instance = null;
	private JPanel pnMain;
	private JTable tbViTri;
	private JTextField tfTenViTri;
	private JTextField tfMaViTri;
	private JTextField tfDonGia;
	private JLabel lblMessage;

	
	private boolean isEdit = true;
	private JTextField tfTimKiem;
	
	private QLRaVaoBenGUI() {
		initialize();
		loadResources();
	}

	private void loadResources() {
		tbViTri.setModel(QLRaVaoBenBLL.getInstance().getResources());
	}
	
	public static QLRaVaoBenGUI getInstance() {
		if (instance == null)
			instance = new QLRaVaoBenGUI();
		return instance;
	}
	
	public JPanel getPnMain() {
		return pnMain;
	}
			
	public void reloadResources() {
		DefaultTableModel dm = (DefaultTableModel) tbViTri.getModel();
		dm.getDataVector().removeAllElements();
		dm.fireTableDataChanged();
		
	}
	
	private void setStateForTexfeild() {
		tfMaViTri.setEditable(isEdit);
	}
	
	private void clearField() {

		tfMaViTri.setText("");

		tfMaViTri.setText("");

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
		pnTitle.setBounds(0, 0, 1078, 60);
		pnMain.add(pnTitle);
		
		JPanel pnDanhSachKhuVuc = new JPanel();
		pnDanhSachKhuVuc.setLayout(null);
		pnDanhSachKhuVuc.setBackground(SystemColor.activeCaption);
		pnDanhSachKhuVuc.setBounds(0, 60, 1065, 500);
		pnMain.add(pnDanhSachKhuVuc);
		
		
		
		//add control
		//control of Title
		JLabel lblTitle = new JLabel("QUẢN LÝ RA VÀO BẾN");
		lblTitle.setForeground(Color.RED);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTitle.setBounds(419, 11, 280, 39);
		pnTitle.add(lblTitle);
		
		//control cho danh sach
		tbViTri = new JTable();
		tbViTri.setBounds(0, 0, 1050, 460);
		JScrollPane sc = new JScrollPane(tbViTri, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sc.setBounds(0, 45, 1055, 450);
		tbViTri.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				
			}
			
		});
		pnDanhSachKhuVuc.add(sc,BorderLayout.CENTER);
		
		tfTimKiem = new JTextField();
		tfTimKiem.setToolTipText("Nhập mã vé hoặc biển số xe,...");
		tfTimKiem.setBounds(559, 5, 337, 30);
		pnDanhSachKhuVuc.add(tfTimKiem);
		tfTimKiem.setColumns(10);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.setIcon(new ImageIcon("icon\\find.png"));
		btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnTimKiem.setBounds(919, 4, 134, 35);
		btnTimKiem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tfTimKiem.getText().length()==0)
					JOptionPane.showMessageDialog(null, "Bạn chưa nhập từ khóa cần tìm!","Thông báo",1);
				else
				{
					
				}
				
			}
		});
		pnDanhSachKhuVuc.add(btnTimKiem);
		
		
	}

}
