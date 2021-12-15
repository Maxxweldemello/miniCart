package com.example.minicart;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Button loginButton,cancelButton,registrationButton;
    @FXML
    private Button registerButton,backButton;
    @FXML
    private Button homeButton,categoryButton,bestSellButton,aboutUsButton,contactUsButton;
    @FXML
    private Button homeButton1,categoryButton1,bestSellButton1,aboutUsButton1,contactUsButton1;
    @FXML
    private Button homeButton2,categoryButton2,bestSellButton2,aboutUsButton2,contactUsButton2;
    @FXML
    private Button homeButton3,categoryButton3,bestSellButton3,aboutUsButton3,contactUsButton3;
    @FXML
    private Button homeButton4,categoryButton4,bestSellButton4,aboutUsButton4,contactUsButton4;
    @FXML
    private Button fashionButton,electronicsButton,accessoriesButton;
    @FXML
    private Button fashionButton1,electronicsButton1,accessoriesButton1;
    @FXML
    private Button fashionButton2,electronicsButton2,accessoriesButton2;
    @FXML
    private Button okButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Button Credit_Button,COD_Button,backButton0,backButton1,okButton0,okButton1,backButton2,backButtonN;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void loginButtonOnAction(ActionEvent event) {


        if (usernameTextField.getText().isBlank() == false && passwordTextField.getText().isBlank() == false){
            validateLogin();
        } else {
            loginMessageLabel.setText("Please enter username & password");
        }

    }

    public void validateLogin(){
            //Have to work on this*
    }


    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void registrationButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("createAccView.fxml"));

        Stage window = (Stage) registrationButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void registerButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("homeView.fxml"));

        Stage window = (Stage) registerButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void backButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("loginView.fxml"));

        Stage window = (Stage) backButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }



    public void homeButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("homeView.fxml"));

        Stage window = (Stage) homeButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void categoryButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("categoryView.fxml"));

        Stage window = (Stage) categoryButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void bestSellButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("bestSellView.fxml"));

        Stage window = (Stage) bestSellButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void aboutUsButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("aboutUsView.fxml"));

        Stage window = (Stage) aboutUsButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void contactUsButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("contactUsView.fxml"));

        Stage window = (Stage) contactUsButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }



    public void homeButtonOnAction1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("homeView.fxml"));

        Stage window = (Stage) homeButton1.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void categoryButtonOnAction1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("categoryView.fxml"));

        Stage window = (Stage) categoryButton1.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void bestSellButtonOnAction1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("bestSellView.fxml"));

        Stage window = (Stage) bestSellButton1.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void aboutUsButtonOnAction1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("aboutUsView.fxml"));

        Stage window = (Stage) aboutUsButton1.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void contactUsButtonOnAction1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("contactUsView.fxml"));

        Stage window = (Stage) contactUsButton1.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }



    public void homeButtonOnAction2() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("homeView.fxml"));

        Stage window = (Stage) homeButton2.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void categoryButtonOnAction2() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("categoryView.fxml"));

        Stage window = (Stage) categoryButton2.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void bestSellButtonOnAction2() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("bestSellView.fxml"));

        Stage window = (Stage) bestSellButton2.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void aboutUsButtonOnAction2() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("aboutUsView.fxml"));

        Stage window = (Stage) aboutUsButton2.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void contactUsButtonOnAction2() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("contactUsView.fxml"));

        Stage window = (Stage) contactUsButton2.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }



    public void homeButtonOnAction3() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("homeView.fxml"));

        Stage window = (Stage) homeButton3.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void categoryButtonOnAction3() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("categoryView.fxml"));

        Stage window = (Stage) categoryButton3.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void bestSellButtonOnAction3() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("bestSellView.fxml"));

        Stage window = (Stage) bestSellButton3.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void aboutUsButtonOnAction3() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("aboutUsView.fxml"));

        Stage window = (Stage) aboutUsButton3.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void contactUsButtonOnAction3() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("contactUsView.fxml"));

        Stage window = (Stage) contactUsButton3.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }



    public void homeButtonOnAction4() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("homeView.fxml"));

        Stage window = (Stage) homeButton4.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void categoryButtonOnAction4() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("categoryView.fxml"));

        Stage window = (Stage) categoryButton4.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void bestSellButtonOnAction4() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("bestSellView.fxml"));

        Stage window = (Stage) bestSellButton4.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void aboutUsButtonOnAction4() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("aboutUsView.fxml"));

        Stage window = (Stage) aboutUsButton4.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void contactUsButtonOnAction4() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("contactUsView.fxml"));

        Stage window = (Stage) contactUsButton4.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void fashionButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("categoryView.fxml"));

        Stage window = (Stage) fashionButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void electronicsButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("electronicsView.fxml"));

        Stage window = (Stage) electronicsButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void accessoriesButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("accessoriesView.fxml"));

        Stage window = (Stage) accessoriesButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void fashionButtonOnAction1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("categoryView.fxml"));

        Stage window = (Stage) fashionButton1.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void electronicsButtonOnAction1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("electronicsView.fxml"));

        Stage window = (Stage) electronicsButton1.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void accessoriesButtonOnAction1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("accessoriesView.fxml"));

        Stage window = (Stage) accessoriesButton1.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void fashionButtonOnAction2() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("categoryView.fxml"));

        Stage window = (Stage) fashionButton2.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void electronicsButtonOnAction2() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("electronicsView.fxml"));

        Stage window = (Stage) electronicsButton2.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void accessoriesButtonOnAction2() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("accessoriesView.fxml"));

        Stage window = (Stage) accessoriesButton2.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void okButtonOnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("paymentView.fxml"));

        Stage window = (Stage) okButton.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void creditButtonOnAction() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("paymentView1.fxml"));

        Stage window = (Stage) Credit_Button.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void okButton0OnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("paymentView2.fxml"));

        Stage window = (Stage) okButton0.getScene().getWindow();
        window.setScene(new Scene(root,600,400));


    }
    public void backButton0OnAction() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("paymentView.fxml"));

        Stage window = (Stage) backButton0.getScene().getWindow();
        window.setScene(new Scene(root,600,400));


    }

    public void codButtonOnAction() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("paymentView2.fxml"));

        Stage window = (Stage) COD_Button.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void backButtonOnActionN() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("categoryView.fxml"));

        Stage window = (Stage) backButtonN.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void okButtonOnAction1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SuccessView.fxml"));

        Stage window = (Stage) okButton1.getScene().getWindow();
        window.setScene(new Scene(root,600,400));


    }
    public void backButtonOnAction1() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("paymentView.fxml"));

        Stage window = (Stage) backButton1.getScene().getWindow();
        window.setScene(new Scene(root,600,400));
    }

    public void backButtonOnAction2() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("homeView.fxml"));

        Stage window = (Stage) backButton2.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));

    }

}