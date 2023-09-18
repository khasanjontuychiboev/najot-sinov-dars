package com.xasan.najotsinovdars.repository.country;

import com.xasan.najotsinovdars.entity.country.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
