package com.gestor.Topicos.domain.usuario;

public record DatosRegistroUsuario(
        String nombre,
        String username,
        String email,
        String password
) {
}
