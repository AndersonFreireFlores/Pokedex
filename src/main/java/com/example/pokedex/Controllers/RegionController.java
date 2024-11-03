package com.example.pokedex.Controllers;

import com.example.pokedex.Service.RegionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RegionController {

    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping("/regions")
    public void getAllRegions() {
        regionService.getAllRegions();
    }

    @GetMapping("/regions/{id}")
    public void getRegionById(@PathVariable int id) {
        regionService.getRegionById(id);
    }
}
