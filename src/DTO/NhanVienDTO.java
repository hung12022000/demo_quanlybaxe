package DTO;

public class NhanVienDTO {

	private String maTaiKhoan;
	private String tenTaiKhoan;
	private String matKhau;
	private String tenNhanVien;
	private String loaiTaiKhoan;
	private String email;
	
	public NhanVienDTO() {
		super();
	}
	public NhanVienDTO(String maTaiKhoan, String tenTaiKhoan, String matKhau, String tenNhanVien, String loaiTaiKhoan,
			String email) {
		super();
		this.maTaiKhoan = maTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.tenNhanVien = tenNhanVien;
		this.loaiTaiKhoan = loaiTaiKhoan;
		this.email = email;
	}
	
	public String getMaTaiKhoan() {
		return maTaiKhoan;
	}
	public void setMaTaiKhoan(String maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getLoaiTaiKhoan() {
		return loaiTaiKhoan;
	}
	public void setLoaiTaiKhoan(String loaiTaiKhoan) {
		this.loaiTaiKhoan = loaiTaiKhoan;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
