
package sample;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Controller {
    double b=0,c=0,aa=0,aaa=0;
    String a,s,ss,chooseCur="Выберите валюту !!!";
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private TextField textcur;


    @FXML
    private TextField textcurr;

    @FXML
    private Label label1;
    String USD = "http://www.nbrb.by/API/ExRates/Rates/145";
    double USDCURR;

    @FXML
    private Label label2;
    String EUR = "http://www.nbrb.by/API/ExRates/Rates/292";
    double EURCURR;

    @FXML
    private Label label3;
    String KZT = "http://www.nbrb.by/API/ExRates/Rates/301";
    double KZTCURR;


    @FXML
    private Button Refresh;

    @FXML
    private Label label4;
    String PLN = "http://www.nbrb.by/API/ExRates/Rates/293";
    double PLNCURR;

    @FXML
    private Label label5;
    String RUB = "http://www.nbrb.by/API/ExRates/Rates/298";
    double RUBCURR;

    @FXML
    private Label label6;
    String UAH = "http://www.nbrb.by/API/ExRates/Rates/290";
    double UAHCURR;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField1;

    @FXML
    private MenuButton menu2;

    @FXML
    private MenuButton menu1;

    @FXML
    void BLR(ActionEvent event) {
        s="BLR";
        aaa=1;
        textcur.setText(s);
    }

    @FXML
    void USD(ActionEvent event) {
        aa= USDCURR;
        s="USD";
        textcur.setText(s);
    }

    @FXML
    void KZT(ActionEvent event) {
        s="KZT";
        aa=KZTCURR/1000;
        textcur.setText(s);
    }

    @FXML
    void EUR(ActionEvent event) {
        s="EUR";
        aa=EURCURR;
        textcur.setText(s);
    }

    @FXML
    void PLN(ActionEvent event) {
        s="PLN";
        aa=PLNCURR/100;
        textcur.setText(s);
    }

    @FXML
    void UAH(ActionEvent event) {
       s="UAH";
       aa=UAHCURR/100;
        textcur.setText(s);
    }

    @FXML
    void RUB(ActionEvent event) {
        s="RUB";
        aa=RUBCURR/100;
        textcur.setText(s);
    }

    @FXML
    void BLR1(ActionEvent event) {
        ss="BLR";
        aaa=1;
        textcurr.setText(ss);
    }

    @FXML
    void USD1(ActionEvent event) {
        ss="USD";
        aaa=USDCURR;
        textcurr.setText(ss);
    }

    @FXML
    void KZT1(ActionEvent event) {
        ss="KZT";
        aaa=KZTCURR/1000;
        textcurr.setText(ss);
    }

    @FXML
    void EUR1(ActionEvent event) {
        ss="EUR";
        aaa = EURCURR;
        textcurr.setText(ss);
    }

    @FXML
    void PLN1(ActionEvent event) {
        ss="PLN";
        aaa=PLNCURR/10;
        textcurr.setText(ss);
    }

    @FXML
    void UAH1(ActionEvent event) {
        ss="UAH";
        aaa=UAHCURR/100;
        textcurr.setText(ss);
    }

    @FXML
    void RUB1(ActionEvent event) {
        ss="RUB";
        aaa=RUBCURR/100;
        textcurr.setText(ss);
    }
    @FXML
    /**
     * In this function, the entire program is managed .
     */
    void initialize() {
        textField1.textProperty().addListener((observable, oldValue, newValue) -> {
                    try {
                        Double cur = Double.parseDouble((newValue));
                        cur=cur*aa;
                        cur=cur/aaa;
                        textField2.setText(((String.valueOf(String.format( Locale.US, "%.2f", cur))))+ " ");
                    } catch (Exception e) {

                    }
        });
        textcur.setText(s);
        textcurr.setText(ss);
            // Output info about Current Official Rate on main window
            try {
                USDCURR = TestApi.call_me(USD);
                label1.setText(String.valueOf(USDCURR));
            } catch (Exception e) {
                e.printStackTrace();
                //исключ на диалог окно
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Connection error");
                // Header Text: null
                alert.setHeaderText(null);
                alert.setContentText("No Internet connection, check the connection and try again!");

                alert.showAndWait();
                 System.exit(1);
            }
            try {
                EURCURR = TestApi.call_me(EUR);
                label2.setText(String.valueOf(EURCURR));
            } catch (Exception e) {
                e.printStackTrace();

            }
            try {
                KZTCURR = TestApi.call_me(KZT);
                label3.setText(String.valueOf(KZTCURR));
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                PLNCURR = TestApi.call_me(PLN);
                label4.setText(String.valueOf(PLNCURR));
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                RUBCURR = TestApi.call_me(RUB);
                label5.setText(String.valueOf(RUBCURR));
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                UAHCURR = TestApi.call_me(UAH);
                label6.setText(String.valueOf(UAHCURR));
            } catch (Exception e) {
                e.printStackTrace();
            }
            Refresh.setOnAction(event -> {
                initialize();
            });

        }
}


