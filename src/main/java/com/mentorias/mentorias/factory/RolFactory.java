package com.mentorias.mentorias.factory;

import com.mentorias.mentorias.model.Rol;
import com.mentorias.mentorias.model.RolAprendiz;
import com.mentorias.mentorias.model.RolMentor;

public class RolFactory {

    public static Rol asignarRolPorAccion(String accion) {
        if ("ENSENAR".equalsIgnoreCase(accion)) {
            return new RolMentor();
        } else if ("APRENDER".equalsIgnoreCase(accion)) {
            return new RolAprendiz();
        }
        throw new IllegalArgumentException("Acción no válida");
    }
}