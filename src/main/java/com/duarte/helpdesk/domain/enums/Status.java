package com.duarte.helpdesk.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public enum Status {

    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");

    private Integer codigo;
    private String descricao;

    public static Status toEnum(Integer cod) {
        if (Objects.isNull(cod))
            return null;
        for (Status x : Status.values()){
            if (cod.equals(x.getCodigo()))
                return x;
        }
        throw new IllegalArgumentException("Status Invalido.");
    }

}
