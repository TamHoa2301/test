package com.mycompany.abc;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a = 10;
//<<<<<<< HEAD
        if ( a > 0)
//=======
//        if ( a < 10 )
//>>>>>>> main
            App.setRoot("secondary");
    }
}
