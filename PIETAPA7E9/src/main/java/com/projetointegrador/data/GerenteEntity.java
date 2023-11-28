package com.projetointegrador.data;



import java.util.List;
import java.util.ArrayList;


public class GerenteEntity {

    public GerenteEntity() {
        this.listadeclientes = new ArrayList<ClienteEntity>();
        this.vendas = new ArrayList<VendaEntity>();
    }

    public List<ClienteEntity> listadeclientes;
    public List<VendaEntity> vendas;

    public List<ClienteEntity> getListadeclientes() {
        return listadeclientes;
    }

    public void setListadeclientes(List<ClienteEntity> listadeclientes) {
        this.listadeclientes = listadeclientes;
    }

    public List<VendaEntity> getListavendas() {
        return vendas;
    }

    public void setListavendas(List<VendaEntity> listavendas) {
        this.vendas = listavendas;
    }

}
