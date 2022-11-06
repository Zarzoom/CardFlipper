package com.example;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import com.example.NumberGenerator;


public class ButtonClass extends Button
{
    private final Button card = new Button();
    public int valueForCard; //Do I still need this??
    public String stringValueForCard;
    public static int cardsFlipped;
    

    private SimpleBooleanProperty switchedOn = new SimpleBooleanProperty(false);
    public SimpleBooleanProperty switchOnProperty() {return switchedOn;}

    public void doOnAction(){
        {
            if (cardsFlipped >= 2 && !switchedOn.get() ){
                return;
            } 
            else {
                switchedOn.set(!switchedOn.get());
            }
        }
    }
    private void initiation()
    {
        setText("flip me");
        // setOnAction((e) -> {
        //     if (cardsFlipped >= 2 && !switchedOn.get() ){
        //         return;
        //     } 
        //     else {
        //         switchedOn.set(!switchedOn.get());
        //     }
        // });
        valueForCard= NumberGenerator.incrementIndex();
        stringValueForCard= String.valueOf(valueForCard); 
        }
    public ButtonClass() 
    {
        initiation();
            switchedOn.addListener((itemObserved,oldVal,newVal)->
        {
    
            if (newVal)
            {
                setText(stringValueForCard);
                cardsFlipped++;

            
            }
            else
            {
                setText("flip me");
                cardsFlipped--;
            }
        });

    }
}