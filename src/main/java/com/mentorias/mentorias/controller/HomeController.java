package com.mentorias.mentorias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/homepage")
    public String homepage(Model model) {
        model.addAttribute("usuario", "Usuario");
        return "homepage";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam String usuario,
                          @RequestParam String password,
                          Model model) {

        model.addAttribute("usuario", usuario);
        return "redirect:/homepage";
    }

    @PostMapping("/register")
    public String doRegister() {
        return "login";
    }
}