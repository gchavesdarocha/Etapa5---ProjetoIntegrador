package com.projetointegrador.repositorio;

import com.projetointegrador.data.UsuarioEntity;
import org.springframework.stereotype.Repository;


@Repository
public class UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
    
}
