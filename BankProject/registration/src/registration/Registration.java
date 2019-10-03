/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

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
public class Registration extends Application {

    @Override
    public void start(Stage stage) {
        Text text1 = new Text("FirstName:");

        Text text2 = new Text("SecondName:");
        
        Text text3 = new Text("EmailAddress:");
        
        Text text4 = new Text("Passwords:");
        
        Text text5 = new Text("Confirm Passsword:");
        
        Text text6 = new Text("InitialDeposit:");

        TextField textField1 = new TextField();

        TextField textField2 = new TextField();
        
        TextField textField3 = new TextField();
        
        TextField textField4 = new TextField();
        
        TextField textField5 = new TextField();
        
        TextField textField6 = new TextField();

        Button button1 = new Button("SUBMIT");
        Button button2 = new Button("CLEAR");
        Button button3 = new Button("CANCEL");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(600, 400);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
      

        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        
        
        gridPane.add(text3, 0, 2);
        gridPane.add(textField3, 1, 2);
        
        
        gridPane.add(text4, 0, 3);
        gridPane.add(textField4, 1, 3);
        
        
        gridPane.add(text5, 0, 4);
        gridPane.add(textField5, 1, 4);
        
        
        gridPane.add(text6, 0, 5);
        gridPane.add(textField6, 1, 5);
        
        
        gridPane.add(button1, 1, 6);
        gridPane.add(button2, 2, 6);
        gridPane.add(button3, 3, 6);

        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        button3.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");

        text1.setStyle("-fx-font: normal bold 20px 'serif'");
        text2.setStyle("-fx-font: normal bold 20px 'serif'");
        text3.setStyle("-fx-font: normal bold 20px 'serif'");
        text4.setStyle("-fx-font: normal bold 20px 'serif'");
        text5.setStyle("-fx-font: normal bold 20px 'serif'");
        text6.setStyle("-fx-font: normal bold 20px 'serif'");
        gridPane.setStyle("-fx-background-color: BEIGE;");

        Scene scene = new Scene(gridPane);

        stage.setTitle("Registration page");

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

