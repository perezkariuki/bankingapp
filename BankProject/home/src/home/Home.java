/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;

/**
 *
 * @author user
 */
public class Home extends Application {

    @Override
    public void start(Stage stage) {
        Text text1 = new Text("EmailAddress:");

        Text text2 = new Text("Password:");

        TextField textField1 = new TextField();

        TextField textField2 = new TextField();

        Button button1 = new Button("Login");
        Button button2 = new Button("Register");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(button1, 1, 3);

        gridPane.add(text2, 0, 2);
        gridPane.add(textField2, 1, 2);
        gridPane.add(button2, 2, 3);

        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");

        text1.setStyle("-fx-font: normal bold 20px 'serif'");
        text2.setStyle("-fx-font: normal bold 20px 'serif'");
        gridPane.setStyle("-fx-background-color: BEIGE;");

        Scene scene = new Scene(gridPane);

        stage.setTitle("Home page");

        stage.setScene(scene);

        stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

