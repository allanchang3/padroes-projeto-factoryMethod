package org.example;

public class ServicoEmail implements IServico{
    public String enviar(String mensagem) {
        return "[E-mail Enviado] Mensagem: " + mensagem;
    }
    public String obterTipo() {
        return "E-mail";
    }
}
