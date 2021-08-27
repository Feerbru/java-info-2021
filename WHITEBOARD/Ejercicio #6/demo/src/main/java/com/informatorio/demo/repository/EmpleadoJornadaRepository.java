package com.informatorio.demo.repository;

import com.informatorio.demo.entity.EmpleadoJornada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoJornadaRepository extends CrudRepository<EmpleadoJornada, Long> {
}
