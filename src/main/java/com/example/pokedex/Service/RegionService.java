package com.example.pokedex.Service;

import com.example.pokedex.Repositories.RegionRepository;
import com.example.pokedex.entities.Region;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    private final RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    public Region getRegionById(int id) {
        return regionRepository.findById(id).orElse(null);
    }

    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    public void deleteRegionById(int id) {
        regionRepository.deleteById(id);
    }
}
