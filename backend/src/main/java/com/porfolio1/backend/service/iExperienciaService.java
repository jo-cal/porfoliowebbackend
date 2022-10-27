
package com.porfolio1.backend.service;


import com.porfolio1.backend.model.Experiencia;
import java.util.List;


public interface iExperienciaService {
    
     
    public List<Experiencia> getExperiencia();

    public void saveExperiencia(Experiencia experiencia);

    public void deleteExperiencia(Long id);

    public Experiencia buscarExperiencias(Long id);

    public Experiencia findExperiencia(Long id);

}
