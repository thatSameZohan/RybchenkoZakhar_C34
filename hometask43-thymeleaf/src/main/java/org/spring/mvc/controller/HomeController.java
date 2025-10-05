package org.spring.mvc.controller;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.dto.FilmDto;
import org.spring.mvc.service.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@RequiredArgsConstructor
@Controller
public class HomeController {

    private final FilmService service;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("film",new FilmDto());
        List<FilmDto> all=service.findAll();
        model.addAttribute("films",all);
        return "index.html";
    }
}
