package com.example.bookingwedding.Controller;

import com.example.bookingwedding.Model.KhachHang;
import com.example.bookingwedding.Model.ThongTinTiecCuoi;
import com.example.bookingwedding.Service.KhachHangService;
import com.example.bookingwedding.Service.ThongTinTiecCuoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/tim-kiem")
public class TimKiemController {
    @Autowired
    KhachHangService khachHangService;
    @Autowired
    ThongTinTiecCuoiService thongTinTiecCuoiService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String pageKhachHang(ModelMap modelMap) {
        return "tim_kiem_1";
    }
    @RequestMapping(value = "/search-cr", method = RequestMethod.POST)
    public String themThongTinTiecCuoi(ModelMap modelMap,
                                       @RequestParam("hoTenCoDau") String hoTenCoDau,
                                       @RequestParam("hoTenChuRe") String hoTenChuRe) {
        KhachHang k = khachHangService.getKhachHangByName(hoTenCoDau, hoTenChuRe).get();

        ThongTinTiecCuoi t = thongTinTiecCuoiService.getTTTCByIDKH(k.getID_KH()).get();
        modelMap.addAttribute("KhachHang", k);
        modelMap.addAttribute("ThongTin", t);
        return "tim_kiem_1";
    }
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String themThongTinTiecCuoi(ModelMap modelMap,
                                       @RequestParam("tenNhaHang") String tenNhaHang,
                                       @RequestParam("ngayToChuc") String ngayToChuc,
                                       @RequestParam("tenDichVU") String tenDichVu) {
        List<Object> khachHangList = thongTinTiecCuoiService.search(tenNhaHang, ngayToChuc, tenDichVu);
//        modelMap.addAttribute("KhachHangList", khachHangList);
//        modelMap.addAttribute("TenNhaHang", tenNhaHang);
//        modelMap.addAttribute("NgayToChuc", ngayToChuc);
//        modelMap.addAttribute("TenDichVu", tenDichVu);
        return "tim_kiem_1";
    }
}
