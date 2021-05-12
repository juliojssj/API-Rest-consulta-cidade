package com.citiesapi.countries.repository;

import com.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Countryrepository extends JpaRepository<Country, Long> {

}
