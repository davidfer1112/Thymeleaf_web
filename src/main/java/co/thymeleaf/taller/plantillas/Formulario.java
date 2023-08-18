package co.thymeleaf.taller.plantillas;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/vistas")
public class Formulario {


    @GetMapping("/objetivoPrincipal")
	public ModelAndView objetivoPrincipal() {
		return new ModelAndView("objetivoPrincipal");
	}

    @GetMapping("/usuarios")
	public ModelAndView usuarios() {
		return new ModelAndView("usuarios");
	}

	@GetMapping("/requerimientosFuncionales")
	public ModelAndView requerimientosFuncionales() {
		return new ModelAndView("requerimientosFuncionales");
	}

	@GetMapping("/requerimientosNoFuncionales")
	public ModelAndView requerimientosNoFuncionales() {
		return new ModelAndView("requerimientosNoFuncionales");
	}

	@GetMapping("/arquitecturaGeneral")
	public ModelAndView arquitecturaGeneral() {
		return new ModelAndView("arquitecturaGeneral");
	}

	@GetMapping("/infraestructura")
	public ModelAndView infraestructura() {
		return new ModelAndView("infraestructura");
	}
	
}
