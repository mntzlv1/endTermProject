package com.example.demo.repositories;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;

@Data
@Entity
@Table("Buldak")
public class Buldak extends Ramen {

    public Buldak(int id, String name, int price) {
        super(id, name, price);
    }

    public void add() {
        // Assuming BuldakRepository is autowired or injected by Spring
        BuldakRepository buldakRepository = /* inject this using Spring */ null;
        buldakRepository.save(this);
    }

    public void update() {
        // Assuming BuldakRepository is autowired or injected by Spring
        BuldakRepository buldakRepository = /* inject this using Spring */ null;
        buldakRepository.save(this);
    }
}