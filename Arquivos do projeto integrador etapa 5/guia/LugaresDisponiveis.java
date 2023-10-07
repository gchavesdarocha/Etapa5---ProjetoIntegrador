package guia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import java.time.LocalDateTime;

/**
 *
 * @author Gabriel
 */
@Entity(name = "lugaresDisponiveis")
public class LugaresDisponiveis {

    @Id
    int id;
    @Column(name = "cadeira")
    String lugaresDisponiveis;
    @Column(name = "sessao")
    String sessao;
    @Transient
    String sessao1, sessao2, sessao3;
    @Column(name="data_lugaresDisponivies")
    LocalDateTime data;

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getSessao() {

        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }

    public void setLugaresDisponiveis(String lugaresDisponiveis) {
        this.lugaresDisponiveis = lugaresDisponiveis;
    }
}
