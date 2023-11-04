package br.com.string.model;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Aparelho.TABELANOME)
public class Aparelho implements java.io.Serializable {
    public static final String TABELANOME = "tb_aparelho";

    private Long idAparelho = -1L;
    private String marca ="";
    private String modelo = "";
    private String numeroSerie = "";
    private String imei = "";
    @Inject
    private Cliente cliente;

    public Long getIdAparelho() {
        return idAparelho;
    }

    public void setIdAparelho(Long idAparelho) {
        this.idAparelho = idAparelho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
