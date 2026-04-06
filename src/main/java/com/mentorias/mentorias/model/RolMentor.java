package com.mentorias.mentorias.model;

public class RolMentor implements Rol {
    @Override
    public String getNombreRol() {
        return "Mentor";
    }

    @Override
    public String ejecutarAccion() {
        return "Iniciando flujo para OFRECER una tutoría...";
    }
}