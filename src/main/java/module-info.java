module com.unah.calculadora6 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.unah.calculadora6 to javafx.fxml;
    exports com.unah.calculadora6;
}
