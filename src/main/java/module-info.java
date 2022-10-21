module student {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.desktop;

    opens student to javafx.fxml;
    exports student;
}
