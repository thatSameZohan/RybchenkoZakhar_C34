package org.spring.mvc.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.spring.mvc.dto.FilmDto;
import org.spring.mvc.dto.FilmSearchDto;
import org.spring.mvc.service.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequiredArgsConstructor
@Controller
@RequestMapping("/film")
public class FilmController {

    private final FilmService service;

    @PostMapping("save")
    public String save(
            @Valid @ModelAttribute(name = "film") FilmDto film,
            BindingResult bindingResult,
            Model model) {
        if (bindingResult.hasErrors()) {
            return "index.html";
        };
        service.save(film);
        List<FilmDto> all=service.findAll();
        model.addAttribute("films",all);
        return "index.html";
    }
    @PostMapping("/search")
    public String search(
            @ModelAttribute(name = "film") FilmDto film,
            FilmSearchDto dto,
            Model model) {
        List<FilmDto> result = service.findByCriteria(dto);
        model.addAttribute("films",result);
        return "index.html";
    }
    @PostMapping("/delete")
    public String delete(
            @ModelAttribute(name = "film") FilmDto film,
            FilmSearchDto dto,
            Model model) {
        service.delete(dto.getName());
        List<FilmDto> all=service.findAll();
        model.addAttribute("films",all);
        return "index.html";
    }
}
