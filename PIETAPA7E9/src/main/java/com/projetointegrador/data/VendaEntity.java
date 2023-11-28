package com.projetointegrador.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "venda")
public class VendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tipo_venda")
    private char tipoCombo;
    @Column(name = "valor_total")
    private double valorTotal;
    @Column(name = "data_venda")
    private LocalDateTime dataVenda;
    @Transient
    private double valorComboG = 30;
    @Transient
    private double valorComboM = 15;
    @Transient
    private double valorComboP = 10;
    @Transient
    private double valorBilhete = 15;
    @Transient
    private int qntdBilhete;

    public void setValorTotal()
    {
        if (tipoCombo == 'P') {
            valorTotal = qntdBilhete * valorComboP;
        }
        else if (tipoCombo == 'M') {
            valorTotal = qntdBilhete * valorComboM;
        }
        else 
        if (tipoCombo == 'G') {
            valorTotal = qntdBilhete * valorComboG;
        }
    }

      public void setValorTotalSomenteBilhete()
    {
       valorTotal = qntdBilhete * 15;
    }
}
