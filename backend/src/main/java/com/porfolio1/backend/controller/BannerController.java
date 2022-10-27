
package com.porfolio1.backend.controller;



import com.porfolio1.backend.model.Banner;
import com.porfolio1.backend.service.iBannerService;
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
@RequestMapping("/api/banner")
@CrossOrigin(origins= "https://porfoliowebjorcal12.web.app")

public class BannerController {
   
    @Autowired
    private iBannerService bannerService;

    @GetMapping("/all")
    public List<Banner> getBanner() {
        return bannerService.getBanner();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Banner> addBanner(@PathVariable("id") Long id) {
        Banner banner = bannerService.buscarBanners(id);
        return new ResponseEntity<>(banner, HttpStatus.OK);
    }

    @PostMapping("/add")   
    public void saveBanner(@RequestBody Banner banner) {
        bannerService.saveBanner(banner);
    }

    @DeleteMapping("/delete/{id}") 
    public ResponseEntity<?> deleteBanner(@PathVariable("id") Long id) {
        bannerService.deleteBanner(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public Banner updateBanner(@PathVariable long id, @RequestBody Banner bannerDetails) {
        Banner updateBanner = bannerService.findBanner(id);
        updateBanner.setImagenBa(bannerDetails.getImagenBa());
        bannerService.saveBanner(updateBanner);
        return updateBanner;
    }

}
