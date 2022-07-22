package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.toedter.calendar.JCalendar;



public class TrangChuGUI {

	private JFrame frmTrangChu;
	private JPanel pnTitle;
	private JPanel pnMenu;
	private JPanel pnMain;
	private JPanel pnTrangChu;
	private JMenuBar mbMenu;

	
	static TrangChuGUI instance = null;
	
	private TrangChuGUI() {
		
		initialize();
	}
	
	public static TrangChuGUI getInstance() {
		if (instance == null)
			instance = new TrangChuGUI();
		return instance;
	}
	
	public JFrame getFrmTrangChu() {
		return frmTrangChu;
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		//init the container
		frmTrangChu = new JFrame("Quản lý bãi xe");
		frmTrangChu.setBounds(10, 10, 1341, 720);
		frmTrangChu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTrangChu.getContentPane().setLayout(null);
		//frmTrangChu.setResizable(false);
		
		pnTrangChu = new JPanel();
		pnTrangChu.setBounds(260, 0, 1065, 681);
		frmTrangChu.getContentPane().add(pnTrangChu);
		pnTrangChu.setLayout(null);
		
		pnTitle = new JPanel();
		pnTitle.setBounds(10, 0, 1060, 118);
		pnTrangChu.add(pnTitle);
		pnTitle.setBackground(SystemColor.activeCaption);
		pnTitle.setLayout(null);
		
		/*JLabel lblQuyenSach = new JLabel("QUYỂN SÁCH");
		lblQuyenSach.setForeground(new Color(255, 69, 0));
		lblQuyenSach.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblQuyenSach.setIcon(new ImageIcon("icon\\quyensach.png"));
		lblQuyenSach.setBounds(70, 41, 143, 39);
		pnTitle.add(lblQuyenSach);
		
		JLabel lblTheLoai = new JLabel("THỂ LOẠI");
		lblTheLoai.setForeground(new Color(255, 69, 0));
		lblTheLoai.setIcon(new ImageIcon("icon\\theloai.png"));
		lblTheLoai.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTheLoai.setBounds(357, 41, 123, 41);
		pnTitle.add(lblTheLoai);
		
		JLabel lblDocGia = new JLabel("ĐỘC GIẢ");
		lblDocGia.setForeground(new Color(255, 69, 0));
		lblDocGia.setIcon(new ImageIcon("icon\\367785583.jpg"));
		lblDocGia.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDocGia.setBounds(621, 41, 116, 39);
		pnTitle.add(lblDocGia);
		
		JLabel lblSachMuon = new JLabel("LƯỢT MƯỢN");
		lblSachMuon.setForeground(new Color(255, 69, 0));
		lblSachMuon.setIcon(new ImageIcon("icon\\images.png"));
		lblSachMuon.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSachMuon.setBounds(866, 41, 132, 39);
		pnTitle.add(lblSachMuon);
		
		JLabel lblSoCuonSach = new JLabel("");
		lblSoCuonSach.setForeground(new Color(255, 69, 0));
		lblSoCuonSach.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSoCuonSach.setBounds(53, 41, 16, 39);
		lblSoCuonSach.setText(soCuonSach+"");
		pnTitle.add(lblSoCuonSach);
		
		JLabel lblSoTheLoai = new JLabel("");
		lblSoTheLoai.setForeground(new Color(255, 69, 0));
		lblSoTheLoai.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSoTheLoai.setBounds(343, 42, 16, 39);
		lblSoTheLoai.setText(soTheLoai+"");
		pnTitle.add(lblSoTheLoai);
		
		JLabel lblSoDocGia = new JLabel("");
		lblSoDocGia.setForeground(new Color(255, 69, 0));
		lblSoDocGia.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSoDocGia.setBounds(602, 41, 16, 39);
		lblSoDocGia.setText(soDocGia+"");
		pnTitle.add(lblSoDocGia);
		
		JLabel lblSoSachMuon = new JLabel("");
		lblSoSachMuon.setForeground(new Color(255, 69, 0));
		lblSoSachMuon.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSoSachMuon.setBounds(852, 41, 16, 39);
		lblSoSachMuon.setText(soSachMuon+"");
		pnTitle.add(lblSoSachMuon);*/
		
		pnMain = new JPanel();
		pnMain.setBackground(SystemColor.inactiveCaptionBorder);
		pnMain.setBounds(10, 121, 1060, 560);
		pnTrangChu.add(pnMain);
		pnMain.setLayout(null);
		
		/*JLabel lblLoGoTruong = new JLabel("");
		lblLoGoTruong.setBackground(Color.LIGHT_GRAY);
		lblLoGoTruong.setBounds(12, 11, 221, 224);
		lblLoGoTruong.setIcon(new ImageIcon("icon\\PTNKLogo.png"));
		pnMain.add(lblLoGoTruong);*/
		
		JLabel lblTenTruong = new JLabel("            Bãi Xe LUXURY");
		lblTenTruong.setBounds(253, 39, 769, 86);
		lblTenTruong.setForeground(Color.BLUE);
		lblTenTruong.setFont(new Font("Times New Roman", Font.BOLD, 30));
		pnMain.add(lblTenTruong);
		
		JPanel pnLich = new JPanel();
		pnLich.setBackground(SystemColor.controlHighlight);
		pnLich.setBounds(729, 145, 326, 404);
		pnMain.add(pnLich);
		pnLich.setLayout(null);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(0, 25, 326, 359);
		pnLich.add(calendar);
		
		JLabel lblNewLabel = new JLabel("Lịch năm:");
		lblNewLabel.setBounds(10, 0, 316, 25);
		pnLich.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblTruong = new JLabel("");
		lblTruong.setIcon(new ImageIcon("icon\\trangchu.png"));
		lblTruong.setBounds(12, 145, 707, 404);
		pnMain.add(lblTruong);
		
		
		pnMenu = new JPanel();
		pnMenu.setBackground(SystemColor.activeCaption);
		pnMenu.setBounds(0, 0, 261, 681);
		frmTrangChu.getContentPane().add(pnMenu);
		pnMenu.setLayout(null);
		
		
		//init the control
		mbMenu = new JMenuBar();
		mbMenu.setBounds(2, 2, 259, 679);
		mbMenu.setLayout(new GridLayout(0,1));
		mbMenu.setBackground(SystemColor.textHighlight);
		pnMenu.add(mbMenu);
		JMenuItem mnTrangChu = new JMenuItem("TRANG CHỦ", new ImageIcon("icon\\home.png"));
		mnTrangChu.setHorizontalAlignment(SwingConstants.LEFT);
		mnTrangChu.setBackground(SystemColor.textHighlight);
		mnTrangChu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mnTrangChu.setForeground(Color.BLACK);
		mnTrangChu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnMain.removeAll();
				QLTrangChuGUI qlTrangChu=QLTrangChuGUI.getInstance();
				pnMain.add(qlTrangChu.getPnTongQuanQLTrangChu());
				pnMain.revalidate();
				pnMain.repaint();
			}
		});
		
		JMenuItem mnChaoMung = new JMenuItem("THÔNG TIN CÁ NHÂN");
		mnChaoMung.setForeground(Color.BLACK);
		mnChaoMung.setIcon(new ImageIcon("icon\\taikhoan.png"));
		mnChaoMung.setBackground(SystemColor.textHighlight);
		mnChaoMung.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mnChaoMung.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnMain.removeAll();
				
				QLThongTinCaNhanGUI qlThongtinCaNhan=QLThongTinCaNhanGUI.getInstance();
				//qlChaoMung.loadResources();
				pnMain.add(qlThongtinCaNhan.getPnTongQuanQLChaoMung());
				pnMain.revalidate();
				pnMain.repaint();
			}
		});
		mbMenu.add(mnChaoMung);
		
		//mnTrangChu.setIcon(new ImageIcon("D:\\LEARNING\\THIRD YEAR\\OOAD\\DOAN\\Source\\icon\\home.png"));
		mbMenu.add(mnTrangChu);
		
		JMenu mnQLBaiXe = new JMenu("QUẢN LÝ BÃI XE");
		mnQLBaiXe.setHorizontalAlignment(SwingConstants.LEFT);
		mnQLBaiXe.setIcon(new ImageIcon("icon\\chart2.png"));
		mnQLBaiXe.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mnQLBaiXe.setBackground(SystemColor.textHighlight);
		mnQLBaiXe.setForeground(Color.BLACK);
		mbMenu.add(mnQLBaiXe);
		JMenuItem mnQuanLyKhuVuc = new JMenuItem("         GỬI XE                    ");
		mnQuanLyKhuVuc.setHorizontalAlignment(SwingConstants.LEFT);
		mnQuanLyKhuVuc.setIcon(new ImageIcon("icon\\chart.png"));
		mnQuanLyKhuVuc.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mnQuanLyKhuVuc.setBackground(SystemColor.inactiveCaptionBorder);
		mnQuanLyKhuVuc.setForeground(SystemColor.menuText);
		mnQLBaiXe.add(mnQuanLyKhuVuc);
		mnQuanLyKhuVuc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnMain.removeAll();
				QLKhuVucGUI qlKhuVuc = QLKhuVucGUI.getInstance();
				
				//qlKhuVuc.reloadResources();
				pnMain.add(qlKhuVuc.getPnMain());
				pnMain.revalidate();
				pnMain.repaint();
			}
		});
		
		JMenuItem mnQuanLyViTriDo=new JMenuItem("         LẤY XE                    ");
		mnQuanLyViTriDo.setHorizontalAlignment(SwingConstants.LEFT);
		mnQuanLyViTriDo.setIcon(new ImageIcon("icon\\chart.png"));
		mnQuanLyViTriDo.setFont(new Font("Times New Roman", Font.BOLD,14));
		mnQuanLyViTriDo.setBackground(SystemColor.inactiveCaptionBorder);
		mnQuanLyViTriDo.setForeground(SystemColor.menuText);
		mnQLBaiXe.add(mnQuanLyViTriDo);
		mnQuanLyViTriDo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnMain.removeAll();
				QLRaVaoBenGUI qlRaVaoBen = QLRaVaoBenGUI.getInstance();
				
				//qlKhuVuc.reloadResources();
				pnMain.add(qlRaVaoBen.getPnMain());
				pnMain.revalidate();
				pnMain.repaint();
				
			}
		});
		
		
		
		
		
		
		JMenuItem mnQLPhatTien = new JMenuItem("DOANH THU");
		mnQLPhatTien.setIcon(new ImageIcon("icon\\phattien.png"));
		mnQLPhatTien.setHorizontalAlignment(SwingConstants.LEFT);
		mnQLPhatTien.setForeground(Color.BLACK);
		mnQLPhatTien.setBackground(SystemColor.textHighlight);
		mnQLPhatTien.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mbMenu.add(mnQLPhatTien);
		mnQLPhatTien.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnMain.removeAll();
				DoanhThuGUI qlDoanhThu = DoanhThuGUI.getInstance();
                                pnMain.add(qlDoanhThu.getPnMain());
				pnMain.revalidate();
				pnMain.repaint();
			}
		});
		
		
		
		
	}
}
