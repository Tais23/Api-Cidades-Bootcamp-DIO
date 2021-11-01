package com.taissantos.cidadesapi.paises.repositorio;

import com.taissantos.cidadesapi.paises.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioPaises extends JpaRepository<Pais, Long> {
}
