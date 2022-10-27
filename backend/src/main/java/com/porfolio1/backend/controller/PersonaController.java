
package com.porfolio1.backend.controller;



import com.porfolio1.backend.model.Persona;
import com.porfolio1.backend.service.iPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona")
@CrossOrigin(origins= "https://porfoliowebjorcal12.web.app")
public class PersonaController {
    
    @Autowired
    private iPersonaService personaService;

    @GetMapping("/all")
    public List<Persona> getPersona() {
        return personaService.getPersona();
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Persona> addPersona(@PathVariable("id") Long id) {
        Persona persona = personaService.buscarPersonas(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PostMapping("/add")    
    public void savePersona(@RequestBody Persona persona) {
        personaService.savePersona(persona);
    }

    @DeleteMapping("/delete/{id}") 
    public ResponseEntity<?> deletePersona(@PathVariable("id") Long id) {
        personaService.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public Persona updatePersona(@PathVariable long id, @RequestBody Persona personaDetails) {
        Persona updatePersona = personaService.findPersona(id);
        updatePersona.setDatosPer(personaDetails.getDatosPer());
        updatePersona.setDescripcionPer(personaDetails.getDescripcionPer());
        updatePersona.setImagenPer(personaDetails.getImagenPer());
        personaService.savePersona(updatePersona);
        return updatePersona;
    }

    
      
    
}
