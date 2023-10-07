
package guia;

/**
 *
 * @author Gabriel
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atendente {

    public Atendente() {
        this.vendas = new ArrayList<Venda>();
        this.lugaresAssentos = new ArrayList<LugaresDisponiveis>();

    }

    public List<LugaresDisponiveis> lugaresAssentos;
    public List<Venda> vendas;

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
    

    public List<LugaresDisponiveis> getLugaresAssentos() {
        return lugaresAssentos;
    }

    public void setLugaresAssentos(List<LugaresDisponiveis> lugaresAssentos) {
        this.lugaresAssentos = lugaresAssentos;
    }

    public List<Venda> getVenda() {
        return vendas;
    }

    public void setVenda(List<Venda> venda) {
        this.vendas = venda;
    }
}
