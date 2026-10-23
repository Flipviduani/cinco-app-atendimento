package br.com.viduink.cinco_app_atendimentos.repositories;

import br.com.viduink.cinco_app_atendimentos.entities.Atendimento;
import br.com.viduink.cinco_app_atendimentos.factories.ConnectionFactory;

public class AtendimentoRepository {

    public void inserir (Atendimento atendimento) throws Exception{

        var factory = new ConnectionFactory();

        try (var connection = factory.createConnection()){

            var sql = """
                        insert into atendimentos(id, usuario, pergunta, resposta)
                        values(?, ?, ?, ?)
                    """;

            var statement = connection.prepareStatement(sql);
            statement.setObject(1, atendimento.getId());
            statement.setString(2, atendimento.getUsuario());
            statement.setString(3, atendimento.getPergunta());
            statement.setString(4, atendimento.getResposta());
            statement.execute();

        }

    }
}
