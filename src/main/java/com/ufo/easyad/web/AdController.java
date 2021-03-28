package com.ufo.easyad.web;

import com.ufo.easyad.domain.Ad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdController {

    @GetMapping("/ads/{adId}")
    public Ad getAd(@PathVariable("adId") Integer adId){
        return new Ad(adId, "Test", "test desc");
    }

}
