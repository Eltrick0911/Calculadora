package com.unah.calculadora6;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    float dato1=0, dato2=0;
    float resul;
    int op;

    @FXML
    private TextField texto;
       @FXML
    private Button c;

    @FXML
    private Button cero;

    @FXML
    private Button cinco;

    @FXML
    private Button cuatro;

    @FXML
    private Button dos;

    @FXML
    private Button entre;

    @FXML
    private Button igual;

    @FXML
    private Button mas;

    @FXML
    private Button menos;

    @FXML
    private Button nueve;

    @FXML
    private Button ocho;

    @FXML
    private Button por;

    @FXML
    private Button seis;

    @FXML
    private Button siete;

    @FXML
    private Button tres;

    @FXML
    private Button uno;
       
    @FXML
    private void switchToSecondary(ActionEvent event) throws IOException {
        if (event.getSource() == uno)
            texto.setText(texto.getText() + "1");
        else if(event.getSource() == dos)
            texto.setText(texto.getText() + "2");
        else if(event.getSource() == tres)
            texto.setText(texto.getText() + "3");
        else if(event.getSource() == cuatro)
            texto.setText(texto.getText() + "4");
        else if(event.getSource() == cinco)
            texto.setText(texto.getText() + "5");
        else if(event.getSource() == seis)
            texto.setText(texto.getText() + "6");
        else if(event.getSource() == siete)
            texto.setText(texto.getText() + "7");
        else if(event.getSource() == ocho)
            texto.setText(texto.getText() + "8");
        else if(event.getSource() == nueve)
            texto.setText(texto.getText() + "9");
        else if(event.getSource() == cero)
            texto.setText(texto.getText() + "0");
        
        else if(event.getSource() == mas){
           if (dato1==0){
           dato1 = Float.parseFloat(texto.getText());
           texto.setText("");
           op = 1;
           }
           else{
           dato2 = Float.parseFloat(texto.getText());
           texto.setText("");
           
           switch (op){
               case 1: resul=dato1 + dato2;              
               break;
               case 2: resul=dato1 - dato2;             
               break;
               case 3: resul=dato1 * dato2;             
               break;
               case 4: resul=dato1 / dato2;              
               break;
           }
           op = 1; 
           dato1=resul;
           texto.setText("");
           }
        }
        else if(event.getSource() == menos){
           if (dato1==0){
           dato1 = Float.parseFloat(texto.getText());
           texto.setText("");
           op = 2;
           }
           else{
           dato2 = Float.parseFloat(texto.getText());
           texto.setText("");
            
           switch (op){
               case 1: resul=dato1 + dato2;               
               break;
               case 2: resul=dato1 - dato2;             
               break;
               case 3: resul=dato1 * dato2;             
               break;
               case 4: resul=dato1 / dato2;
               
               break;
           }
           op = 2;
           dato1=resul;
           texto.setText("");
           }
        }
        else if(event.getSource() == por){
           if (dato1==0){
           dato1 = Float.parseFloat(texto.getText());
           texto.setText("");
           op = 3;
           }
           else{
           dato2 = Float.parseFloat(texto.getText());
           texto.setText("");
            
           switch (op){
               case 1: resul=dato1 + dato2;              
               break;
               case 2: resul=dato1 - dato2;              
               break;
               case 3: resul=dato1 * dato2;             
               break;
               case 4: resul=dato1 / dato2;            
               break;
           }
           op = 3;
           dato1=resul;
           texto.setText("");
           }
        }
        else if(event.getSource() == entre){
           if (dato1==0){
           dato1 = Float.parseFloat(texto.getText());
           texto.setText("");
           op = 4;
           }
           else{
           dato2 = Float.parseFloat(texto.getText());
           texto.setText("");
           
           switch (op){
               case 1: resul=dato1 + dato2;              
               break;
               case 2: resul=dato1 - dato2;              
               break;
               case 3: resul=dato1 * dato2;             
               break;
               case 4: resul=dato1 / dato2;
               break;
           }
            op = 4;
            dato1=resul;
            texto.setText("");
           }
        }
        else if(event.getSource() == igual){
           dato2 = Float.parseFloat(texto.getText());
           
           switch (op){
               case 1: resul=dato1 + dato2;
               texto.setText(String.valueOf(resul));
               break;
               case 2: resul=dato1 - dato2;
               texto.setText(String.valueOf(resul));
               break;
               case 3: resul=dato1 * dato2;
               texto.setText(String.valueOf(resul));
               break;
               case 4: resul=dato1 / dato2;
               texto.setText(String.valueOf(resul));
               break;
           }
        }
        
    }
    @FXML
    private void reset (ActionEvent event){
        texto.setText("");
        dato1=0;dato2=0;resul=0;
        Alert mensaje = new Alert(Alert.AlertType.INFORMATION);
        mensaje.setContentText("Programa creado por Patrick Cabrera-20211020775");
        mensaje.showAndWait();
    }
}