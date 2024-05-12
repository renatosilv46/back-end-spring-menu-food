package com.api.menu.domain;
import com.api.menu.dto.FoodResquestDTO;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="foods")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of ="id")
public class Food{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;


    public Food(FoodResquestDTO data) {

        this.image = data.image();
        this.title = data.title();
        this.price = data.price();
    }


}




