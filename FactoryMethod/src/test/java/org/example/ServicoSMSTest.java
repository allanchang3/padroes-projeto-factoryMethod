package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServicoSMSTest {
    ServicoSMSTest() {
    }

    @Test
    void deveEnviarSMS() {
        IServico servico = ServicoFactory.obterServico("SMS");
        Assertions.assertEquals("[SMS Enviado] Mensagem: Mensagem teste", servico.enviar("Mensagem teste"));
    }

    @Test
    void deveObterTipoSMS() {
        IServico servico = ServicoFactory.obterServico("SMS");
        Assertions.assertEquals("SMS", servico.obterTipo());
    }
}
