package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
public class CarsController {

    @Autowired
    CarsService carsService;

    @GetMapping(value = "/cars")
    public String getCarsTable(@RequestParam(value = "count", required=false, defaultValue = "0") int count, ModelMap model) {
        model.addAttribute("cars", carsService.getCars(count));
        return "cars";
    }

}