package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeafoodService {
    @Autowired
    private SeafoodRepository seafoodRepository;

    public Seafood addSeafood(int id, String name, int price) {
        Seafood seafood = new Seafood(id, name, price);
        seafood.setAvailable(true);
        return seafoodRepository.save(seafood);
    }

    public void returnSeafood(int id) {
        Optional<Seafood> optionalSeafood = seafoodRepository.findById(id);
        if (optionalSeafood.isPresent()) {
            Seafood seafood = optionalSeafood.get();
            seafoodRepository.delete(seafood);
        }
    }

    public void deleteSeafood(int id) {
        seafoodRepository.deleteById(id);
    }
}