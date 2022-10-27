
package com.porfolio1.backend.repository;

import com.porfolio1.backend.model.HabilidadesDurasYBlandas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HabilidadesDurasYBlandasRepo extends JpaRepository<HabilidadesDurasYBlandas,Long>   {
    
}
