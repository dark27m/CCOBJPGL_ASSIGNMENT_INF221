package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class ClassmateController {

    @FXML
    Button MyButton1, MyButton2, MyButton3, MyButton4, MyButton5;

    Tim tim = new Tim();
    Sim sim = new Sim();
    Bea bea = new Bea();
    Josh josh = new Josh();
    Justin justin = new Justin();

    public void initialize() {

        tim.setName("Jan-Timmothy Lukban");
        tim.setCharacter("Very Sweet");

        sim.setName("Mark Simmone Delos Reyes");
        sim.setCharacter("Shy");

        justin.setName("Justin Canedo");
        justin.setCharacter("Cool");

        bea.setName("Bea Asuncion");
        bea.setCharacter("Friendly");

        josh.setName("Josh Labayne");
        josh.setCharacter("Hyper");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(MyButton1)) {
            alert.setContentText("My full name is " + justin.getName() + " and I am " + justin.getCharacter());
        }

        if (sourceButton == MyButton2) {
            alert.setContentText("My full name is " + bea.getName() + " and I am " + bea.getCharacter());
        }
        if (sourceButton == MyButton3) {
            alert.setContentText("My full name is " + sim.getName() + " and I am " + sim.getCharacter());
        }
        if (sourceButton == MyButton4) {
            alert.setContentText("My full name is " + tim.getName() + " and I am " + tim.getCharacter());
        }
        if (sourceButton == MyButton5) {
            alert.setContentText("My full name is " + josh.getName() + " and I am " + josh.getCharacter());
        }
        alert.showAndWait();

    }
}