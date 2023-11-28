package com.projetointegrador.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "lugar_disponivel")
public class LugarDisponivelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "quantidade")
    String quantidade;
    @Column(name = "sessao")
    String sessao;
    @Column(name="data_lugares_disponiveis")
    LocalDateTime data;
}

