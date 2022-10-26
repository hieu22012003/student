module student.student3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens student.student3 to javafx.fxml;
    exports student.student3;
}
