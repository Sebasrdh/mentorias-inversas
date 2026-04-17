package com.mentorias.mentorias.service;

import com.mentorias.mentorias.model.Usuario;
import com.mentorias.mentorias.observer.ObservadorTutoria;
import com.mentorias.mentorias.factory.RolFactory;
import com.mentorias.mentorias.model.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private List<ObservadorTutoria> observadores;

    public Usuario registrarUsuario(String nombreCompleto, String correo, String password) {
        Usuario nuevoUsuario = new Usuario(nombreCompleto, correo, password);

        System.out.println("✅ NUEVO USUARIO REGISTRADO EXITOSAMENTE:");
        System.out.println("Nombre: " + nuevoUsuario.getNombreCompleto());
        System.out.println("Correo: " + nuevoUsuario.getCorreo());
        return nuevoUsuario;
    }

    public void ejecutarYNotificarAccion(String tipoAccion) {
        // El servicio ahora se encarga de instanciar y orquestar
        Rol rolDinamico = RolFactory.asignarRolPorAccion(tipoAccion);

        System.out.println("=========================================");
        System.out.println("Rol asignado dinámicamente: " + rolDinamico.getNombreRol());
        System.out.println("Acción: " + rolDinamico.ejecutarAccion());
        System.out.println("=========================================");

        this.notificarAccionTutoria(rolDinamico.getNombreRol(), rolDinamico.ejecutarAccion());
        System.out.println("=========================================");
    }

    public void notificarAccionTutoria(String nombreRol, String accion) {
        String mensajeNotificacion = " Un usuario con rol " + nombreRol + " acaba de reportar la acción: " + accion;
        if (observadores != null) {
            for (ObservadorTutoria obs : observadores) {
                obs.onTutoriaSolicitada(mensajeNotificacion);
            }
        }
    }
}