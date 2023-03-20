package com.example.bookingwedding.Controller;

import com.example.bookingwedding.Model.NhaHang;
import com.example.bookingwedding.Service.NhaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/nha-hang")
public class NhaHangController {
    @Autowired
    NhaHangService nhaHangService;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String pageKhachHang(ModelMap modelMap) {
        modelMap.addAttribute("NhaHang", new NhaHang());
        List<NhaHang> list = nhaHangService.selectAll();
        return "nha_hang";
    }

    @RequestMapping(value = "/them-nha-hang", method = RequestMethod.POST)
    public String themNhaHang(ModelMap modelMap,
                              @ModelAttribute("NhaHang") NhaHang c) {
        nhaHangService.insert(c);
        return "redirect:/nha-hang";
    }
}
