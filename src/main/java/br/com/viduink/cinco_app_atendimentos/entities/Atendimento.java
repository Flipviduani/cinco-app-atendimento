package br.com.viduink.cinco_app_atendimentos.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Atendimento {

    private UUID id;
    private String usuario;
    private String pergunta;
    private LocalDateTime dataHoraAtendimento;
}