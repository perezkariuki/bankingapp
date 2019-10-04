/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterlogin;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author keith
 */
public class AfterLogin extends Application {
    
    @Override
    public void start(Stage stage) {
        
       //Create Label for Current Balance
        Text text1 = new Text ("Enter amount to deposit:");
        Text text2 = new Text ("View Bank Balance:");   
        
        //create textfield for Amount to Deposit
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
      
        //create buttons 
        Button button1 = new Button("Click to Deposit");
        Button button3 = new Button("Click to view balance");
       
        //creating a grid pane and import relevant classes
        GridPane gridPane = new GridPane();
        
        //set up size for the pane
        gridPane.setMinSize(600, 400);
        
        // set padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        
        //set the vertical and horizantal gaps between the columns
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        
        //set the grid alignment
        gridPane.setAlignment(Pos.CENTER);
        
        // arrange all the nodes in the grid
       
        gridPane.add(text1, 0, 0);
        gridPane.add(text2, 0, 5);
        gridPane.add(textField2, 0, 1);
        
        gridPane.add(button1, 0, 2);
        gridPane.add(button3, 0, 6);
       
        button1.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-font-size:13pt;");
        button3.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-font-size:18pt;");

               
        text1.setStyle("-fx-font: normal bold 30px 'serif'");
        text2.setStyle("-fx-font: normal bold 30px 'serif'");
        gridPane.setStyle("-fx-background-color: WHITE;");
        
        
        //Creating a scene object
        Scene scene = new Scene(gridPane);
        
        //Setting title to the stage
        stage.setTitle("Banking System");
        
        //Adding scene to the stage
        stage.setScene(scene);
        
        //Displaying the contents of the stage
        stage.show();
        
        
         
        
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
