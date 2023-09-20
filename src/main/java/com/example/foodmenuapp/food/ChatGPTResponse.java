package com.example.foodmenuapp.food;

import java.util.List;

public record ChatGPTResponse(List<ChatGPTChoice> choices) {
    public String text() {
        return choices.get(0).message().content();
    }
}
