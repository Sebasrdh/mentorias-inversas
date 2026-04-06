package com.mentorias.mentorias.model;

public class RolAprendiz implements Rol {
    @Override
    public String getNombreRol() {
        return "Aprendiz";
    }

    @Override
    public String ejecutarAccion() {
        return "Iniciando flujo para BUSCAR y RECIBIR una tutoría...";
    }
}