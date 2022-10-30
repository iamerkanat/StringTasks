module com.example.stringtasks {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.stringtasks to javafx.fxml;
    exports com.example.stringtasks;
}