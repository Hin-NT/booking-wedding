package com.example.bookingwedding.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_dichvudikem")
public class DichVuDiKem {
    @Id
    private String ID_DichVu;
    private String tenDichVu;
    private double donGia;

    public DichVuDiKem() {

    }

    public DichVuDiKem(String ID_DichVu, String tenDichVu, double donGia) {
        this.ID_DichVu = ID_DichVu;
        this.tenDichVu = tenDichVu;
        this.donGia = donGia;
    }

    public String getID_DichVu() {
        return ID_DichVu;
    }

    public void setID_DichVu(String ID_DichVu) {
        this.ID_DichVu = ID_DichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
