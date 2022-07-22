package BLL;

import java.util.ArrayList;

import GUI.QuanTriHeThongGUI;
import GUI.TrangChuGUI;
import MyException.MyNullException;

public class DangNhapBLL {
	static DangNhapBLL instance;
	
	private DangNhapBLL(){
		
	}
	
	public static DangNhapBLL getInstance() {
		if (instance == null) {
			instance = new DangNhapBLL();
		}
		return instance;
	}
	
	private void checkData(String taiKhoan, String matKhau) throws MyNullException{
		try {
			if (taiKhoan.equals(""))
				throw new MyNullException();
			if (matKhau.equals(""))
				throw new MyNullException();
		}catch(NullPointerException e) {
			throw new MyNullException();
		}
	}
	
	public boolean dangNhap(String taiKhoan, String matKhau) {
		try {
			/*ArrayList<NhanVienDTO> dsNhanVien = new ArrayList<NhanVienDTO>();
			dsNhanVien = NhanVienDAL.getInstance().getResources();
			checkData(taiKhoan, matKhau);
			
			for (NhanVienDTO nv: dsNhanVien) {
				if (nv.getTenTaiKhoan().equals(taiKhoan) && nv.getMatKhau().equals(matKhau)) {
					if(nv.getLoaiTaiKhoan().equals("Nhân Viên")) {
						ChaoMungBLL.GetInstance().setNhanVien(nv);
						TrangChuGUI trangchu=TrangChuGUI.getInstance();
						trangchu.getFrmTrangChu().setVisible(true);
					}
					else {
						QuanTriHeThongGUI.getInstance().getFrmMain().setVisible(true);
					}
					return true;
				}
			}
			return false;*/
			checkData(taiKhoan, matKhau);
			if (taiKhoan.equals("1") && matKhau.equals("1")) {
				
					//QLNhanVienBLL.getInstance().setNhanVien();
					TrangChuGUI trangchu=TrangChuGUI.getInstance();
					trangchu.getFrmTrangChu().setVisible(true);
				}if(taiKhoan.equals("2") && matKhau.equals("1")) {
					QuanTriHeThongGUI.getInstance().getFrmMain().setVisible(true);
				}
				
				return false;
			
		
	
			
			
		}catch(MyNullException e) {
			return false;
		}
	}
}
