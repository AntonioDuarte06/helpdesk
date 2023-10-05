package com.duarte.helpdesk.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public enum Prioridade {

    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2, "ALTA");

    private Integer codigo;
    private String descricao;

    public static Prioridade toEnum(Integer cod) {
        if (Objects.isNull(cod))
            return null;
        for (Prioridade x : Prioridade.values()){
            if (cod.equals(x.getCodigo()))
                return x;
        }
        throw new IllegalArgumentException("Prioridade Invalida.");
    }

}
