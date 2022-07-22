package DTO;

public class KhuVucDTO {
	private String maKhuvuc;
	private String tenKhuVuc;
	private String trangThaiKhuVuc;
	public KhuVucDTO(String maKhuvuc, String tenKhuVuc, String trangThaiKhuVuc) {
		super();
		this.maKhuvuc = maKhuvuc;
		this.tenKhuVuc = tenKhuVuc;
		this.trangThaiKhuVuc = trangThaiKhuVuc;
	}
	public String getMaKhuvuc() {
		return maKhuvuc;
	}
	public void setMaKhuvuc(String maKhuvuc) {
		this.maKhuvuc = maKhuvuc;
	}
	public String getTenKhuVuc() {
		return tenKhuVuc;
	}
	public void setTenKhuVuc(String tenKhuVuc) {
		this.tenKhuVuc = tenKhuVuc;
	}
	public String getTrangThaiKhuVuc() {
		return trangThaiKhuVuc;
	}
	public void setTrangThaiKhuVuc(String trangThaiKhuVuc) {
		this.trangThaiKhuVuc = trangThaiKhuVuc;
	}
	
	

}
