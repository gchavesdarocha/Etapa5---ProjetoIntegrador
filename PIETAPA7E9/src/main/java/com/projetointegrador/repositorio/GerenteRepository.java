package com.projetointegrador.repositorio;

import com.projetointegrador.data.GerenteEntity;
import org.springframework.stereotype.Repository;

@Repository
public class GerenteRepository extends JpaRepository<GerenteEntity, Integer> {

}
