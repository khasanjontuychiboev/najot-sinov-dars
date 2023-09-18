package com.xasan.najotsinovdars.service.country;

import com.xasan.najotsinovdars.dto.country.CountryDTO;
import com.xasan.najotsinovdars.dto.country.CountryDTOService;
import com.xasan.najotsinovdars.entity.country.Country;
import com.xasan.najotsinovdars.repository.country.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private final CountryRepository countryRepository;
    private final CountryDTOService countryDTOService;

    public CountryService(CountryRepository countryRepository, CountryDTOService countryDTOService) {
        this.countryRepository = countryRepository;
        this.countryDTOService = countryDTOService;
    }

    public CountryDTO getCountry(Integer id){
        Country country = countryRepository.getReferenceById(id);
        return countryDTOService.apply(country);
    }
    public void createCountry(Country country){
        country.setName(country.getName().toUpperCase());
        countryRepository.save(country);
    }
}
