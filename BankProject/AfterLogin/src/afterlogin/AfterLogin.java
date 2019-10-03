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
        Text text1 = new Text ("Current Balance:");
        
        //Create label for AMOUNT TO WITHDRAW
        Text text2 = new Text("Amount to withdraw:");
        
        //create label for AMOUNT TO DEPOSIT
        Text text3 = new Text("Amount to deposit:");
        
        
        
        //create textfield for Amount to Deposit
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
      
        //create buttons 
        Button button1 = new Button("Current Balance");
        Button button2 = new Button("Amount To Withdraw");
        Button button3 = new Button("Amount To Deposit");
       
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
        gridPane.add(button1, 1, 0);
       
       
        gridPane.add(text2, 0, 2);
        gridPane.add(textField1, 1, 2);
        gridPane.add(button2, 1, 3);
       
        gridPane.add(text3, 0, 4);
        gridPane.add(textField2, 1, 4);
        gridPane.add(button3, 1, 5);
       
        button1.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-font-size:13pt;");
        button2.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-font-size:13pt;");
        button3.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-font-size:13pt;");

               
        text1.setStyle("-fx-font: normal bold 20px 'serif'");
        text2.setStyle("-fx-font: normal bold 20px 'serif'");
        text3.setStyle("-fx-font: normal bold 20px 'serif'");
        gridPane.setStyle("-fx-background-color: WHITE;");
        
        
        //Creating a scene object
        Scene scene = new Scene(gridPane);
        
        //Setting title to the stage
        stage.setTitle("Movie Library System");
        
        //Adding scene to the stage
        stage.setScene(scene);
        
        //Displaying the contents of the stage
        stage.show();
        
        
         
        
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
