package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.util.Stack;

public class Main extends Application { // implements EventHandler<ActionEvent>; if using handle() method

    // button refers to type Button
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.show();

        button = new Button();
        button.setText("Click me"); // could also have been passed as first param for a new button obj.

        // could have another class for handling events, you'd change this to the new class
        // using lambda expression to set action, it's similar to how we used it in javascript.
        // java treats "e" as our EventHandler. since EventHandler interface only has 1 method, java knows to treat
        // e as our EventHandler!
        // can use {} like js too if we have multiple lines of code.
        button.setOnAction(e -> System.out.println("This was clicked!"));

        StackPane layout = new StackPane(); // will position button in the middle
        layout.getChildren().add(button); // adding button into the layout

        // Scene params: xPane layout, w, h
        Scene scene = new Scene(layout, 444,444);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // handle() is called when button is clicked (or when any action occurs).
    // if statements are used to filter where action is from!
    /*@Override
    public void handle(ActionEvent event) {
        if(event.getSource() == button) {
            System.out.println("Button was clicked!");
        }
    }*/

    // Set up as a javafx application.
    // When launch() is called, everything is set up in the Application class,
    // then the start() method is called.
    public static void main(String[] args) {
        launch(args);
    }

    // The "Stage" is the entire window (incl. all close/min buttons etc.)
    // The "Scene" is the stuff the "stage" (aka window) contains.
}
