package com.empresa.actividad0_20_bitwise;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField input1;

    @FXML
    private TextField input2;

    @FXML
    protected void onAndButtonClick() {
        int a = Integer.parseInt(input1.getText());
        int b = Integer.parseInt(input2.getText());
        int result = a & b;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Operador AND");
        alert.setHeaderText("Operador Bitwise AND");
        alert.setContentText(a + " & " + b + " resulta en " + Integer.toBinaryString(result));
        alert.showAndWait();
    }

    @FXML
    protected void onOrButtonClick() {
        int a = Integer.parseInt(input1.getText());
        int b = Integer.parseInt(input2.getText());
        int result = a | b;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Operador OR");
        alert.setHeaderText("Operador Bitwise OR");
        alert.setContentText(a + " | " + b + " resulta en " + Integer.toBinaryString(result));
        alert.showAndWait();
    }

    @FXML
    protected void onXorButtonClick() {
        int a = Integer.parseInt(input1.getText());
        int b = Integer.parseInt(input2.getText());
        int result = a ^ b;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Operador XOR");
        alert.setHeaderText("Operador Bitwise XOR");
        alert.setContentText(a + " ^ " + b + " resulta en " + Integer.toBinaryString(result));
        alert.showAndWait();
    }

    @FXML
    protected void onNotButtonClick() {
        int a = Integer.parseInt(input1.getText());
        int result = ~a;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Operador NOT");
        alert.setHeaderText("Operador Bitwise NOT");
        alert.setContentText("~" + Integer.toBinaryString(a) + " resulta en " + Integer.toBinaryString(result));
        alert.showAndWait();
    }

    @FXML
    protected void onShiftLeftButtonClick() {
        int a = Integer.parseInt(input1.getText());
        int b = Integer.parseInt(input2.getText());
        int result = a << b;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Operador Desplazar a la izquierda");
        alert.setHeaderText("Operador Bitwise Desplazar a la izquierda");
        alert.setContentText(a + " << " + b + " resulta en " + Integer.toBinaryString(result));
        alert.showAndWait();
    }

    @FXML
    protected void onShiftRightButtonClick() {
        int a = Integer.parseInt(input1.getText());
        int b = Integer.parseInt(input2.getText());
        int result = a >> b;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Operador Desplazar a la derecha");
        alert.setHeaderText("Operador Bitwise Desplazar a la derecha");
        alert.setContentText(a + " >> " + b + " resulta en " + Integer.toBinaryString(result));
        alert.showAndWait();
    }
}