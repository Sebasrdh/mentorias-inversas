package com.mentorias.mentorias.observer;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements ObservadorTutoria{
    @Override
    public void onTutoriaSolicitada(String mensaje) {
        System.out.println("[Alerta de Email enviada]" + mensaje);
        System.out.println("Asunto: Tienes una nueva actualización en Mentorías Inversas.");
    }
}
