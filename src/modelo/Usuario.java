package modelo;

/**
 *
 * @author Maíra & Rafael
 */
public class Usuario {
    	private String senha;	 
	private String permissao;	 
	private Funcionario funcionario;

    public Usuario(String senha, String permissao, Funcionario funcionario) {
        this.senha = senha;
        this.permissao = permissao;
        this.funcionario = funcionario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}