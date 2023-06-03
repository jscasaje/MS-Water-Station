package com.example.water.station.kakasoasis.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "Account")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    @Column(
            name = "id",
            updatable = false,
            nullable = false
    )
    private UUID id;
    @Column(
            name = "account_name"
    )
    private String accountName;
    @Column(
            name = "age"
    )
    private Integer age;
    @Column(
            name = "gender"
    )
    private String gender;
}
