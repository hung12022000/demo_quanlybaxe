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

public class QLGuiXe {
	static QLGuiXe instance = null;
	private JPanel pnMain;
	private JTable tbViTri;
	private JTextField tfTenViTri;
	private JTextField tfMaViTri;
       private JTextField tfBienSoXe;
       private JDateChooser jdNgayVao;
	private JRadioButton rdbtnTrong;
	private JLabel lblMessage;
        private JLabel lblTenKhuVuc;
         private JLabel lTTenKhuVuc;
        private JLabel lblMaVe;
        private JLabel lTMaVe;
        private JLabel lblTenViTri;
        private JLabel lTTenViTri;
        private JLabel lblBienSoXe;
         private JLabel lblNgayVao; 
	
	private boolean isEdit = true;
	private JTextField tfTimKiem;
	
	private QLGuiXe() {
		initialize();
		loadResources();
	}

	private void loadResources() {
		tbViTri.setModel(QLVeBLL.getInstance().getResources());
	}
	
	public static QLGuiXe getInstance() {
		if (instance == null)
			instance = new QLGuiXe();
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
		pnTitle.setBounds(0, 0, 1078, 90);
		pnMain.add(pnTitle);
		
		JPanel pnDanhSachKhuVuc = new JPanel();
		pnDanhSachKhuVuc.setLayout(null);
		pnDanhSachKhuVuc.setBackground(SystemColor.activeCaption);
		pnDanhSachKhuVuc.setBounds(0, 92, 300, 468);
		pnMain.add(pnDanhSachKhuVuc);
		
		JPanel pnThongTinKhuVuc = new JPanel();
		pnThongTinKhuVuc.setLayout(null);
		pnThongTinKhuVuc.setBackground(SystemColor.activeCaption);
		pnThongTinKhuVuc.setBounds(303, 92, 770, 468);
		pnMain.add(pnThongTinKhuVuc);
		
		//add control
		//control of Title
		JLabel lblTitle = new JLabel("GỬI XE");
		lblTitle.setForeground(Color.RED);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTitle.setBounds(419, 11, 239, 39);
		pnTitle.add(lblTitle);
		
		//control cho danh sach
		tbViTri = new JTable();
		tbViTri.setBounds(0, 0, 300, 468);
		JScrollPane sc = new JScrollPane(tbViTri, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sc.setBounds(0, 0, 300, 468);
		tbViTri.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				
			}
			
		});
		pnDanhSachKhuVuc.add(sc,BorderLayout.CENTER);
		
		tfTimKiem = new JTextField();
		tfTimKiem.setToolTipText("Nhập mã vé");
		tfTimKiem.setBounds(580, 55, 335, 30);
		pnTitle.add(tfTimKiem);
		tfTimKiem.setColumns(10);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.setIcon(new ImageIcon("icon\\find.png"));
		btnTimKiem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnTimKiem.setBounds(920, 55, 130, 30);
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
		pnTitle.add(btnTimKiem);
		JLabel lblThongBao= new JLabel("(*) Không được bỏ trống ");
                lblThongBao.setFont(new Font("Times New Roman", Font.ITALIC, 20));
                lblThongBao.setForeground(Color.red);
                lblThongBao.setBounds(50, 35, 300, 40);
                pnThongTinKhuVuc.add(lblThongBao);
                
                
                JLabel lblMaVe = new JLabel("Mã Vé          : ");
		lblMaVe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMaVe.setBounds(50, 100, 140, 40);
		pnThongTinKhuVuc.add(lblMaVe);
                
                lTMaVe = new JLabel("*");
                lTMaVe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTMaVe.setBounds(200, 100, 140, 40);
		pnThongTinKhuVuc.add(lTMaVe);
                
                JLabel lblTenKhuVuc = new JLabel("Tên Khu Vực : ");
		lblTenKhuVuc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTenKhuVuc.setBounds(400, 100, 140, 40);
		pnThongTinKhuVuc.add(lblTenKhuVuc);
                
                lTTenKhuVuc = new JLabel("*");
                lTTenKhuVuc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTTenKhuVuc.setBounds(550, 100, 140, 40);
		pnThongTinKhuVuc.add(lTTenKhuVuc);
		
                lblNgayVao = new JLabel("Ngày Vào    : ");
                lblNgayVao.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNgayVao.setBounds(50, 190, 140, 40);
                pnThongTinKhuVuc.add(lblNgayVao);
                
                jdNgayVao = new JDateChooser();
                jdNgayVao.setBounds(200, 190, 140, 40);
                jdNgayVao.setDateFormatString("yyyy-MM-dd");
                pnThongTinKhuVuc.add(jdNgayVao);
        
                lblTenViTri = new JLabel("Tên Vị Trí       : ");
		lblTenViTri.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTenViTri.setBounds(400, 190, 140, 40);
		pnThongTinKhuVuc.add(lblTenViTri);
                
                lTTenViTri = new JLabel("*");
                lTTenViTri.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lTTenViTri.setBounds(550, 190, 140, 40);
		pnThongTinKhuVuc.add(lTTenViTri);
        
                lblBienSoXe = new JLabel("Biển Số Xe   : ");
                lblBienSoXe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblBienSoXe.setBounds(50, 280, 140, 40);
                pnThongTinKhuVuc.add(lblBienSoXe);
                
                tfBienSoXe = new JTextField();
                tfBienSoXe.setBounds(200, 280, 140, 40);
                tfBienSoXe.setFont(new Font("Times New Roman", Font.BOLD, 20));
                pnThongTinKhuVuc.add(tfBienSoXe);
                
                Button btnLap = new Button(" Lập ");
                btnLap.setFont(new Font("Times New Roman", Font.BOLD, 24));
                btnLap.setBounds(500,350 , 160, 80);
                btnLap.setForeground(Color.white);
                btnLap.setBackground(Color.MAGENTA);
                btnLap.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                   
                    }
                });
                pnThongTinKhuVuc.add(btnLap);
        }

}
