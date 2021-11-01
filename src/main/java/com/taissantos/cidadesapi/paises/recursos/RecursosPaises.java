package com.taissantos.cidadesapi.paises.recursos;
import com.taissantos.cidadesapi.paises.Pais;
import com.taissantos.cidadesapi.paises.repositorio.IRepositorioPaises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class RecursosPaises {

    @Autowired
    public IRepositorioPaises repository;

    @GetMapping
    public List<Pais> paises(){
        return repository.findAll();

    }
}
