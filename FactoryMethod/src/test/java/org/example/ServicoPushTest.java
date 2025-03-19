package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServicoPushTest {
    ServicoPushTest() {
    }

    @Test
    void deveEnviarPush() {
        IServico servico = ServicoFactory.obterServico("Push");
        Assertions.assertEquals("[Push Notification Enviada] Mensagem: Mensagem teste", servico.enviar("Mensagem teste"));
    }

    @Test
    void deveObterTipoPush() {
        IServico servico = ServicoFactory.obterServico("Push");
        Assertions.assertEquals("Push Notification", servico.obterTipo());
    }
}
