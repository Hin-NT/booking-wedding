package com.example.bookingwedding.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_nhahang")
public class NhaHang {
    @Id
    private String ID_NhaHang;
    private String tenNhaHang;
    private String diaChi;
    private int soLuongCho;

    public NhaHang() {

    }

    public NhaHang(String ID_NhaHang, String tenNhaHang, String diaChi, int soLuongCho) {
        this.ID_NhaHang = ID_NhaHang;
        this.tenNhaHang = tenNhaHang;
        this.diaChi = diaChi;
        this.soLuongCho = soLuongCho;
    }

    public String getID_NhaHang() {
        return ID_NhaHang;
    }

    public void setID_NhaHang(String ID_NhaHang) {
        this.ID_NhaHang = ID_NhaHang;
    }

    public String getTenNhaHang() {
        return tenNhaHang;
    }

    public void setTenNhaHang(String tenNhaHang) {
        this.tenNhaHang = tenNhaHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoLuongCho() {
        return soLuongCho;
    }

    public void setSoLuongCho(int soLuongCho) {
        this.soLuongCho = soLuongCho;
    }

    @Override
    public String toString() {
        return "NhaHang{" +
                "ID_NhaHang='" + ID_NhaHang + '\'' +
                ", tenNhaHang='" + tenNhaHang + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soLuongCho=" + soLuongCho +
                '}';
    }
}
