package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KimchiService {
    @Autowired
    private KimchiRepository kimchiRepository;

    public Kimchi addKimchi(int id, String name, int price) {
        Kimchi kimchi = new Kimchi(id, name, price);
        kimchi.setAvailable(true);
        return kimchiRepository.save(kimchi);
    }

    public void returnKimchi(int id) {
        Optional<Kimchi> optionalKimchi = kimchiRepository.findById(id);
        if (optionalKimchi.isPresent()) {
            Kimchi kimchi = optionalKimchi.get();
            kimchiRepository.delete(kimchi);
        }
    }

    public void deleteKimchi(int id) {
        kimchiRepository.deleteById(id);
    }
}