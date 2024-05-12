package com.api.menu.controllers;

import com.api.menu.domain.Food;
import com.api.menu.dto.FoodResponseDTO;
import com.api.menu.dto.FoodResquestDTO;

import com.api.menu.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
   public void saveFood(@RequestBody FoodResquestDTO data){

       Food foodData = new Food(data);

       repository.save(foodData);
       return;
   }



    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

}
