package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RamenService {
    @Autowired
    private RamenRepository ramenRepository;

    public Ramen addRamen(int id, String name, int price) {
        Ramen ramen = new Ramen();
        ramen.setId(id);
        ramen.setName(name);
        ramen.setPrice(price);
        ramen.setAvailable(true);
        return ramenRepository.save(ramen);
    }

    public void returnRamen(int id) {
        Optional<Ramen> optionalRamen = ramenRepository.findById(id);
        if (optionalRamen.isPresent()) {
            Ramen ramen = optionalRamen.get();
            ramenRepository.delete(ramen);
        }
    }

    public void deleteRamen(int id) {
        ramenRepository.deleteById(id);
    }
}