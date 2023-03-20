package com.example.bookingwedding.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_khachang")
public class KhachHang {
    @Id
    private String ID_KH;
    private String hoTenCoDau;
    private String ngaySinhCD;
    private String hoTenChuRe;
    private String ngaySinhCR;

    public KhachHang() {

    }

    public KhachHang(String ID_KH, String hoTenCoDau, String ngaySinhCD, String hoTenChuRe, String ngaySinhCR) {
        this.ID_KH = ID_KH;
        this.hoTenCoDau = hoTenCoDau;
        this.ngaySinhCD = ngaySinhCD;
        this.hoTenChuRe = hoTenChuRe;
        this.ngaySinhCR = ngaySinhCR;
    }

    public String getID_KH() {
        return ID_KH;
    }

    public void setID_KH(String ID_KH) {
        this.ID_KH = ID_KH;
    }

    public String getHoTenCoDau() {
        return hoTenCoDau;
    }

    public void setHoTenCoDau(String hoTenCoDau) {
        this.hoTenCoDau = hoTenCoDau;
    }

    public String getNgaySinhCD() {
        return ngaySinhCD;
    }

    public void setNgaySinhCD(String ngaySinhCD) {
        this.ngaySinhCD = ngaySinhCD;
    }

    public String getHoTenChuRe() {
        return hoTenChuRe;
    }

    public void setHoTenChuRe(String hoTenChuRe) {
        this.hoTenChuRe = hoTenChuRe;
    }

    public String getNgaySinhCR() {
        return ngaySinhCR;
    }

    public void setNgaySinhCR(String ngaySinhCR) {
        this.ngaySinhCR = ngaySinhCR;
    }
}
