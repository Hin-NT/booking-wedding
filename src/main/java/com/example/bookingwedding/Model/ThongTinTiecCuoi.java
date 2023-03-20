package com.example.bookingwedding.Model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_thongtintieccuoi")
public class ThongTinTiecCuoi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID_TiecCuoi;
    private String ID_KH;
    private String ID_NhaHang;
    private String ngayToChuc;
    private int soLuongKhach;
    private String ID_DichVu;
    private double thanhTien;

    public ThongTinTiecCuoi() {

    }

    public ThongTinTiecCuoi(String ID_KH, String ID_NhaHang, String ngayToChuc, int soLuongKhach, String ID_DichVu, double thanhTien) {
        this.ID_KH = ID_KH;
        this.ID_NhaHang = ID_NhaHang;
        this.ngayToChuc = ngayToChuc;
        this.soLuongKhach = soLuongKhach;
        this.ID_DichVu = ID_DichVu;
        this.thanhTien = thanhTien;
    }

    public Long getID_TiecCuoi() {
        return ID_TiecCuoi;
    }

    public void setID_TiecCuoi(Long ID_TiecCuoi) {
        this.ID_TiecCuoi = ID_TiecCuoi;
    }

    public String getID_KH() {
        return ID_KH;
    }

    public void setID_KH(String ID_KH) {
        this.ID_KH = ID_KH;
    }

    public String getID_NhaHang() {
        return ID_NhaHang;
    }

    public void setID_NhaHang(String ID_NhaHang) {
        this.ID_NhaHang = ID_NhaHang;
    }

    public String getNgayToChuc() {
        return ngayToChuc;
    }

    public void setNgayToChuc(String ngayToChuc) {
        this.ngayToChuc = ngayToChuc;
    }

    public int getSoLuongKhach() {
        return soLuongKhach;
    }

    public void setSoLuongKhach(int soLuongKhach) {
        this.soLuongKhach = soLuongKhach;
    }

    public String getID_DichVu() {
        return ID_DichVu;
    }

    public void setID_DichVu(String ID_DichVu) {
        this.ID_DichVu = ID_DichVu;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
}
