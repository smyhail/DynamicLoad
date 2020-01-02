package com;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller implements Initializable {

    @FXML
    private BorderPane borderPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void close(MouseEvent mouseEvent) {
        Stage stage = (Stage) borderPane.getScene().getWindow();
        stage.close();
    }

    public void clear(MouseEvent mouseEvent) {
        borderPane.setCenter( null );
    }

    public void u1(MouseEvent mouseEvent) {
        loadUi("ui1");
    }

    public void u2(MouseEvent mouseEvent) {
        loadUi("ui2");
    }

    public void u3(MouseEvent mouseEvent) {
        loadUi("ui3");
    }


    private void loadUi (String ui){
        Parent rot = null;
        try{
          // FXMLLoader fXMLLoader = null;

           rot = FXMLLoader.load(getClass().getResource( "/"+ui+".fxml" ));
            
        }catch (IOException ex ){
            Logger.getLogger( Controller.class.getName()).log( Level.SEVERE,null,ex) ;
        }
        borderPane.setBottom(rot);
    }

}
