package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServicoFactoryTest {
    ServicoFactoryTest() {
    }

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Teste");
            Assertions.fail();
        } catch (IllegalArgumentException var2) {
            IllegalArgumentException e = var2;
            Assertions.assertEquals("Serviço inexistente", e.getMessage());
        }

    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("WhatsApp");
            Assertions.fail();
        } catch (IllegalArgumentException var2) {
            IllegalArgumentException e = var2;
            Assertions.assertEquals("Serviço inválido", e.getMessage());
        }

    }
}
