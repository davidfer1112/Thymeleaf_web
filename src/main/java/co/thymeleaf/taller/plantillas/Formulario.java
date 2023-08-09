package co.thymeleaf.taller.plantillas;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/plantillas")
public class Formulario {

	 @GetMapping("/los-pipol-template-model-and-view")
     public ModelAndView losPipolTemplateModelAndView() {
         return new ModelAndView("los-pipol-template-model-and-view");
     }

}
