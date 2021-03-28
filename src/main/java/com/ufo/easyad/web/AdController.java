package com.ufo.easyad.web;

import com.ufo.easyad.domain.Ad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdController {

    @GetMapping("/ads/{adId}")
    public Ad getAd(@PathVariable("adId") Integer adId){
        return new Ad(adId, "Test", "test desc");
    }

    @GetMapping("/ads")
    public List<Ad> getAds(){
        return List.of(new Ad(1, "Test", "test desc"));
    }
}
