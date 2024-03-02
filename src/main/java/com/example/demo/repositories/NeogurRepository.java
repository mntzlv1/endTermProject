package com.example.demo.repositories;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;

@Data
@Entity
@Table("Neoguri")
public class Neoguri extends Ramen {

    public Neoguri(int id, String name, int price) {
        super(id, name, price);
    }

    public void add() {
        // Assuming NeoguriRepository is autowired or injected by Spring
        NeoguriRepository neoguriRepository = /* inject this using Spring */ null;
        neoguriRepository.save(this);
    }

    public void update() {
        // Assuming NeoguriRepository is autowired or injected by Spring
        NeoguriRepository neoguriRepository = /* inject this using Spring */ null;
        neoguriRepository.save(this);
    }