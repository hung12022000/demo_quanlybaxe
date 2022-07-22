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

import BLL.QLKhuVucBLL;
import BLL.QLViTriBLL;

public class QLViTriGUI {
	static QLViTriGUI instance = null;
	private JPanel pnMain;
	private JTable tbViTri;
	private JTextField tfTenViTri;
	private JTextField tfMaViTri;
	private JRadioButton rdbtnTrong;
	private JLabel lblMessage;

	
	private boolean isEdit = true;
	private JTextField tfTimKiem;
	
	private QLViTriGUI(String tenKhuVuc) {
		initialize();
		loadResources(tenKhuVuc);
		
	}

	private void loadResources(String tenKhuVuc) {
		tbViTri.setModel(QLViTriBLL.getInstance().getResources(tenKhuVuc));
	}
	
	public static QLViTriGUI getInstance(String tenKhuVuc) {
		if (instance == null)
			instance = new QLViTriGUI(tenKhuVuc);
			
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
		JLabel lblTitle = new JLabel("QUẢN LÝ VỊ TRÍ");
		lblTitle.setForeground(Color.RED);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTitle.setBounds(419, 11, 239, 39);
		pnTitle.add(lblTitle);
		
		//control cho danh sach
		tbViTri = new JTable();
		tbViTri.setBounds(0, 0, 1050, 500);
		JScrollPane sc = new JScrollPane(tbViTri, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sc.setBounds(0, 45, 1055, 447);
		tbViTri.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				System.out.println(tbViTri.getValueAt(tbViTri.getSelectedRow(), 3));
				pnMain.removeAll();
				QLGuiXe qlGuiXe = QLGuiXe.getInstance();
				
				//qlViTri.reloadResources();
				pnMain.add(qlGuiXe.getPnMain());
				pnMain.revalidate();
				pnMain.repaint();
			}
			
		});
		pnDanhSachKhuVuc.add(sc,BorderLayout.CENTER);
		
		
	}
		

}
