package ru.kuzmin.airapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "airports_data")
@Data
public class Airport {
    @Id
    String airportCode;
    //@JdbcTypeCode(SqlTypes.JSON)
    private String airportName;
    //@JdbcTypeCode(SqlTypes.JSON)
    private String city;
    String timezone;
}
