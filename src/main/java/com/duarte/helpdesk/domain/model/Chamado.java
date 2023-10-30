package com.duarte.helpdesk.domain.model;

import com.duarte.helpdesk.domain.enums.Prioridade;
import com.duarte.helpdesk.domain.enums.Status;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Chamado {

    private Integer id;
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento;
    private Prioridade prioridade;
    private Status status;
    private String titulo;
    private String obervacoes;

    private Tecnico tecnico;
    private Cliente cliente;

    public Chamado(Integer id, Prioridade prioridade, Status status, String titulo,
                   String obervacoes, Tecnico tecnico, Cliente cliente) {
        super();
        this.id = id;
        this.prioridade = prioridade;
        this.status = status;
        this.titulo = titulo;
        this.obervacoes = obervacoes;
        this.tecnico = tecnico;
        this.cliente = cliente;
    }
}
