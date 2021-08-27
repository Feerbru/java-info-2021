package com.informatorio.demo.repository;

import com.informatorio.demo.entity.EmpleadoContratado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoContratadoRepository extends CrudRepository<EmpleadoContratado, Long> {
}
