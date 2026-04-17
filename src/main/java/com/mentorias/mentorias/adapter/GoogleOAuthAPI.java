package com.mentorias.mentorias.adapter;

public class GoogleOAuthAPI {

    public boolean verifyGoogleAuthToken(String authHash) {
        System.out.println("[API GOOGLE] Verificando firma digital del token...");
        if (authHash != null && authHash.length() > 10) {
            System.out.println("[API GOOGLE] Token válido. Retornando datos del usuario.");
            return true;
        }
        return false;
    }
}