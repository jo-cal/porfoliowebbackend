
package com.porfolio1.backend.repository;


import com.porfolio1.backend.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepo  extends JpaRepository<Banner,Long> {
    
}
