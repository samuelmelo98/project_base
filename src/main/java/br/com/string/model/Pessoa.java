package br.com.string.model;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = Pessoa.TABELANOME)
public class Pessoa implements java.io.Serializable {
    public static final String TABELANOME = "tb_pessoa";
    private Long idPessoa = -1L;
    private String nome = "";
    private String cpf = "";
    private String rg = "";
    private Date  dataNascimento = null;
    private String senha = "";
    private Sexo sexo;

    public Pessoa(){

    }



    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
