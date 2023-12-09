package com.example.fxcalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalcController {
    Double number = 0.0;
    String strNum = "";
    String action = "";
    @FXML
    Label currentNumLbl;
    public void subtractBtn(ActionEvent actionEvent){
        action = "-";
    }
    public void addBtn(ActionEvent actionEvent){
        action = "+";
    }
    public void allClearButton(ActionEvent actionEvent){
        strNum = "";
        number = null;
        action = "";
    }
    public void clearButton(ActionEvent actionEvent){
        strNum = "";
    }
    public void multiplyBtn(ActionEvent actionEvent){
        action = "*";
    }
    public void divideBtn(ActionEvent actionEvent){
        action = "-";
    }
    public void modulusBtn(ActionEvent actionEvent){
        action = "%";
    }
    public void signFlipBtn(ActionEvent actionEvent){

    }

    public void btnZeroPressed(ActionEvent actionEvent){
        strNum += "0";
        currentNumLbl.setText(strNum);
    }
    public void btnOnePressed(ActionEvent actionEvent){
        strNum+="1";
        currentNumLbl.setText(strNum);
    }
    public void btnTwoPressed(ActionEvent actionEvent){
        strNum+="2";
        currentNumLbl.setText(strNum);
    }
    public void btnThreePressed(ActionEvent actionEvent){
        strNum+="3";
        currentNumLbl.setText(strNum);
    }
    public void btnFourPressed(ActionEvent actionEvent){
        strNum+="4";
        currentNumLbl.setText(strNum);
    }
    public void btnFivePressed(ActionEvent actionEvent){
        strNum+="5";
        currentNumLbl.setText(strNum);
    }
    public void btnSixPressed(ActionEvent actionEvent){
        strNum+="6";
        currentNumLbl.setText(strNum);
    }
    public void btnSevenPressed(ActionEvent actionEvent){
        strNum+="7";
        currentNumLbl.setText(strNum);
    }
    public void btnEightPressed(ActionEvent actionEvent){
        strNum+="8";
        currentNumLbl.setText(strNum);
    }
    public void btnNinePressed(ActionEvent actionEvent){
        strNum+="9";
        currentNumLbl.setText(strNum);
    }

    public void btnEqualPressed(ActionEvent actionEvent){

    }
    public  void btnDecimalPressed(ActionEvent actionEvent){
        strNum+=".";
        currentNumLbl.setText(strNum);
    }
}