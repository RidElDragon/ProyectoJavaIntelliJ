module com.hodges.haldirhodges {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.hodges.haldirhodges to javafx.fxml;
    exports com.hodges.haldirhodges;
    exports com.hodges.haldirhodges.controller;
    opens com.hodges.haldirhodges.controller to javafx.fxml;
}