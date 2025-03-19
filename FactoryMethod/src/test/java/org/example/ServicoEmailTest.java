package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServicoEmailTest {
    ServicoEmailTest() {
    }

    @Test
    void deveEnviarEmail() {
        IServico servico = ServicoFactory.obterServico("Email");
        Assertions.assertEquals("[E-mail Enviado] Mensagem: Mensagem teste", servico.enviar("Mensagem teste"));
    }

    @Test
    void deveObterTipoEmail() {
        IServico servico = ServicoFactory.obterServico("Email");
        Assertions.assertEquals("E-mail", servico.obterTipo());
    }
}
