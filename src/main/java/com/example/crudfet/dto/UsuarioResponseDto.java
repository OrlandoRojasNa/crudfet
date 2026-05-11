package com.example.crudfet.dto;

public record UsuarioResponseDto(
        Long id,
        String nombre,
        String apellido,
        String email,
        Integer cedula
) {
}