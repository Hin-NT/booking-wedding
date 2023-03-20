package com.example.bookingwedding.Controller;


import com.example.bookingwedding.Model.DichVuDiKem;
import com.example.bookingwedding.Model.KhachHang;
import com.example.bookingwedding.Model.NhaHang;
import com.example.bookingwedding.Model.ThongTinTiecCuoi;
import com.example.bookingwedding.Service.DichVuService;
import com.example.bookingwedding.Service.KhachHangService;
import com.example.bookingwedding.Service.NhaHangService;
import com.example.bookingwedding.Service.ThongTinTiecCuoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Controller
@RequestMapping(value = "")
public class TrangChuController {
    @Autowired
    NhaHangService nhaHangService;
    @Autowired
    DichVuService dichVuService;
    @Autowired
    KhachHangService khachHangService;
    @Autowired
    ThongTinTiecCuoiService thongTinTiecCuoiService;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String homeUserPage(ModelMap modelMap) {
        modelMap.addAttribute("nhaHang", nhaHangService.selectAll());
        modelMap.addAttribute("dichVu", dichVuService.selectAll());
        return "index";
    }

    //    them-thong-tin-tiec-cuoi
    @RequestMapping(value = "/them-thong-tin-tiec-cuoi", method = RequestMethod.POST)
    public String themThongTinTiecCuoi(ModelMap modelMap,
                                       @RequestParam("hoTenCoDau") String hoTenCoDau,
                                       @RequestParam("ngaySinhCoDau") String ngaySinhCoDau,
                                       @RequestParam("hoTenChuRe") String hoTenChuRe,
                                       @RequestParam("ngaySinhChuRe") String ngaySinhChuRe,
                                       @RequestParam("soLuongKhach") String soLuongKhach,
                                       @RequestParam("maDichVu") String maDichVu,
                                       @RequestParam("maNhaHang") String maNhaHang,
                                       @RequestParam("thanhTien") String thanhTien,
                                       @RequestParam("ngayToChuc") String ngayToChuc) {
        System.out.println(thanhTien);
        NhaHang nhaHang = nhaHangService.getNhaHangByID(maNhaHang).get();
        if(Integer.parseInt(soLuongKhach) > nhaHang.getSoLuongCho()) {
            modelMap.addAttribute("err", "Số lượng khách quá số lượng chổ");
            return "index";
        }
        DichVuDiKem dichVuDiKem = dichVuService.getDichVuByID(maDichVu).get();
        UUID idKhachHang = UUID.randomUUID();
        KhachHang k = new KhachHang(idKhachHang.toString(), hoTenCoDau, ngaySinhCoDau, hoTenChuRe, ngaySinhChuRe);
        khachHangService.insert(k);
        ThongTinTiecCuoi t = new ThongTinTiecCuoi(idKhachHang.toString(), maNhaHang, ngayToChuc, Integer.parseInt(soLuongKhach), maDichVu, Double.parseDouble(thanhTien) + dichVuDiKem.getDonGia());
        thongTinTiecCuoiService.insert(t);
        return "index";
    }
}
