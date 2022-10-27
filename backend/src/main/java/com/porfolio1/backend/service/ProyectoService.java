
package com.porfolio1.backend.service;


import com.porfolio1.backend.model.Proyecto;
import com.porfolio1.backend.repository.ProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProyectoService implements iProyectoService  {
    
     @Autowired
    public ProyectoRepo proyectoRepo;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> listaProyecto = proyectoRepo.findAll();
        return listaProyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyecto = proyectoRepo.findById(id).orElse(null);
        return proyecto;
    }

    @Override
    public Proyecto buscarProyectos(Long id) {
        return proyectoRepo.findById(id).orElse(null);
    }

}
