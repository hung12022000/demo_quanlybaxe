package BLL;

import java.util.ArrayList;

import MyException.ContainException;
import MyException.MyNullException;

import javax.swing.table.DefaultTableModel;


import DTO.*;

public class QLNhanVienBLL {
	
	public static QLNhanVienBLL instance;
	private QLNhanVienBLL(){
		
	}
	
	private boolean checkData(NhanVienDTO nv) throws MyNullException {
		if (nv.getMaTaiKhoan().equals(""))
		{
			throw new MyNullException("Mã tài khoản đang bị trống");
		}
		if (nv.getTenTaiKhoan().equals(""))
		{
			throw new MyNullException("Tên tài khoản đang bị trống");
		}
		if (nv.getTenNhanVien().equals(""))
		{
			throw new MyNullException("Tên nhân viên đang bị trống");
		}
		if (nv.getMatKhau().equals(""))
		{
			throw new MyNullException("Mật khẩu đang bị trống");
		}
		if (nv.getLoaiTaiKhoan().equals(""))
		{
			throw new MyNullException("Loại tài khoản đang bị trống");
		}
		return true;
	}
	
	public static QLNhanVienBLL getInstance() {
		if (instance == null)
			instance = new QLNhanVienBLL();
		return instance;
	}
	
	/*public String addProcessing(NhanVienDTO nv) {
		try{
			checkData(nv);
			ArrayList<NhanVienDTO> dsNhanVien = NhanVienDAL.getInstance().getResource();
			for(NhanVienDTO item: dsNhanVien) {
				if(item.getTenTaiKhoan().equals(nv.getTenTaiKhoan()))
					return "Tên tài khoản đã tồn tại";
			}
			String msg;
			int result = NhanVienDAL.getInstance().addProcessing(nv);
			switch(result)
			{
			case -1:
				//msg = "Error";
			case 0:
				msg = "Thêm không thành công! Vui lòng thử lại";
				break;
				default:
					msg = "Đã thêm";
			}
			return msg;
		}
		catch(MyNullException ex1) {
			return ex1.getMessage();
		}
		catch(ContainException ex2) {
			return ex2.getMessage();
		}
	}*/
	
	public DefaultTableModel reloadResources() {
		//ArrayList<NhanVienDTO> dsNhanVien = new ArrayList<NhanVienDTO>();
		//dsNhanVien = NhanVienDAL.getInstance().getResource();
		DefaultTableModel dtm = new DefaultTableModel();
		try {
			dtm.addColumn("STT");
			dtm.addColumn("Mã tài khoản");
			dtm.addColumn("Tên tài khoản");
			dtm.addColumn("Mật khẩu");
			dtm.addColumn("Tên nhân viên");
			dtm.addColumn("Loại tài khoản");
			dtm.addColumn("Email");
			/*int i = 1;
			for(NhanVienDTO nv : dsNhanVien) {
				Object[] row = {i++,nv.getMaTaiKhoan(),nv.getTenTaiKhoan(),nv.getMatKhau(),nv.getTenNhanVien(),nv.getLoaiTaiKhoan(),nv.getEmail() };
				dtm.addRow(row);
			}*/
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			
		}
		return dtm;
	}
	
	public DefaultTableModel getResources() {
		//ArrayList<NhanVienDTO> dsNhanVien = new ArrayList<NhanVienDTO>();
		//dsNhanVien = NhanVienDAL.getInstance().getResource();
		DefaultTableModel dtm = new DefaultTableModel();
		try {
			dtm.addColumn("STT");
			dtm.addColumn("Mã tài khoản");
			dtm.addColumn("Tên tài khoản");
			dtm.addColumn("Mật khẩu");
			dtm.addColumn("Tên nhân viên");
			dtm.addColumn("Loại "
					+ "tài khoản");
			dtm.addColumn("Email");
			/*int i = 1;
			for(NhanVienDTO nv : dsNhanVien) {
				Object[] row = {i++,nv.getMaTaiKhoan(),nv.getTenTaiKhoan(),nv.getMatKhau(),nv.getTenNhanVien(),nv.getLoaiTaiKhoan(),nv.getEmail() };
				dtm.addRow(row);
			}*/
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			
		}
		return dtm;
	}
	
	/*public String changeProcessing(NhanVienDTO nv) {
		String msg;
		ArrayList<NhanVienDTO> dsNhanVien = NhanVienDAL.getInstance().getResource();
		boolean check = false;
		for (NhanVienDTO item: dsNhanVien) {
			if (nv.getMaTaiKhoan().equals(item.getMaTaiKhoan())) {
				if (item.getLoaiTaiKhoan().equals("Quản trị hệ thống"))
					check = true;
				break;
			}
		}
		if (check && nv.getLoaiTaiKhoan().equalsIgnoreCase("Thủ thư") && NhanVienDAL.getInstance().countAdminAcount() == 1)
			return "Hệ thống cần có ít nhất 1 Quản trị hệ thống";
		try {
			checkData(nv);
			int result = NhanVienDAL.getInstance().changeProcessing(nv);
			switch(result)
			{
			case -1:
			case 0:
				msg = "Sửa không thành công! Vui lòng thử lại";
				break;
				default:
					msg = "Đã chỉnh sửa";
			}
			return msg;
		}
		catch(MyNullException e) {
			return e.toString();
		}
	}*/
	
	/*public String deleteProcessing(String matk, String loaiTaiKhoan) {
		
		if (matk.equals(""))
			return "Không có tài khoản nào được chọn để xóa";
		if (loaiTaiKhoan.equalsIgnoreCase("Quản trị hệ thống") && NhanVienDAL.getInstance().countAdminAcount() == 1)
			return "Hệ thống cần có ít nhất 1 Quản trị hệ thống";
		int result = NhanVienDAL.getInstance().deleteProcessing(matk);
		if (result > 0)
			return "Xóa thành công";
		else
			return "Xóa không thành công! Vui lòng kiểm tra lại";
	}*/
}
