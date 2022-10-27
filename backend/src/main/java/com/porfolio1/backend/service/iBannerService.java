
package com.porfolio1.backend.service;


import com.porfolio1.backend.model.Banner;
import java.util.List;

public interface iBannerService {
    
        public List<Banner> getBanner();

        public void saveBanner(Banner banner);

        public void deleteBanner(Long id);

        public Banner buscarBanners(Long id);

        public Banner findBanner(Long id);
    
    }

