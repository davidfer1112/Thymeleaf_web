package co.thymeleaf.taller.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Controller
@RequestMapping("/Controllers")
public class MyController {

    @PostMapping("/imprimir-formulario-arquitecturaGeneral")
    // El nombre de los atributos está dado por el nombre que se asigna desde el HTML
    public String imprimirDatos(Model model, @RequestParam String nombre, String apellido, String fecha, String edad ) {
        Collection<String> persona = new ArrayList<String>();

        persona.add(nombre);
        persona.add(apellido);
        persona.add(edad);
        persona.add(fecha);

        model.addAttribute("FormInfo", persona);
        return "arquitecturaGeneral";
    }

    @PostMapping("/imprimir-formulario-objetivoPrincipal")
    // El nombre de los atributos está dado por el nombre que se asigna desde el HTML
    public String imprimirDatos1(Model model, @RequestParam String nombre, String apellido, String fecha, String edad ) {
        Collection<String> persona = new ArrayList<String>();

        persona.add(nombre);
        persona.add(apellido);
        persona.add(edad);
        persona.add(fecha);

        model.addAttribute("FormInfo", persona);
        return "objetivoPrincipal";
    }

    @PostMapping("/imprimir-formulario-requerimientosFuncionales")
    // El nombre de los atributos está dado por el nombre que se asigna desde el HTML
    public String imprimirDatos2(Model model, @RequestParam String nombre, String apellido, String fecha, String edad ) {
        Collection<String> persona = new ArrayList<String>();

        persona.add(nombre);
        persona.add(apellido);
        persona.add(edad);
        persona.add(fecha);

        model.addAttribute("FormInfo", persona);
        return "requerimientosFuncionales";
    }

    @PostMapping("/imprimir-formulario-requerimientosNoFuncionales")
    // El nombre de los atributos está dado por el nombre que se asigna desde el HTML
    public String imprimirDatos3(Model model, @RequestParam String nombre, String apellido, String fecha, String edad ) {
        Collection<String> persona = new ArrayList<String>();

        persona.add(nombre);
        persona.add(apellido);
        persona.add(edad);
        persona.add(fecha);

        model.addAttribute("FormInfo", persona);
        return "requerimientosNoFuncionales";
    }

    @PostMapping("/imprimir-formulario-infraestructura")
    // El nombre de los atributos está dado por el nombre que se asigna desde el HTML
    public String imprimirDatos4(Model model, @RequestParam String nombre, String apellido, String fecha, String edad ) {
        Collection<String> persona = new ArrayList<String>();

        persona.add(nombre);
        persona.add(apellido);
        persona.add(edad);
        persona.add(fecha);

        model.addAttribute("FormInfo", persona);
        return "infraestructura";
    }

    @PostMapping("/imprimir-formulario-usuarios")
    // El nombre de los atributos está dado por el nombre que se asigna desde el HTML
    public String imprimirDatos5(Model model, @RequestParam String nombre, String apellido, String fecha, String edad ) {
        Collection<String> persona = new ArrayList<String>();

        persona.add(nombre);
        persona.add(apellido);
        persona.add(edad);
        persona.add(fecha);

        model.addAttribute("FormInfo", persona);
        return "usuarios";
    }

}
