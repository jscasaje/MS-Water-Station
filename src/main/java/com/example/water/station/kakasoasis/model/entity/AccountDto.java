package com.example.water.station.kakasoasis.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {

    private UUID id;
    private String accountName;
    private Integer age;
    private String gender;
}
