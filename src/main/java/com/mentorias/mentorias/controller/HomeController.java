package com.mentorias.mentorias.controller;

import com.mentorias.mentorias.factory.RolFactory;
import com.mentorias.mentorias.model.Rol;
import com.mentorias.mentorias.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private UsuarioService usuarioService;

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
    public String doLogin(@RequestParam String correo,
                          @RequestParam String password,
                          Model model) {
        model.addAttribute("usuario", correo);
        return "redirect:/homepage";
    }

    @PostMapping("/register")
    public String doRegister(
            @RequestParam("nombreCompleto") String nombreCompleto,
            @RequestParam("correo") String correo,
            @RequestParam("password") String password) {

        usuarioService.registrarUsuario(nombreCompleto, correo, password);

        return "redirect:/";
    }

    // HomeController.java - Alta cohesión: El controlador solo delega
    @PostMapping("/accion-tutoria")
    public String procesarAccionTutoria(@RequestParam("tipoAccion") String tipoAccion, Model model) {
        //Se delega el procesamiento al servicio.
        usuarioService.ejecutarYNotificarAccion(tipoAccion);
        return "redirect:/homepage";
    }
}