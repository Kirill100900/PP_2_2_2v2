package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.config.service.*;

@Controller
@RequestMapping("/cars")
public class CarController {



    @Autowired
    private CarService carService;

    @GetMapping()
    public String car(Model model) {
        model.addAttribute("car", carService.index()  );
        return "cars";
    }


    @GetMapping("/{id}")
    public String carid(@PathVariable("id") int id, Model model) {
        model.addAttribute("car", carService.show(id));
        return "cars";

    }
}
