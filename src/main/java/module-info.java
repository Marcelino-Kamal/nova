module com.chatbot {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.chatbot to javafx.fxml;
    exports com.chatbot;
    opens com.chatbot.Controller to javafx.fxml;
    exports com.chatbot.Controller;
    
}
