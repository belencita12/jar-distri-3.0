package com.miapp.sistemasdistribuidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstadoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer estadoId;
    private String nombreEstado;
}
