package com.informatorio.demo.repository;

import com.informatorio.demo.entity.EmpleadoPlanta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoPlantaRepository extends CrudRepository<EmpleadoPlanta, Long> {
}
