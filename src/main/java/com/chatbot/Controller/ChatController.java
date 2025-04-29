package com.chatbot.Controller;
import com.chatbot.Models.Chatbot;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    @FXML private TextArea chatArea;
    @FXML private TextField userInput;
    private Chatbot chatbot;

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
}
