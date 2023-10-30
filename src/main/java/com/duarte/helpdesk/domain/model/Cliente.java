package com.duarte.helpdesk.domain.model;

import com.duarte.helpdesk.domain.enums.Perfil;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Cliente extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
        super();
        addPerfil(Perfil.CLIENTE);
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha, List<Chamado> chamados) {
        super(id, nome, cpf, email, senha);
        addPerfil(Perfil.CLIENTE);
    }
}
