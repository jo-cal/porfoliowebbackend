/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio1.backend.service;

import com.porfolio1.backend.model.Educacion;
import com.porfolio1.backend.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Nueva
 */


@Service
@Transactional
public class EducacionService  implements iEducacionService {
    
    @Autowired
    public EducacionRepo educacionRepo;
    
    @Override
    public List<Educacion> getEducacion() { List<Educacion> listaEducacion  = educacionRepo.findAll();return listaEducacion ;}
                         
    @Override
    public void saveEducacion (Educacion educacion ) {educacionRepo.save(educacion);}     
                             
    @Override
    public void deleteEducacion (Long id) {educacionRepo.deleteById(id);}
                           
    @Override
    public Educacion findEducacion (Long id) {Educacion educacion  = educacionRepo.findById(id).orElse(null);return educacion ; }
    @Override 
    public Educacion  buscarEducaciones(Long id) {return educacionRepo.findById(id). orElse(null);}

    
}
