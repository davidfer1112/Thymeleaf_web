package co.thymeleaf.taller.plantillas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Iniciador {

    @RequestMapping("/")
    public String showInitialView() {
        return "index";
    }
}
