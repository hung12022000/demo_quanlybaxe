package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.toedter.calendar.JCalendar;

public class QLTrangChuGUI {

	private JPanel pnTongQuanQLTrangChu;
	

	static QLTrangChuGUI instance=null;
	
	public QLTrangChuGUI() {
		initialize();
	}
	
	public static QLTrangChuGUI getInstance() {
		if(instance == null)
			instance = new QLTrangChuGUI();
		return instance;
	}
	
	public JPanel getPnTongQuanQLTrangChu() {
		return pnTongQuanQLTrangChu;
	}
	private void initialize() {
		
		
		pnTongQuanQLTrangChu = new JPanel();
		pnTongQuanQLTrangChu.setBounds(0, 0, 1065, 560);
		pnTongQuanQLTrangChu.setLayout(null);
		
		
		
		JPanel pnLoGoTruong = new JPanel();
		pnLoGoTruong.setBackground(SystemColor.inactiveCaptionBorder);
		pnLoGoTruong.setBounds(0, 0, 1065, 560);
		pnTongQuanQLTrangChu.add(pnLoGoTruong);
		pnLoGoTruong.setLayout(null);
		
		/*JLabel lblLoGoTruong = new JLabel("");
		lblLoGoTruong.setBounds(12, 11, 217, 224);
		lblLoGoTruong.setIcon(new ImageIcon("icon\\PTNKLogo.png"));
		pnLoGoTruong.add(lblLoGoTruong);*/
		
		JLabel lblTenTruong = new JLabel("            Bãi Xe LUXURY");
		lblTenTruong.setBounds(253, 39, 769, 86);
		lblTenTruong.setForeground(Color.BLUE);
		lblTenTruong.setFont(new Font("Times New Roman", Font.BOLD, 30));
		pnLoGoTruong.add(lblTenTruong);
		
		JPanel pnLich = new JPanel();
		pnLich.setBackground(SystemColor.controlHighlight);
		pnLich.setBounds(729, 145, 326, 404);
		pnLoGoTruong.add(pnLich);
		pnLich.setLayout(null);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(0, 25, 326, 359);
		pnLich.add(calendar);
		
		JLabel lblNewLabel = new JLabel("Lịch năm");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 0, 316, 25);
		pnLich.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("icon\\trangchu.png"));
		label.setBounds(12, 145, 707, 404);
		pnLoGoTruong.add(label);
		
		
		
	}
}
