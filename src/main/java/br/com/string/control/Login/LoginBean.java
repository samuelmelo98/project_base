package br.com.string.control.Login;

import br.com.string.model.Pessoa;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named("login")
//@ApplicationScoped
@ViewScoped
/**
 * O Escopo é necessário! sem ele a view faz a requição e ao carregar a página novamente os atributos ficam nulos.
 */
public class LoginBean implements Serializable {

    @Inject
    private Pessoa pessoa;
    private Boolean controle = false;


 public LoginBean(){

 }

    public Boolean getControle() {
        return controle;
    }

    public void setControle(Boolean controle) {
        this.controle = controle;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void verificaCadastro(){
        System.out.println(pessoa.getNome() + "\n" + pessoa.getSenha());
        try{
                if(pessoa.getNome().equals("samuel") && pessoa.getSenha().equals("samuel")){
                    System.out.println("true");
                } else{
                    System.out.println("not");
                    this.controle= true;
                }

        } catch (RuntimeException e ){
            e.printStackTrace();
        }

    }
}
