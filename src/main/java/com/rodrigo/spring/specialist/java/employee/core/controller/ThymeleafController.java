package com.rodrigo.spring.specialist.java.employee.core.controller;

import com.rodrigo.spring.specialist.java.employee.core.models.ClientThymeleaf;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ThymeleafController {

    @GetMapping("/primeira-tela/model")
    public String primeiraTelaComModel(Model model) {
        System.out.println("Primeiro teste com thymeleaf + java + springboot");
        model.addAttribute("nome", "Rodrigo");
        return "teste";
    }

    @GetMapping("/primeira-tela/model-map")
    public String primeiraTelaComModelMap(ModelMap modelmap) {
        System.out.println("Primeiro teste com thymeleaf + java + springboot com ModelMap");
        modelmap.addAttribute("nome", "Rodrigo");
        return "teste";
    }

    // Exemplo com ModelAndView
    @GetMapping("/primeira-tela/model-view")
    public ModelAndView acaoModelAndView() {
        ModelAndView modelAndView = new ModelAndView("teste");
        modelAndView.addObject("nome", "Especialista SpringBoot");
        return modelAndView;
    }

    @GetMapping("primeira-tela/action3")
    public String action3(Model model) {
        model.addAttribute("client", new ClientThymeleaf("Rodrigo", "34"));
        return "form";
    }

    /*
    Como no form.html os atributos tem referência name e age, com o @modelAttribute indicando eles pelo valor
    é possível buscar os valores escritos em tela.
     */
    @PostMapping("primeira-tela/action3")
    public String action3(@ModelAttribute(value = "name") String nome, @ModelAttribute(value = "age") String idade) {
        System.out.println("Nome: ".concat(nome));
        System.out.println("Idade: ".concat(idade));
        return "form";
    }

    @PostMapping("primeira-tela/action4")
    public String action4(ClientThymeleaf clientThymeleaf) {
        System.out.println("Cliente: ".concat(clientThymeleaf.toString()));
        return "form";
    }

    /*
    Com anotação @RequestParam se passar na url "?texto=Rodrigo",
    o sout imprime Rodrigo,
    mesma coisa com idade e habilidades

    O default dessa anotação é ser obrigatório, por isso precisamos colocar:
    @RequestParam(required = false) no caso de ser opcional
     */
    @GetMapping("primeira-tela/action5/{id}")
    public String action5(
            @PathVariable("id") String id,
            @RequestParam(required = false, name = "texto") String texto,
            @RequestParam(required = false, name = "idade") Integer idade,
            @RequestParam(required = false) List<String> habilidades) {
        System.out.println(id);
        System.out.println(texto);
        System.out.println(idade);
        System.out.println(habilidades);
        return "teste";
    }

}
