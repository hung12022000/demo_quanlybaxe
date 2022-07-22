/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author MY LAPTOP
 */
public class HoaDonDTO {
        private String maHoaDon;
        private String maNhanVien;
        private String bienSoXe;
        private String maVe;
        private Date ngayLap;
        private String maViTri;
        private  String ngayketthuc;

    public HoaDonDTO(String maHoaDon, String maNhanVien, String bienSoXe, String maVe, Date ngayLap, String maViTri, String ngayketthuc) {
        this.maHoaDon = maHoaDon;
        this.maNhanVien = maNhanVien;
        this.bienSoXe = bienSoXe;
        this.maVe = maVe;
        this.ngayLap = ngayLap;
        this.maViTri = maViTri;
        this.ngayketthuc = ngayketthuc;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public String getMaVe() {
        return maVe;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public String getMaViTri() {
        return maViTri;
    }

    public String getNgayketthuc() {
        return ngayketthuc;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setMaViTri(String maViTri) {
        this.maViTri = maViTri;
    }

    public void setNgayketthuc(String ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }
        
}
