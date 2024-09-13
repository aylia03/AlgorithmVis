module com.visulizer.algorithmvis {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.visulizer.algorithmvis to javafx.fxml;
    exports com.visulizer.algorithmvis;
}