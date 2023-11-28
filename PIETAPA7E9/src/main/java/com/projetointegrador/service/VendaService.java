package com.projetointegrador.service;

import com.projetointegrador.data.VendaEntity;
import com.projetointegrador.repositorio.VendaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    VendaRepository vendaRepository;

    public VendaEntity criarVenda(VendaEntity venda) {
        venda.setDataVenda(LocalDateTime.now());
        venda.setValorTotal();
        venda.setValorTotalSomenteBilhete();
        vendaRepository.save(venda);

        return venda;
    }

    public VendaEntity atualizarVenda(Integer vendaId, VendaEntity vendaDto) {
        VendaEntity venda = getVenda(vendaId);

        venda.setQntdBilhete(vendaDto.getQntdBilhete());
        venda.setTipoCombo(vendaDto.getTipoCombo());
        venda.setDataVenda(LocalDateTime.now());
        venda.setValorTotal();

        vendaRepository.save(venda);

        return venda;
    }

    public List<VendaEntity> listarTodasVendas() {

        return vendaRepository.findAll();
    }

    public void deletarVenda(Integer vendId) {

        VendaEntity vend = getVenda(vendId);

        vendaRepository.deleteById(vend.getId());
    }

    public VendaEntity getVenda(Integer vendaId) {
        Optional<VendaEntity> vendaOptional = vendaRepository.findById(vendaId);

        if (vendaOptional.isPresent()) {
            VendaEntity venda = vendaOptional.get();
            return venda;
        } else {
            return null;
        }
    }
}
