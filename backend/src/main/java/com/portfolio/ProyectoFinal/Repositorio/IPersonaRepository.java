package com.portfolio.ProyectoFinal.Repositorio;

import com.portfolio.ProyectoFinal.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
