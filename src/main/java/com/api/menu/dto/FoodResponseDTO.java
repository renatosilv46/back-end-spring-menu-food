package com.api.menu.dto;
import com.api.menu.domain.Food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {

    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());

    }

}
