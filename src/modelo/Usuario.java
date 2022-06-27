package modelo;

/**
 *
 * @author Maíra & Rafael
 */
public class Usuario {
        private String usuario;
    	private String senha;	 
	private String permissao;	 
	private Funcionario funcionario;

    public Usuario() {
    }
        
    public Usuario(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    
   /* public Usuario(String usuario, String senha, String permissao, Funcionario funcionario) {
        this.usuario = usuario;
        this.senha = senha;
        this.permissao = permissao;
        this.funcionario = funcionario;
    }*/

    public Usuario(String usuario, char[] senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void cadastrarUsuario(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}