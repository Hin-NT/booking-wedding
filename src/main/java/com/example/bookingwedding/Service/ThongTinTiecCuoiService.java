package com.example.bookingwedding.Service;

import com.example.bookingwedding.Model.ThongTinTiecCuoi;
import com.example.long2.Model.ThongTinTiecCuoi;
import com.example.long2.Repository.KhachHangRepository;
import com.example.long2.Repository.ThongTinTiecCuoiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThongTinTiecCuoiService implements IService<ThongTinTiecCuoi>{
    @Autowired
    ThongTinTiecCuoiRepository thongTinTiecCuoiRepository;
    @Autowired
    KhachHangRepository khachHangRepository;
    @Override
    public boolean insert(ThongTinTiecCuoi thongTinTiecCuoi) {
        thongTinTiecCuoiRepository.save(thongTinTiecCuoi);
        return true;
    }

    @Override
    public List<ThongTinTiecCuoi> selectAll() {
        return null;
    }

    public Optional<ThongTinTiecCuoi> getTTTCByIDKH(String ID_KH) {
        return thongTinTiecCuoiRepository.findThongTinTiecCuoiByIDKH(ID_KH);
    }

    public List<Object> search(String tenNhaHang, String ngayToChuc, String tenDichVu) {
        return khachHangRepository.search(tenNhaHang, ngayToChuc, tenDichVu);
    }
}
