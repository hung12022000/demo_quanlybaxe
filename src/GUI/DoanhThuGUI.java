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

import BLL.QLDoanhThuBLL;
import BLL.QLVeBLL;
import BLL.QLViTriBLL;
import static GUI.HoaDonGUI.instance;
import com.toedter.calendar.JDateChooser;
import java.awt.Button;
import java.awt.Label;
public class DoanhThuGUI {
static DoanhThuGUI instance = null;
private JPanel pnMain;
private JTable tbDoanhThu;
private void loadResources() {
		tbDoanhThu.setModel(QLDoanhThuBLL.getInstance().getResources());
	}
public DoanhThuGUI() {
       initialize();
       loadResources();
	}
public JPanel getPnMain() {
		return pnMain;
	}
public void reloadResources() {
		DefaultTableModel dm = (DefaultTableModel) tbDoanhThu.getModel();
		dm.getDataVector().removeAllElements();
		dm.fireTableDataChanged();
		
	}

public static DoanhThuGUI getInstance() {
		if (instance == null)
			instance = new DoanhThuGUI();
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
		
		JPanel pnDoanhThu=new JPanel();
                pnDoanhThu.setLayout(null);
		pnDoanhThu.setBackground(SystemColor.activeCaption);
		pnDoanhThu.setBounds(0, 92, 750, 560);
		pnMain.add(pnDoanhThu);
                
                JPanel pnQLDoanhThu=new JPanel();
                pnQLDoanhThu.setLayout(null);
		pnQLDoanhThu.setBackground(SystemColor.activeCaption);
		pnQLDoanhThu.setBounds(752, 92, 465, 560);
		pnMain.add(pnQLDoanhThu);
                
                JLabel lblTitle = new JLabel("DOANH THU THÁNG ");
		lblTitle.setForeground(Color.RED);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTitle.setBounds(300, 23, 350, 39);
		pnTitle.add(lblTitle);
                
                JLabel lblThang = new JLabel(" * ");
		lblThang.setForeground(Color.RED);
		lblThang.setHorizontalAlignment(SwingConstants.CENTER);
		lblThang.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblThang.setBounds(550, 23, 239, 39);
		pnTitle.add(lblThang);
                
                tbDoanhThu = new JTable();
		tbDoanhThu.setBounds(0, 0, 750, 468);
		JScrollPane sc = new JScrollPane(tbDoanhThu, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sc.setBounds(0, 0, 750, 468);
		tbDoanhThu.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				
			}
			
		});
		pnDoanhThu.add(sc,BorderLayout.CENTER);
                
                JLabel lblNgayLap= new JLabel("Ngày Lập : ");
		lblNgayLap.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNgayLap.setBounds(30, 40, 140, 40);
		pnQLDoanhThu.add(lblNgayLap);
                
                JLabel lTNgayLap= new JLabel(" * ");
		lTNgayLap.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTNgayLap.setBounds(180, 40, 140, 40);
		pnQLDoanhThu.add(lTNgayLap);
                
                JLabel lblSoThangTruoc= new JLabel("So Với Tháng Trước : ");
		lblSoThangTruoc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSoThangTruoc.setBounds(30, 100, 200, 40);
		pnQLDoanhThu.add(lblSoThangTruoc);
                
                JLabel lTSoThangTruoc= new JLabel(" % ");
		lTSoThangTruoc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTSoThangTruoc.setBounds(250, 100, 140, 40);
		pnQLDoanhThu.add(lTSoThangTruoc);
                
                JLabel lblChiTieu= new JLabel("Chỉ Tiêu   : ");
		lblChiTieu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblChiTieu.setBounds(30, 160, 150, 40);
		pnQLDoanhThu.add(lblChiTieu);
                
                JLabel lTChiTieu= new JLabel("   5000000   ");
		lTChiTieu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTChiTieu.setBounds(180, 160, 140, 40);
		pnQLDoanhThu.add(lTChiTieu);
                
                JLabel lblDatDuoc= new JLabel("Đạt Được  : ");
		lblDatDuoc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDatDuoc.setBounds(30, 220, 150, 40);
		pnQLDoanhThu.add(lblDatDuoc);
                
                JLabel lTDatDuoc= new JLabel("     % ");
		lTDatDuoc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTDatDuoc.setBounds(230, 220, 140, 40);
		pnQLDoanhThu.add(lTDatDuoc);
                
                Button btnLap = new Button(" Lập ");
                btnLap.setFont(new Font("Times New Roman", Font.BOLD, 24));
                btnLap.setBounds(80, 350, 150, 40);
                btnLap.setForeground(Color.white);
                btnLap.setBackground(Color.MAGENTA);
                btnLap.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                   
                    }
                });
                pnQLDoanhThu.add(btnLap);
    }
}

