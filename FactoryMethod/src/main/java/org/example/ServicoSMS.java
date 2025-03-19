package org.example;

public class ServicoSMS implements IServico{
    public String enviar(String mensagem) {
        return "[SMS Enviado] Mensagem: " + mensagem;
    }
    public String obterTipo() {
        return "SMS";
    }
}
