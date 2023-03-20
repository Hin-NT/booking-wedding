package com.example.bookingwedding.Controller;

import com.example.bookingwedding.Model.DichVuDiKem;
import com.example.bookingwedding.Service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/dich-vu")
public class DichVuController {
    @Autowired
    DichVuService dichVuService;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String pageDichVu(ModelMap modelMap) {
        modelMap.addAttribute("DichVu", new DichVuDiKem());
        return "dich_vu";
    }

    @RequestMapping(value = "/them-dich-vu", method = RequestMethod.POST)
    public String themNhaHang(ModelMap modelMap,
                              @ModelAttribute("DichVu") DichVuDiKem c) {
        System.out.println(c.toString());
        dichVuService.insert(c);
        return "redirect:/";
    }
}
