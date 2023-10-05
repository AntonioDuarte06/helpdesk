package com.duarte.helpdesk.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public enum Perfil {

    ADMIN(0, "ROLE_ADMIN"),
    CLIENTE(1, "ROLE_CLIENTE"),
    TECNICO(2, "ROLE_TECNICO");

    private Integer codigo;
    private String descricao;

    public static Perfil toEnum(Integer cod) {
        if (Objects.isNull(cod))
            return null;
        for (Perfil x : Perfil.values()){
            if (cod.equals(x.getCodigo()))
                return x;
        }
        throw new IllegalArgumentException("Perfil Invalido.");
    }

}
