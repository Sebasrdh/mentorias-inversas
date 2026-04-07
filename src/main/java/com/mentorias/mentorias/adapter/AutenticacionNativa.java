package com.mentorias.mentorias.adapter;

public class AutenticacionNativa implements ProveedorAutenticacion {
    @Override
    public boolean autenticar(String correo, String password) {
        System.out.println("Validando correo y contraseña en nuestra base de datos...");
        return true;
    }
}
