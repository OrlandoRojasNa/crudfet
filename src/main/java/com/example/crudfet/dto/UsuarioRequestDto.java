package com.example.crudfet.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UsuarioRequestDto(

        @NotBlank(message = "El nombre es obligatorio")
        String nombre,

        @NotBlank(message = "El Apellido es obligatorio")
        String apellido,

        @NotNull(message = "El email es obligatorio")
        String email,

        @NotNull(message = "La cedula es obligatoria")
        Integer cedula
) {
}