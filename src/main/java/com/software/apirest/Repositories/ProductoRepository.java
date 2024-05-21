package com.software.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
    
}
