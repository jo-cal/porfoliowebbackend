
package com.porfolio1.backend.service;

import com.porfolio1.backend.model.Persona;
import java.util.List;
public interface iPersonaService {
    
    public List<Persona> getPersona();

    public void savePersona(Persona persona);

    public void deletePersona(Long id);

    public Persona buscarPersonas(Long id);

    public Persona findPersona(Long id);
    
    
}
