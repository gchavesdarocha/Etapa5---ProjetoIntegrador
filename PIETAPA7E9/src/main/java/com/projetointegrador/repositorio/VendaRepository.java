package com.projetointegrador.repositorio;

import com.projetointegrador.data.VendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<VendaEntity, Integer> {
    // Métodos específicos, se necessário
}
