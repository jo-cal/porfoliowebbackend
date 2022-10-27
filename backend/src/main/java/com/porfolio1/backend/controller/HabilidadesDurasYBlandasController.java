
package com.porfolio1.backend.controller;


import com.porfolio1.backend.model.HabilidadesDurasYBlandas;
import com.porfolio1.backend.service.iHabilidadesDurasYBlandasService;
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
@RequestMapping("/api/habilidadesdurasyblandas")
@CrossOrigin(origins= "https://porfoliowebjorcal12.web.app")
public class HabilidadesDurasYBlandasController {
    
    @Autowired
    private iHabilidadesDurasYBlandasService habilidadesdurasyblandasService;

    @GetMapping("/all")
    public List<HabilidadesDurasYBlandas> getHabilidadesDurasYBlandas() {
        return habilidadesdurasyblandasService.getHabilidadesDurasYBlandas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HabilidadesDurasYBlandas> addHabilidadesDurasYBlandas(@PathVariable("id") Long id) {
        HabilidadesDurasYBlandas habilidadesdurasyblandas = habilidadesdurasyblandasService.buscarHabilidadesDurasYBlandas(id);
        return new ResponseEntity<>(habilidadesdurasyblandas, HttpStatus.OK);
    }

    @PostMapping("/add")    
    public void saveHabilidadesDurasYBlandas(@RequestBody HabilidadesDurasYBlandas habilidadesdurasyblandas) {
        habilidadesdurasyblandasService.saveHabilidadesDurasYBlandas(habilidadesdurasyblandas);
    }

    @DeleteMapping("/delete/{id}") 
    public ResponseEntity<?> deleteHabilidadesDurasYBlandas(@PathVariable("id") Long id) {
        habilidadesdurasyblandasService.deleteHabilidadesDurasYBlandas(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public HabilidadesDurasYBlandas updateHabilidadesDurasYBlandas(@PathVariable long id, @RequestBody HabilidadesDurasYBlandas habilidadesdurasyblandasDetails) {
        HabilidadesDurasYBlandas updateHabilidadesDurasYBlandas = habilidadesdurasyblandasService.findHabilidadesDurasYBlandas(id);
        updateHabilidadesDurasYBlandas.setTituloHabi(habilidadesdurasyblandasDetails.getTituloHabi());
        updateHabilidadesDurasYBlandas.setImagenHabi(habilidadesdurasyblandasDetails.getImagenHabi());
        updateHabilidadesDurasYBlandas.setPorcentajeHabi(habilidadesdurasyblandasDetails.getPorcentajeHabi());
        habilidadesdurasyblandasService.saveHabilidadesDurasYBlandas(updateHabilidadesDurasYBlandas);
        return updateHabilidadesDurasYBlandas;
    }

}
