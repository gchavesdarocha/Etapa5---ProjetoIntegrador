package com.projetointegrador.repositorio;

import com.projetointegrador.data.LugarDisponivelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LugarDisponivelRepository extends JpaRepository<LugarDisponivelEntity, Integer> {

}
