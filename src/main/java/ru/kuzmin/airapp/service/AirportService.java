package ru.kuzmin.airapp.service;

import org.springframework.stereotype.Service;
import ru.kuzmin.airapp.model.Airport;
import ru.kuzmin.airapp.repository.AirportRepo;

import java.util.List;
import java.util.Optional;

@Service
public class AirportService {
    private final AirportRepo repo;

    public AirportService(AirportRepo repo) {
        this.repo = repo;
    }

    public List<Airport> findByNameWithLocale(String name, String locale) {
        return repo.findByAirportNameWithLocale(name, locale);
        }
}
