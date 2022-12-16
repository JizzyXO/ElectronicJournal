module com.example.electronicjournal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.electronicjournal to javafx.fxml;
    exports com.example.electronicjournal;
}