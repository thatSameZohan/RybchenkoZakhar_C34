package org.spring.controller;

import jakarta.validation.Valid;
import org.spring.dto.ProfileDto;
import org.spring.exc.TestException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }
    @PostMapping("/shop")
    public String shopPage (@Valid @ModelAttribute (value = "userprofile") ProfileDto profile, BindingResult bindingResult, Model model) throws InterruptedException {

        if (bindingResult.hasErrors()) {
            var fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                model.addAttribute(fieldError.getField() + "Error",fieldError.getDefaultMessage());
                throw new TestException();
            }
            return "login";
        }
        return "shop";
    }
}
