package org.spring.mvc;

import jakarta.validation.Valid;
import org.spring.mvc.dto.FilmDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@SpringBootApplication
public class MainHometask43 {

    public static void main(String[] args) {
        SpringApplication.run(MainHometask43.class, args);
    }
}
