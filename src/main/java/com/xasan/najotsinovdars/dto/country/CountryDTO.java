package com.xasan.najotsinovdars.dto.country;

public class CountryDTO {
    private String countryCode;

    public CountryDTO(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
