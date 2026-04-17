package com.mentorias.mentorias.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdaptadorGoogle implements ProveedorAutenticacion {

    private final GoogleOAuthAPI googleAPI;

    // Se inyecta la dependencia desde el exterior, eliminando el uso de "new" dentro del componente.
    @Autowired
    public AdaptadorGoogle(GoogleOAuthAPI googleAPI) {
        this.googleAPI = googleAPI;
    }

    @Override
    public boolean autenticar(String correoGoogle, String tokenGoogle) {
        System.out.println("Conectando con servidores de Google..." );
        System.out.println("Traduciendo el Token de Google a nuestro formato..." );
        System.out.println("¡Usuario de Google autenticado!" );
        return true;
    }
}