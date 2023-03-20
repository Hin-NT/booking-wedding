
import com.example.bookingwedding.Model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
    @Query(value = "SELECT u FROM KhachHang u WHERE u.hoTenChuRe =:hoTenChuRe AND u.hoTenCoDau =:hoTenCoDau")
    Optional<KhachHang> findKhachHangByHoTenChuReCoDau(@Param("hoTenCoDau") String hoTenCoDau,
                                                       @Param("hoTenChuRe") String hoTenChuRe);

    @Query(value = "SELECT KhachHang FROM ThongTinTiecCuoi u, NhaHang n, DichVuDiKem v, KhachHang k WHERE KhachHang .ID_KH = ThongTinTiecCuoi .ID_KH AND NhaHang.ID_NhaHang = ThongTinTiecCuoi .ID_NhaHang AND DichVuDiKem.ID_DichVu = ThongTinTiecCuoi.ID_DichVu AND NhaHang .tenNhaHang =:tenNhaHang AND ThongTinTiecCuoi .ngayToChuc =:ngayToChuc AND DichVuDiKem .tenDichVu =:tenDichVu" ,nativeQuery = true)
    List<Object> search(@Param("tenNhaHang") String tenNhaHang,
                        @Param("ngayToChuc") String ngayToChuc,
                        @Param("tenDichVu") String tenDichVu);
}
