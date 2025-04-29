package com.chatbot.Models;

public class Chatbot {

    
    public String getResponse(String input) {
        if (input.toLowerCase().contains("hello")) {
            return "Bot: Hi there! How can I help you today?";
        } else if (input.toLowerCase().contains("bye")) {
            return "Bot: Goodbye! Have a nice day!";
        } else {
            return "Bot: I didn't quite understand that. Can you say it differently?";
        }
    }
}
