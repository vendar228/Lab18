module com.example.lab18 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab18 to javafx.fxml;
    exports com.example.lab18;
    exports Lab18;
    opens Lab18 to javafx.fxml;
}