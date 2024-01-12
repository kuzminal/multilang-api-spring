package ru.kuzmin.airapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kuzmin.airapp.model.Airport;
import ru.kuzmin.airapp.service.AirportService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class AirportController {
    private final AirportService service;

    public AirportController(AirportService service) {
        this.service = service;
    }
    @GetMapping
    public List<Airport> getAll(@RequestParam(name = "lang", required = false, defaultValue = "ru") String lang,
                                    @RequestParam(name = "name", required = false) String name) {
        return service.findByNameWithLocale(name, lang);
    }


}
