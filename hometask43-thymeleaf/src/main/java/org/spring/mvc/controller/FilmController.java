package org.spring.mvc.controller;

import jakarta.validation.Valid;
import org.spring.mvc.dto.FilmDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FilmController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("film",new FilmDto());
        List<FilmDto> films=new ArrayList<>();
        model.addAttribute("films",films);
        return "index.html";
    }

    @PostMapping("/add")
    public String info(@Valid @ModelAttribute(name = "film") FilmDto film,
                       BindingResult bindingResult,
                       Model model,
                       @ModelAttribute(name="films") List<FilmDto> films) {
        if (bindingResult.hasErrors()) {
            return "index.html";
        };
        films.add(film);
        return "info.html";
    }
}
