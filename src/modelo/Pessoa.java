package modelo;

/**
 *
 * @author Maíra
 */
public class Pessoa {

    private String endereco, complemento, telefone;

    public Pessoa() {
        super();
    }

    public Pessoa(String endereco, String complemento, String telefone) {
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
}   