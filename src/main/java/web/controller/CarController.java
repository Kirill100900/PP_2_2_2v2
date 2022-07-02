package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String car(Model model) {
        model.addAttribute("car",carDAO.index()  );
        return "cars";
    }


    @GetMapping("/{id}")
    public String carid(@PathVariable("id") int id, Model model) {
        model.addAttribute("car", carDAO.show(id));
        return "cars";

    }
}
