package ru.kuzmin.airapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.kuzmin.airapp.model.Airport;

import java.util.List;

public interface AirportRepo extends JpaRepository<Airport, String> {
    @Query(value = """
            select 
                airport_code, 
                btrim(cast(airport_name[:locale] AS text), '"') as airport_name, 
                btrim(cast(city[:locale] AS text), '"') as city, 
                timezone 
            from 
                airports_data
            where 
                airport_name ->> :locale ilike %:name% or cast(:name AS text) is NULL
            ;
            """, nativeQuery = true)
    List<Airport> findByAirportNameWithLocale(@Param("name") String airportName, @Param("locale") String locale);
}
