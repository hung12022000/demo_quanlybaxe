package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import BLL.QLKhuVucBLL;



public class QLKhuVucGUI {
	static QLKhuVucGUI instance = null;
	private JPanel pnMain;
	private JTable tbKhuVuc;
	

	
	private boolean isEdit = true;
	private JTextField tfTimKiem;
	
	private QLKhuVucGUI() {
		initialize();
		loadResources();
	}

	private void loadResources() {
		tbKhuVuc.setModel(QLKhuVucBLL.getInstance().getResources());
	}
	
	public static QLKhuVucGUI getInstance() {
		if (instance == null)
			instance = new QLKhuVucGUI();
		return instance;
	}
	
	public JPanel getPnMain() {
		return pnMain;
	}
			
	public void reloadResources() {
		DefaultTableModel dm = (DefaultTableModel) tbKhuVuc.getModel();
		dm.getDataVector().removeAllElements();
		dm.fireTableDataChanged();
		
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
		JLabel lblTitle = new JLabel("KHU VỰC CÒN CHỖ TRỐNG");
		lblTitle.setForeground(Color.RED);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTitle.setBounds(350, 11, 400, 39);
		pnTitle.add(lblTitle);
		
		//control cho danh sach
		tbKhuVuc = new JTable();
		tbKhuVuc.setBounds(0, 0, 1050, 500);
		JScrollPane sc = new JScrollPane(tbKhuVuc, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sc.setBounds(0, 45, 1055, 447);
		tbKhuVuc.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				pnMain.removeAll();
				QLViTriGUI qlViTri = QLViTriGUI.getInstance(tbKhuVuc.getValueAt(tbKhuVuc.getSelectedRow(), 2).toString());
				
				//qlViTri.reloadResources();
				pnMain.add(qlViTri.getPnMain());
				pnMain.revalidate();
				pnMain.repaint();
				
			}
			
		});
		pnDanhSachKhuVuc.add(sc,BorderLayout.CENTER);
		
		
		
		
		
	}

}
