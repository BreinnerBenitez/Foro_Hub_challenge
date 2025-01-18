package com.gestor.Topicos.domain.topico;

 import com.gestor.Topicos.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        Usuario usuario,
        @NotBlank
        String curso
) {
}
