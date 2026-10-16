package com.hodges.haldirhodges.controller;

import com.hodges.haldirhodges.dto.UsuarioDto;
import com.hodges.haldirhodges.model.UsuariosModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UsuariosController {

    @FXML
    private TextField txtCorreo;

    @FXML
    private PasswordField txtContrasenia;

    @FXML
    private Label welcomeText;

    private UsuariosModel model = new UsuariosModel();

    @FXML
    protected void onLoginClick() {
        String correo = txtCorreo.getText().trim();
        String contrasenia = txtContrasenia.getText();

        if (correo.isEmpty() || contrasenia.isEmpty()) {
            welcomeText.setText("Por favor, completa todos los campos.");
            return;
        }

        UsuarioDto usuarioLogueado = model.autenticar(correo, contrasenia);

        if (usuarioLogueado != null) {
            welcomeText.setText("¡Bienvenido/a, " + usuarioLogueado.getNombre() + "!");
        } else {
            welcomeText.setText("Correo o contraseña incorrectos.");
        }
    }

    @FXML
    protected void onRegistrarseClick() {
        welcomeText.setText("esto no hace nada todavia brochacho");
    }
}