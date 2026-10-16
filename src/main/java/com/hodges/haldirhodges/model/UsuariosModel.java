package com.hodges.haldirhodges.model;

import com.hodges.haldirhodges.dto.UsuarioDto;
import java.util.ArrayList;
import java.util.List;

public class UsuariosModel {

    private List<UsuarioDto> usuarios;

    public UsuariosModel() {
        this.usuarios = new ArrayList<>();


        this.usuarios.add(new UsuarioDto(0, 1400, "Haldir", "rid@gmail.com", "1234"));
        this.usuarios.add(new UsuarioDto(1, 1908, "juan", "juan@gmail.com", "123"));
    }

    public UsuarioDto autenticar(String correo, String contrasenia) {
        for (UsuarioDto user : usuarios) {

            if (user.getCorreo().equalsIgnoreCase(correo) && user.getContrasenia().equals(contrasenia)) {
                return user;
            }
        }
        return null;
    }

    public void agregarUsuario(UsuarioDto usuario) {
        this.usuarios.add(usuario);
    }
}