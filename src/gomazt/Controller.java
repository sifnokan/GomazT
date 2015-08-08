package gomazt;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller {

    @FXML
    private TableView tv;
    @FXML
    private TableColumn tc1;
    @FXML
    private TableColumn tc2;
    @FXML
    private TableColumn tc3;
    @FXML
    private TableColumn tc4;
    @FXML
    private TableColumn tc5;
    @FXML
    private TableColumn tc6;
    @FXML
    private TableColumn tc7;
    @FXML
    private TableColumn tc8;

    ObservableList<Familiar> fflist =
          FXCollections.observableArrayList(new Familiar());



    @FXML
    public void initialize() {
        FamiInfoParser fip = new FamiInfoParser();
        fip.read();
        fflist = FamiInfoParser.familist;


        tc1.setCellValueFactory(
                new PropertyValueFactory<Familiar, Integer>("sNo"));
        tc3.setCellValueFactory(
                new PropertyValueFactory<Familiar, Integer>("sRare"));
        tc4.setCellValueFactory(
                new PropertyValueFactory<Familiar, String>("sAttr"));
        tc2.setCellValueFactory(
                new PropertyValueFactory<Familiar, String>("sName"));
        tc5.setCellValueFactory(
                new PropertyValueFactory<Familiar, Integer>("sMpower"));
        tc6.setCellValueFactory(
                new PropertyValueFactory<Familiar, String>("sType"));
        tc7.setCellValueFactory(
                new PropertyValueFactory<Familiar, String>("sShotclass"));
        tc8.setCellValueFactory(
                new PropertyValueFactory<Familiar, String>("sSkillclass"));

        tv.setItems(fflist);
    }
}
