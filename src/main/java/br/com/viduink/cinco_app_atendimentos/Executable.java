package br.com.viduink.cinco_app_atendimentos;

import br.com.viduink.cinco_app_atendimentos.services.AtendimentoService;

public class Executable {

    void main(){

        var atendimentoService = new AtendimentoService();
        atendimentoService.realizarAtendimento();
    }

}
