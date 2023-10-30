package com.duarte.helpdesk.domain.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cliente extends Pessoa {

    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
        super();
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha, List<Chamado> chamados) {
        super(id, nome, cpf, email, senha);
    }
}
