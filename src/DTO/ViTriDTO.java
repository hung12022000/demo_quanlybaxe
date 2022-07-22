package DTO;

public class ViTriDTO {
	private String maViTri;
	private String tenViTri;
	private String tenKhuVuc;
	private String trangThaiViTri;
	public ViTriDTO(String maViTri, String tenViTri, String tenKhuVuc, String trangThaiViTri) {
		super();
		this.maViTri = maViTri;
		this.tenViTri = tenViTri;
		this.tenKhuVuc = tenKhuVuc;
		this.trangThaiViTri = trangThaiViTri;
	}
	public String getMaViTri() {
		return maViTri;
	}
	public void setMaViTri(String maViTri) {
		this.maViTri = maViTri;
	}
	public String getTenViTri() {
		return tenViTri;
	}
	public void setTenViTri(String tenViTri) {
		this.tenViTri = tenViTri;
	}
	public String getTenKhuVuc() {
		return tenKhuVuc;
	}
	public void setTenKhuVuc(String tenKhuVuc) {
		this.tenKhuVuc = tenKhuVuc;
	}
	public String getTrangThaiViTri() {
		return trangThaiViTri;
	}
	public void setTrangThaiViTri(String trangThaiViTri) {
		this.trangThaiViTri = trangThaiViTri;
	}
	

}
