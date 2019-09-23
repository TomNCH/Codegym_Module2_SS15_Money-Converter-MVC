package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @PostMapping("/Converter")
    public String converter(@RequestParam float rate, float usd, Model model){
        float vnd = rate * usd;
        model.addAttribute("vnd", vnd);
        return "/result";
    }
}
