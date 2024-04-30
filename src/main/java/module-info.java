module assassins {
    requires javafx.controls;
    requires javafx.fxml;

    opens assassins to javafx.fxml;
    exports assassins;
}
