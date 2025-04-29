package com.chatbot.Controller;
import java.net.URL;

import com.chatbot.Models.Chatbot;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    @FXML private TextArea chatArea;
    @FXML private TextField userInput;
    private Chatbot chatbot;
    private boolean darkMode = false;

    public ChatController() {
        chatbot = new Chatbot();  
    }


    @FXML
    private void handleUserInput() {
        String input = userInput.getText();
        if (!input.trim().isEmpty()) {
            chatArea.appendText("You: " + input + "\n");
            String botResponse = chatbot.getResponse(input);
            chatArea.appendText(botResponse + "\n");
            userInput.clear();
        }
     
    }
    @FXML
    private void toggleTheme(){
        Scene scene = chatArea.getScene();
        if (scene != null) {
            if(darkMode){
                scene.getStylesheets().remove(getClass().getResource("/css/dark.css").toExternalForm());
               
            }else{
                scene.getStylesheets().add(getClass().getResource("/css/dark.css").toExternalForm());
                
            }
            darkMode = !darkMode;  
        }
    }
     

}
