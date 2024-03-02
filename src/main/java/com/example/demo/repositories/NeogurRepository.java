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
        NeoguriRepository neoguriRepository = /* inject this using Spring */ null;
        neoguriRepository.save(this);
    }

    public void update() {
        NeoguriRepository neoguriRepository = /* inject this using Spring */ null;
        neoguriRepository.save(this);
    }