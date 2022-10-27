
package com.porfolio1.backend.service;

import com.porfolio1.backend.model.Proyecto;
import java.util.List;

public interface iProyectoService {
    
    public List<Proyecto> getProyecto();

    public void saveProyecto(Proyecto proyecto);

    public void deleteProyecto(Long id);

    public Proyecto buscarProyectos(Long id);

    public Proyecto findProyecto(Long id);

}
