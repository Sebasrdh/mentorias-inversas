package com.mentorias.mentorias.service;

import com.mentorias.mentorias.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    // Metodo para simular el registro
    public Usuario registrarUsuario(String nombreCompleto, String correo, String password) {
        Usuario nuevoUsuario = new Usuario(nombreCompleto, correo, password);

        System.out.println("✅ NUEVO USUARIO REGISTRADO EXITOSAMENTE:");
        System.out.println("Nombre: " + nuevoUsuario.getNombreCompleto());
        System.out.println("Correo: " + nuevoUsuario.getCorreo());
        return nuevoUsuario;
    }
}