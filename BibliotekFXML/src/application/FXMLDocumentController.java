/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

/**
 *
 * @author R
 * @param <Table>
 */
public class FXMLDocumentController<TableDEmo> implements Initializable {

    @FXML
    private Label message;

    @FXML
    private Label error;

    @FXML
    private Button add;

    @FXML
    private Button delete;

    @FXML
    private TextField titleFld;

    @FXML
    private TextField qualityFld;

    @FXML
    private TextField quantityFld;

    @FXML
    private TextField priceFld;

    @FXML
    private TableView<TableDemo> TabelView;

    @FXML
    private TableColumn<TableDemo, String> titlecol;

    @FXML
    private TableColumn<TableDemo, String> qualitycol;

    @FXML
    private TableColumn<TableDemo, String> quantitycol;

    @FXML
    private TableColumn<TableDemo, String> pricecol;
    
    

    // create observable list   " list" ,   then add start list from class "Table"
    private final ObservableList<TableDemo> list = FXCollections.observableArrayList(
            new TableDemo("Robin in the Huud", "Fett Nice", "9", "420"),
            new TableDemo("Java: steg för steg", "Bra", "99", "436"),
            new TableDemo("Big Java: Late Objects", "Bra", "31", "622"),
            new TableDemo("Web Design with HTML,CSS,JavaScript", "Bra", "13", "403"),
            new TableDemo("C++ Prime", "Bra", "5", "424")
    );

    // Add book to the list by fields and button add 
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == add) {
            if (titleFld.getText().equals("") || (qualityFld.getText().equals("") || (quantityFld.getText().equals("") || (priceFld.getText().equals(""))))) {

                message.setText("");  // hide message
                error.setText("Please fill in Title,Quality,Quantity and Price."); // show Error message 

            } else {

                // Messages hide 
                error.setText("");
                message.setText("");

                list.add(new TableDemo(titleFld.getText(), qualityFld.getText(), quantityFld.getText(), priceFld.getText()));
                message.setText(titleFld.getText() + " book added!");

                System.out.println("Book Added: " + titleFld.getText() + " " + qualityFld.getText() + " " + quantityFld.getText() + " " + priceFld.getText());
                titleFld.clear();
                qualityFld.clear();
                quantityFld.clear();
                priceFld.clear();

            }
        }
    }

    // change Title 
    @FXML
    private void handleEditActionTitle(CellEditEvent<TableDemo, String> b) {

        // get old title - to display for user that the change suceeded
        String tmp1 = ((TableDemo) b.getTableView().getItems().get(b.getTablePosition().getRow())).getTitle();

        // get info from title column , then change it by setTitle 
        titlecol.setOnEditCommit((CellEditEvent<TableDemo, String> t) -> {
            ((TableDemo) t.getTableView().getItems().get(
                    t.getTablePosition().getRow())).setTitle(t.getNewValue());

            // get new title - to display for user that the change suceeded
            String tmp2 = ((TableDemo) t.getTableView().getItems().get(t.getTablePosition().getRow())).getTitle();

            error.setText("");  // hide error message 
            message.setText("Updated title from " + tmp1 + " to " + tmp2); // show message that you updated
        });

    }

    // Change Quality
    @FXML
    private void handleEditActionQuality(CellEditEvent<TableDemo, String> b) {

        // get old quality - to display for user that the change suceeded
        String tmp1 = ((TableDemo) b.getTableView().getItems().get(b.getTablePosition().getRow())).getQuality();

        // get info from Quality column , then change it by setQuality
        qualitycol.setOnEditCommit((CellEditEvent<TableDemo, String> t) -> {
            ((TableDemo) t.getTableView().getItems().get(
                    t.getTablePosition().getRow())).setQuality(t.getNewValue());

            // get new Quality - to display for user that the change suceeded
            String tmp2 = ((TableDemo) t.getTableView().getItems().get(t.getTablePosition().getRow())).getQuality();

            error.setText("");  // hide error message 
            message.setText("Updated quality from " + tmp1 + " to " + tmp2); // show message that you updated
        });

    }

    // change Quantity
    @FXML
    private void handleEditActionQuantity(CellEditEvent<TableDemo, String> b) {

        // get old Quantity - to display for user that the change suceeded
        String tmp1 = ((TableDemo) b.getTableView().getItems().get(b.getTablePosition().getRow())).getQuantity();

        // get info from Quantity column , then change it by setQuantity
        quantitycol.setOnEditCommit((CellEditEvent<TableDemo, String> t) -> {
            ((TableDemo) t.getTableView().getItems().get(
                    t.getTablePosition().getRow())).setQuantity(t.getNewValue());

            // get new Quanitity - to display for user that the change suceeded
            String tmp2 = ((TableDemo) t.getTableView().getItems().get(t.getTablePosition().getRow())).getQuantity();

            error.setText("");  // hide error message 
            message.setText("Updated quantity from " + tmp1 + " to " + tmp2); // show message that you updated
        });

    }

    // Change Price 
    @FXML
    private void handleEditActionPrice(CellEditEvent<TableDemo, String> b) {

        // get old price - to display for user that the change suceeded
        String tmp1 = ((TableDemo) b.getTableView().getItems().get(b.getTablePosition().getRow())).getPrice();

        // get info from Price column , then change it by setPrice
        pricecol.setOnEditCommit((CellEditEvent<TableDemo, String> t) -> {
            ((TableDemo) t.getTableView().getItems().get(
                    t.getTablePosition().getRow())).setPrice(t.getNewValue());

            // get new price - to display for user that the change suceeded
            String tmp2 = ((TableDemo) t.getTableView().getItems().get(t.getTablePosition().getRow())).getPrice();

            error.setText("");  // hide error message 
            message.setText("Updated price from " + tmp1 + " to " + tmp2); // show message that you updated
        });

    }

    // Delte book from list
    @FXML
    private void delBook(ActionEvent d) {

        // get selected  item then make it to "selected" 
        TableDemo selected = TabelView.getSelectionModel().getSelectedItem();

        // then remove the " selected from list "
        if (selected != null) {
            list.remove(selected);

        } else {
            error.setText("Please choose something from the list before deleting"); // error message 
            message.setText(""); // hide message label 
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // CellFactory for the collums
        titlecol.setCellValueFactory(new PropertyValueFactory<TableDemo,String>("title"));
        qualitycol.setCellValueFactory(new PropertyValueFactory<TableDemo,String>("quality"));
        quantitycol.setCellValueFactory(new PropertyValueFactory<TableDemo,String>("quantity"));
        pricecol.setCellValueFactory(new PropertyValueFactory<TableDemo,String>("price"));

        // adding list to TableView 
        TabelView.setItems(list);

        // To change items in the List, by textfields 
        titlecol.setCellFactory(TextFieldTableCell.forTableColumn());
        qualitycol.setCellFactory(TextFieldTableCell.forTableColumn());
        quantitycol.setCellFactory(TextFieldTableCell.forTableColumn());
        pricecol.setCellFactory(TextFieldTableCell.forTableColumn());

    }

}
