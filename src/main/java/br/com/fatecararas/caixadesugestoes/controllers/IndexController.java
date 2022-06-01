package br.com.fatecararas.caixadesugestoes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class IndexController {
    
    public String index() {        
        return "index";
    }
}
