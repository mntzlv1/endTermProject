package com.example.demo.model;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ramen")
public class Ramen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private boolean available;
}