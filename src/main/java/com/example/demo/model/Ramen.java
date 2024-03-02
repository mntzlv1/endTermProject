package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Buldak")
public class Buldak extends Ramen {
    public Buldak(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public void add() {

    }

    public void update() {

    }
}