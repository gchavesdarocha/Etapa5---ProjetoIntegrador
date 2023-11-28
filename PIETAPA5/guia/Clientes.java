package guia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome")
    private String nomeClientes;
    @Column(name = "cpf")
    private String cpfClientes;
    @Column(name = "idade")
    private int idadeClientes;
    @Column(name = "datacadastro")
    private LocalDateTime dataCadastroCliente;

    public Clientes() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataCadastroCliente() {
        return dataCadastroCliente;
    }

    public void setDataCadastroCliente(LocalDateTime dataCadastroCliente) {
        this.dataCadastroCliente = dataCadastroCliente;
    }

    public String getNomeClientes() {
        return nomeClientes;
    }

    public void setNomeClientes(String nomeClientes) {
        this.nomeClientes = nomeClientes;
    }

    public String getCpfClientes() {
        return cpfClientes;
    }

    public void setCpfClientes(String cpfClientes) {
        this.cpfClientes = cpfClientes;
    }

    public int getIdadeClientes() {
        return idadeClientes;
    }

    public void setIdadeClientes(int idadeClientes) {
        this.idadeClientes = idadeClientes;
    }
}
