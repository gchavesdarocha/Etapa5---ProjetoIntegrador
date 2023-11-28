package com.projetointegrador.data;

import java.util.ArrayList;
import java.util.List;

public class AtendenteEntity {

    public AtendenteEntity() {
        this.vendas = new ArrayList<VendaEntity>();
        this.lugaresAssentos = new ArrayList<LugarDisponivelEntity>();
    }

    public List<LugarDisponivelEntity> lugaresAssentos;
    public List<VendaEntity> vendas;

    public List<VendaEntity> getVendas() {
        return vendas;
    }

    public void setVendas(List<VendaEntity> vendas) {
        this.vendas = vendas;
    }

    public List<LugarDisponivelEntity> getLugaresAssentos() {
        return lugaresAssentos;
    }

    public void setLugaresAssentos(List<LugarDisponivelEntity> lugaresAssentos) {
        this.lugaresAssentos = lugaresAssentos;
    }

    public List<VendaEntity> getVenda() {
        return vendas;
    }

    public void setVenda(List<VendaEntity> venda) {
        this.vendas = venda;
    }
}
