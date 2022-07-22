package DTO;

import java.sql.Date;

public class RaVaoBenDTO {
	private String maRaVaoBen;
	private String maVe;
	private String tenViTri;
	private String tenKhuVuc;
	private String bienSoXe;
	private Date ngayVao;
	private Date ngayRa;
	public RaVaoBenDTO(String maRaVaoBen, String maVe, String tenViTri, String tenKhuVuc, String bienSoXe, Date ngayVao, Date ngayRa) {
		super();
		this.maRaVaoBen = maRaVaoBen;
		this.maVe = maVe;
		this.tenViTri = tenViTri;
		this.tenKhuVuc = tenKhuVuc;
		this.bienSoXe = bienSoXe;
		this.ngayVao = ngayVao;
		this.ngayRa = ngayRa;
	}
	public RaVaoBenDTO(String maRaVaoBen, String maVe, String tenViTri, String tenKhuVuc, String bienSoXe, Date ngayVao) {
		super();
		this.maRaVaoBen = maRaVaoBen;
		this.maVe = maVe;
		this.tenViTri = tenViTri;
		this.tenKhuVuc = tenKhuVuc;
		this.bienSoXe = bienSoXe;
		this.ngayVao = ngayVao;
		
	}
	public String getMaRaVaoBen() {
		return maRaVaoBen;
	}
	public void setMaRaVaoBen(String maRaVaoBen) {
		this.maRaVaoBen = maRaVaoBen;
	}
	public String getMaVe() {
		return maVe;
	}
	public void setMaVe(String maVe) {
		this.maVe = maVe;
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
	
	public String getBienSoXe() {
		return bienSoXe;
	}
	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}
	public Date getNgayVao() {
		return ngayVao;
	}
	public void setNgayVao(Date ngayVao) {
		this.ngayVao = ngayVao;
	}
	public Date getNgayRa() {
		return ngayRa;
	}
	public void setNgayRa(Date ngayRa) {
		this.ngayRa = ngayRa;
	}
	
	

}
