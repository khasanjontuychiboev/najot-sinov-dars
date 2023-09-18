package com.xasan.najotsinovdars.controller.country;

import com.xasan.najotsinovdars.entity.country.Country;
import com.xasan.najotsinovdars.dto.country.CountryDTO;
import com.xasan.najotsinovdars.service.country.CountryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/{id}")
    public CountryDTO getCountry(@PathVariable("id") Integer id){
        return countryService.getCountry(id);
    }

    @PostMapping
    public void createCountry(@RequestBody Country country){
        countryService.createCountry(country);
    }
}
