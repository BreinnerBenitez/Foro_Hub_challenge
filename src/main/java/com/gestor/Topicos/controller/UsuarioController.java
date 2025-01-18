package com.gestor.Topicos.controller;

import com.gestor.Topicos.domain.usuario.DatosRegistroUsuario;
import com.gestor.Topicos.domain.usuario.Usuario;
import com.gestor.Topicos.domain.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    @RequestMapping("/registro")
    private ResponseEntity registrarTopico(@RequestBody @Valid DatosRegistroUsuario datosRegistro){
        // Cifrar la contraseña
        String passwordCifrada = passwordEncoder.encode(datosRegistro.password());
        usuarioRepository.save(new Usuario(datosRegistro, passwordCifrada));
        return ResponseEntity.ok("Usuario registrado exitosamente");
    }

}
