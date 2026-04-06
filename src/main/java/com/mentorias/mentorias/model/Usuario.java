package com.mentorias.mentorias.model;

import java.util.List;

public class Usuario {
    // Datos de registro obligatorios
    private String nombreCompleto;
    private String correo;
    private String password;

    // Parámetros internos (se llenarán después en "Configuración")
    private String fechaNacimiento;
    private String rut;
    private String telefono;
    private List<String> intereses;
    private List<String> maestrias;
    public Usuario(String nombreCompleto, String correo, String password) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.password = password;
    }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

}