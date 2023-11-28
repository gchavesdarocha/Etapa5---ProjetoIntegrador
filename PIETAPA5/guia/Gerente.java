package guia;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Gerente {

    public Gerente() {
        this.listadeclientes = new ArrayList<Clientes>();
        this.vendas = new ArrayList<Venda>();
    }

    public List<Clientes> listadeclientes;
    public List<Venda> vendas;

    public List<Clientes> getListadeclientes() {
        return listadeclientes;
    }

    public void setListadeclientes(List<Clientes> listadeclientes) {
        this.listadeclientes = listadeclientes;
    }

    public List<Venda> getListavendas() {
        return vendas;
    }

    public void setListavendas(List<Venda> listavendas) {
        this.vendas = listavendas;
    }

}
