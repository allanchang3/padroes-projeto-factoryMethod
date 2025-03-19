package org.example;

public class ServicoFactory {
    public ServicoFactory() {
    }

    public static IServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("org.example.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception var4) {
            throw new IllegalArgumentException("Serviço inexistente");
        }

        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        } else {
            return (IServico)objeto;
        }
    }
}
