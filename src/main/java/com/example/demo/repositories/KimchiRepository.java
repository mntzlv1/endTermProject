package com.example.demo.repositories;

package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;

@Data
@Entity
@Table("Kimchi")
public class Kimchi extends Ramen {

    public Kimchi(int id, String name, int price) {
        super(id, name, price);
    }

    public void add() {
        // Assuming KimchiRepository is autowired or injected by Spring
        KimchiRepository kimchiRepository = /* inject this using Spring */ null;
        kimchiRepository.save(this);
    }

    public void update() {
        // Assuming KimchiRepository is autowired or injected by Spring
        KimchiRepository kimchiRepository = /* inject this using Spring */ null;
        kimchiRepository.save(this);
    }
}