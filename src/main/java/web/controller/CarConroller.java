package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarConroller {
    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        List<Car> cars = carService.getCar((count == null?5:Integer.parseInt(count)));
        model.addAttribute("cars", cars);
        return "cars";
    }
}
