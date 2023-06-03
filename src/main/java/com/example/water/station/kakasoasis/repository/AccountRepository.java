package com.example.water.station.kakasoasis.repository;


import java.util.UUID;

import com.example.water.station.kakasoasis.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {
}