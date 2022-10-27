
package com.porfolio1.backend.service;

import com.porfolio1.backend.model.Persona;
import com.porfolio1.backend.repository.PersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService  implements iPersonaService  {
    
    @Autowired
    public PersonaRepo personaRepo;

    @Override
    public List<Persona> getPersona() {
        List<Persona> listaPersona  = personaRepo.findAll();
        return listaPersona;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = personaRepo.findById(id).orElse(null);
        return persona;
    }

    @Override
    public Persona buscarPersonas(Long id) {
        return personaRepo.findById(id).orElse(null);
    }

}
