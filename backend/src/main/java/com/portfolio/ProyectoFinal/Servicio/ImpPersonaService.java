package com.portfolio.ProyectoFinal.Servicio;

import com.portfolio.ProyectoFinal.Entidad.Persona;
import com.portfolio.ProyectoFinal.Repositorio.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.ProyectoFinal.Interface.IPersonService;

@Service
public class ImpPersonaService implements IPersonService {
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
