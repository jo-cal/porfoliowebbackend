
package com.porfolio1.backend.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false) 
    private Long idPer;
    private String datosPer;
    private String descripcionPer;
    private String imagenPer;

    public Persona() {
    }

    public Persona(Long idPer, String datosPer, String descripcionPer, String imagenPer) {
        this.idPer = idPer;
        this.datosPer = datosPer;
        this.descripcionPer = descripcionPer;
        this.imagenPer = imagenPer;
    }
    
}
