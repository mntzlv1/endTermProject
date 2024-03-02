package com.example.demo.repositories;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;

@Data
@Entity
@Table("Seafood")
public class Seafood extends Ramen {

    public Seafood(int id, String name, int price) {
        super(id, name, price);
    }

    public void add() {
        SeafoodRepository seafoodRepository = /* inject this using Spring */ null;
        seafoodRepository.save(this);
    }

    public void update() {
        SeafoodRepository seafoodRepository = /* inject this using Spring */ null;
        seafoodRepository.save(this);
    }
}