package com.xasan.najotsinovdars.dto.country;

import com.xasan.najotsinovdars.entity.country.Country;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CountryDTOService implements Function<Country,CountryDTO> {
    public CountryDTO apply(Country country){
        return new CountryDTO(country.getName().substring(0,3));
    }
}
