package com.example.bookingwedding.Service;

import com.example.bookingwedding.Model.NhaHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NhaHangService implements IService<NhaHang>{
    @Autowired
    NhaHangRepository nhaHangRepository;
    @Override
    public boolean insert(NhaHang nhaHang) {
        UUID uuid = UUID.randomUUID();
        nhaHang.setID_NhaHang(uuid.toString());
        nhaHangRepository.save(nhaHang);
        return true;
    }

    @Override
    public List<NhaHang> selectAll() {
        List<NhaHang> nhaHangList = nhaHangRepository.findAll();
        return nhaHangList;
    }

    public Optional<NhaHang> getNhaHangByID(String id) {
        return nhaHangRepository.findById(id);
    }
}
