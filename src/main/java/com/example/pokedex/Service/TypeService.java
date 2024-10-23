package com.example.pokedex.Service;

import com.example.pokedex.Repositories.TypeRepository;
import com.example.pokedex.entities.Type;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {

    private final TypeRepository typeRepository;

    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public List<Type> getAllTypes() {
        return typeRepository.findAll();
    }

    public Type getTypeById(int id) {
        return typeRepository.findById(id).orElse(null);
    }

    public Type saveType(Type type) {
        return typeRepository.save(type);
    }

    public void deleteTypeById(int id) {
        typeRepository.deleteById(id);
    }
}
