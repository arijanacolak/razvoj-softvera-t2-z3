package ba.unsa.etf.rs.tutorijal2;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javax.lang.model.util.Types;
import javax.swing.*;

public class Controller {

    public Label labela2;
    public TextField unos_polje;

    public void najduzaRijec(ActionEvent actionEvent) {
        if (unos_polje.getText().trim().isEmpty()) {
            System.out.println("Niste unijeli rečenicu!");
        }
        String s = unos_polje.getText();
        String[] rijeci = s.split( " " );
        String najduza = " ";
        for ( int i = 0; i < rijeci.length; i++ )
        {
            if ( rijeci[i].length() > najduza.length() ) {
                najduza = rijeci[i];
            }
        }
        if (najduza.contains(".") || najduza.contains("!") || najduza.contains("?") || najduza.contains(";") || najduza.contains(":") || najduza.contains(",")) {
            najduza = najduza.replace(".","");
            najduza = najduza.replace("!","");
            najduza = najduza.replace("?","");
            najduza = najduza.replace(";","");
            najduza = najduza.replace(":","");
            najduza = najduza.replace(",","");
        }
        labela2.setText( najduza.toUpperCase() );
    }

}
