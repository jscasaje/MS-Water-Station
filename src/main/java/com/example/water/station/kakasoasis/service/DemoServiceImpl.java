package com.example.water.station.kakasoasis.service;


import com.example.water.station.kakasoasis.model.entity.Account;
import com.example.water.station.kakasoasis.model.entity.AccountDto;
import com.example.water.station.kakasoasis.repository.AccountRepository;
import jakarta.ws.rs.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService {
    private static final Logger log = LoggerFactory.getLogger(DemoServiceImpl.class);
    @Autowired
    AccountRepository accountRepository;
    AccountDto account;

    public DemoServiceImpl() {
    }

    public String printSomething() {
        return "changed";
    }

    public Account getAll() {
        Optional<Account> accountDto = this.accountRepository.findAll().stream().findFirst();
        Account accountDtos = (Account)accountDto.orElseThrow(() -> {
            return new NotFoundException();
        });
        return accountDtos;
    }
}