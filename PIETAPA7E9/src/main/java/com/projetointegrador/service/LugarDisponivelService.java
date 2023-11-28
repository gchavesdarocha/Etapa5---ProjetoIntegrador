package com.projetointegrador.service;

import com.projetointegrador.data.LugarDisponivelEntity;
import com.projetointegrador.repositorio.LugarDisponivelRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugarDisponivelService {

    @Autowired
    LugarDisponivelRepository lugarDisponivelRepository;

    public LugarDisponivelEntity criarLugar(LugarDisponivelEntity lugar) {
        lugar.setData(LocalDateTime.now());
        lugarDisponivelRepository.save(lugar);

        return lugar;
    }

    public LugarDisponivelEntity atualizarLugar(Integer lugarId, LugarDisponivelEntity lugarDisponivelDto) {
    LugarDisponivelEntity lugarDisponivel = getLugarDisponivel(lugarId);

        lugarDisponivel.setQuantidade(lugarDisponivelDto.getQuantidade());
        lugarDisponivel.setSessao(lugarDisponivelDto.getSessao());
        lugarDisponivel.setData(LocalDateTime.now());

        lugarDisponivelRepository.save(lugarDisponivel);

        return lugarDisponivel;
    }

    public List<LugarDisponivelEntity> listarTodasTodosLugares() {

        return lugarDisponivelRepository.findAll();
    }

    public LugarDisponivelEntity getLugarDisponivel(Integer lugarId) {
        Optional<LugarDisponivelEntity> lugarOptional = lugarDisponivelRepository.findById(lugarId);

        if (lugarOptional.isPresent()) {
            LugarDisponivelEntity lugar = lugarOptional.get();
            return lugar;
        } else {
            return null;
        }
    }
}
