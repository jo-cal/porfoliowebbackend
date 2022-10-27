
package com.porfolio1.backend.service;


import com.porfolio1.backend.model.HabilidadesDurasYBlandas;
import java.util.List;

public interface iHabilidadesDurasYBlandasService {
    
    public List<HabilidadesDurasYBlandas> getHabilidadesDurasYBlandas();

    public void saveHabilidadesDurasYBlandas(HabilidadesDurasYBlandas habilidadesdurasyblandas);

    public void deleteHabilidadesDurasYBlandas(Long id);

    public HabilidadesDurasYBlandas buscarHabilidadesDurasYBlandas(Long id);

    public HabilidadesDurasYBlandas findHabilidadesDurasYBlandas(Long id);

}
