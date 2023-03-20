package com.example.bookingwedding.Model;

public class ThongTin {
    private String maKH;
    private String hoTenCoDau;
    private String ngaySinhCD;
    private String hoTenChuRe;
    private String ngaySinhCR;
    private String ngayToChuc;
    private String tenNhaHang;
    private String tenDichVu;

    public ThongTin() {

    }

    public ThongTin(String maKH, String hoTenCoDau, String ngaySinhCD, String hoTenChuRe, String ngaySinhCR, String ngayToChuc, String tenNhaHang, String tenDichVu) {
        this.maKH = maKH;
        this.hoTenCoDau = hoTenCoDau;
        this.ngaySinhCD = ngaySinhCD;
        this.hoTenChuRe = hoTenChuRe;
        this.ngaySinhCR = ngaySinhCR;
        this.ngayToChuc = ngayToChuc;
        this.tenNhaHang = tenNhaHang;
        this.tenDichVu = tenDichVu;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
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

    public String getNgayToChuc() {
        return ngayToChuc;
    }

    public void setNgayToChuc(String ngayToChuc) {
        this.ngayToChuc = ngayToChuc;
    }

    public String getTenNhaHang() {
        return tenNhaHang;
    }

    public void setTenNhaHang(String tenNhaHang) {
        this.tenNhaHang = tenNhaHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }
}
