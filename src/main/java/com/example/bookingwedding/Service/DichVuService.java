package com.example.bookingwedding.Service;

import com.example.bookingwedding.Model.DichVuDiKem;
import com.example.bookingwedding.Repository.DichVuDiKemRepository;
import com.example.long2.Model.DichVuDiKem;
import com.example.long2.Repository.DichVuDiKemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DichVuService implements IService<DichVuDiKem>{
    @Autowired
    DichVuDiKemRepository dichVuDiKemRepository;
    @Override
    public boolean insert(DichVuDiKem dichVuDiKem) {
        UUID uuid = UUID.randomUUID();
        dichVuDiKem.setID_DichVu(uuid.toString());
        dichVuDiKemRepository.save(dichVuDiKem);
        return true;
    }

    @Override
    public List<DichVuDiKem> selectAll() {
        return dichVuDiKemRepository.findAll();
    }

    public Optional<DichVuDiKem> getDichVuByID(String id) {
        return dichVuDiKemRepository.findById(id);
    }
}
