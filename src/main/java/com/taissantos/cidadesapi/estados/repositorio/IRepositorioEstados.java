package com.taissantos.cidadesapi.estados.repositorio;

import com.taissantos.cidadesapi.estados.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioEstados extends JpaRepository<Estado, Long> {
}
