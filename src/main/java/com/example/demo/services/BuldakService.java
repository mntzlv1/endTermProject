package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuldakService {
    @Autowired
    private BuldakRepository buldakRepository;

    public Buldak addBuldak(int id, String name, int price) {
        Buldak buldak = new Buldak(id, name, price);
        buldak.setAvailable(true);
        return buldakRepository.save(buldak);
    }

    public void returnBuldak(int id) {
        Optional<Buldak> optionalBuldak = buldakRepository.findById(id);
        if (optionalBuldak.isPresent()) {
            Buldak buldak = optionalBuldak.get();
            buldakRepository.delete(buldak);
        }
    }

    public void deleteBuldak(int id) {
        buldakRepository.deleteById(id);
    }
}

