package org.example;

public class ServicoPush implements IServico{
    public String enviar(String mensagem) {
        return "[Push Notification Enviada] Mensagem: " + mensagem;
    }

    public String obterTipo() {
        return "Push Notification";
    }
}
