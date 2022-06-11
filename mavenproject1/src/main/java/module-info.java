module com.plants.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.plants.mavenproject1 to javafx.fxml;
    exports com.plants.mavenproject1;
}
