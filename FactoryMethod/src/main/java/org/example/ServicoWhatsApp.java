package org.example;

public class ServicoWhatsApp {
    public String enviar(String mensagem) {
        return "[WhatsApp Enviado] Mensagem: " + mensagem;
    }

    public String obterTipo() {
        return "WhatsApp";
    }
}
