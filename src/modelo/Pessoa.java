package modelo;

import modelo.enums.TipoPessoa;

/**
 *
 * @author Maíra
 */
public class Pessoa {

    private String endereco;
    private String complemento; 
    private String telefone;
    private String email;
    private TipoPessoa tipoPessoa;

    public Pessoa() {
    }

    public Pessoa(String endereco, String complemento, String telefone, String email) {
        super();
        this.endereco = endereco;
        this.complemento = complemento;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }    
}   