package com.example.bookingwedding.Service;

import com.example.bookingwedding.Model.KhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class KhachHangService implements IService<KhachHang> {
    @Autowired
    KhachHangRepository khachHangRepository;
    @Override
    public boolean insert(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
        return true;
    }

    @Override
    public List<KhachHang> selectAll() {
        return null;
    }

    public Optional<KhachHang> getKhachHangByName(String hoTenCoDau, String hoTenChuRe) {
        return khachHangRepository.findKhachHangByHoTenChuReCoDau(hoTenCoDau, hoTenChuRe);
    }
}
