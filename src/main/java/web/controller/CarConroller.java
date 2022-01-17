package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarConroller {

    @GetMapping(value = "/cars")
    public String printWelcome(HttpServletRequest request,ModelMap model) {
        String s = request.getParameter("count");
        List<Car> cars =new CarService().getCar((s == null?5:Integer.parseInt(s)));
        model.addAttribute("cars", cars);
        return "cars";
    }
}
