package com.asesinosdesoftware.javeparking;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class HelloController {

    // Contenedor principal del layout, inyectado desde el archivo FXML
    @FXML
    private BorderPane contenedor;

    // Método para cargar y mostrar la vista de registrar persona
    @FXML
    private void registrarCliente() {
        try {
            // Carga la vista desde el archivo FXML
            AnchorPane pane = FXMLLoader.load(getClass().getResource("Registro_View.fxml"));
            // Establece la vista cargada en el centro del contenedor principal
            contenedor.setCenter(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}