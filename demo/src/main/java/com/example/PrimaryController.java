package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
public class PrimaryController {
    public ButtonClass button;
    public ButtonClass button1;
   
    @FXML
    private ButtonClass card1;
    @FXML
    private ButtonClass card2;
    @FXML
    private ButtonClass card3;
    @FXML
    private ButtonClass card4;
    @FXML
    private ButtonClass card5;
    @FXML
    private ButtonClass card6;
    @FXML
    private ButtonClass card7;
    @FXML
    private ButtonClass card8;
    @FXML
    private ButtonClass card9;
    @FXML
    private ButtonClass card10;
    @FXML
    private ButtonClass card11;
    @FXML
    private ButtonClass card12;
    @FXML
    private ButtonClass card13;
    @FXML
    private ButtonClass card14;
    @FXML
    private ButtonClass card15;
    @FXML
    private ButtonClass card16;

    @FXML
    public void handleClick(ActionEvent event){
       ButtonClass card = (ButtonClass) event.getSource();
       card.doOnAction();
       if(card.switchOnProperty().get() && button== null){
        button= card;
       }
       else if(card.switchOnProperty().get() && button1==null){
        button1= card;
       }
       else if(card==button){
        button= null;
        return;
       }
       else if(card==button1){
        button1= null;
        return;
       }
       else{
        return;
       }

       equalOrNo();
    }
 public void equalOrNo()
 {
    if(button.valueForCard==button1.valueForCard){
        ButtonClass.cardsFlipped=0;
        button.setDisable(true);
        button1.setDisable(true);
        button= null;
        button1= null;
    }
    else{
        return;
    }

 }
    }

 
    // @FXML
    // private void IDK() throws IOException {
    //     App.setRoot1("face");
    // }
