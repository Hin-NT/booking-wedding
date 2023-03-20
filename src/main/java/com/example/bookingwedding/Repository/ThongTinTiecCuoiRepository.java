package com.example.bookingwedding.Repository;

import com.example.bookingwedding.Model.ThongTinTiecCuoi;
import com.example.long2.Model.ThongTinTiecCuoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ThongTinTiecCuoiRepository extends JpaRepository<ThongTinTiecCuoi, Long> {
    @Query(value = "SELECT u FROM ThongTinTiecCuoi u WHERE u.ID_KH =:ID_KH")
    Optional<ThongTinTiecCuoi> findThongTinTiecCuoiByIDKH(@Param("ID_KH") String ID_KH);


}
