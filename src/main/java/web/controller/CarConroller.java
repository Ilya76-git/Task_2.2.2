package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarConroller {
    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        model.addAttribute("cars", carService.getCar(count));
        return "cars";
    }
}
