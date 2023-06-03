package com.example.water.station.kakasoasis.service;

import com.example.water.station.kakasoasis.model.entity.Account;
import org.springframework.stereotype.Component;

@Component
public interface DemoService {
    String printSomething();

    Account getAll();
}

