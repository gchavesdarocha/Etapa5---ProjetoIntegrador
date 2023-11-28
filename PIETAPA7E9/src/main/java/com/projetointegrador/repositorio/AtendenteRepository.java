package com.projetointegrador.repositorio;

import com.projetointegrador.data.AtendenteEntity;
import org.springframework.stereotype.Repository;

@Repository
public class AtendenteRepository extends JpaRepository<AtendenteEntity, Integer> {

}
