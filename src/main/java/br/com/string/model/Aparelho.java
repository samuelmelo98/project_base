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


}
