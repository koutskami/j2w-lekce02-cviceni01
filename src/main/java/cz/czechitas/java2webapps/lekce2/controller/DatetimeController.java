package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DatetimeController {

    @GetMapping("/datum")
    public ModelAndView datum(){
        ModelAndView result = new ModelAndView("datum");
        result.addObject("dnesniDatum", date); //nevim
    }
}
