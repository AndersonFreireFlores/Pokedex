package com.example.pokedex.Controllers;

import com.example.pokedex.Service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TypeController {

    private final TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping("/types")
    public void getAllTypes() {
        typeService.getAllTypes();
    }

    @GetMapping("/types/{id}")
    public void getTypeById(@PathVariable int id) {
        typeService.getTypeById(id);
    }

}
