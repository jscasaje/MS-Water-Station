package com.example.water.station.kakasoasis.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@Data
public class Response implements Serializable {
    @JsonInclude(Include.NON_NULL)
    public String message;
    @JsonInclude(Include.NON_NULL)
    public Integer status;
    @JsonInclude(Include.NON_NULL)
    public String name;
}