package com.mentorias.mentorias.adapter;

public class AdaptadorGoogle implements ProveedorAutenticacion {
    @Override
    public boolean autenticar(String correoGoogle, String tokenGoogle) {
        System.out.println("Conectando con servidores de Google..." );
        System.out.println("Traduciendo el Token de Google a nuestro formato..." );
        System.out.println("¡Usuario de Google autenticado!" );
        return true;
    }
}
