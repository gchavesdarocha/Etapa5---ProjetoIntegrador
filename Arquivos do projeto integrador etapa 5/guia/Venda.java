package guia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.time.LocalDateTime;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="Valor_total")
    private double valorTotal;
    @Column(name="tipo_venda")
    private char tipoCombo;
    @Column(name="data_venda")
    private LocalDateTime dataVenda;
    @Transient
    private double valorComboG = 30;

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }
    @Transient
    private double valorComboM = 15;
    @Transient
    private double valorComboP = 10;
    @Transient
    private double valorBilhete = 15;
    @Transient
    private int qntdBilhete;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
       

        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQntdBilhete() {
        return qntdBilhete;
    }

    public void setQntdBilhete(int qntdBilhete) {
        this.qntdBilhete = qntdBilhete;
         valorTotal += qntdBilhete * valorBilhete;
    }

    public char getTipoCombo() {
        return tipoCombo;
    }

    public void setTipoCombo(char tipoCombo) {
        this.tipoCombo = tipoCombo;
         if (tipoCombo == 'P') {
            valorTotal += valorComboP;
        } else if (tipoCombo == 'M') {
            valorTotal += valorComboM;
        } else if (tipoCombo == 'G') {
            valorTotal += valorComboG;
        }

       
    }

}
