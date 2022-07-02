package modelo;

import java.util.Date;

/**
 *
 * @author Maíra & Rafael
 */
public abstract class Funcionario extends Pessoa{
    private String cpf, rg, nome, cargo, permissao, nomeUsuario;
    private char[] senha;
    private Date dtNascimento, dtAdmissao, dtDemissao;
    private Integer codFuncionario;
    
    
    //construtor vazio
    public Funcionario ()
    {            
    }

    public Funcionario(String cpf, String rg, String nome, String cargo, String permissao, 
                       String nomeUsuario, char[] senha, Date dtNascimento, Date dtAdmissao, Date dtDemissao, 
                       Integer codFuncionario, String endereco, String complemento, String telefone, String email) 
    {
        super(endereco, complemento, telefone, email);
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.cargo = cargo;
        this.permissao = permissao;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.dtNascimento = dtNascimento;
        this.dtAdmissao = dtAdmissao;
        this.dtDemissao = dtDemissao;
        this.codFuncionario = codFuncionario;        
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public Date getDtDemissao() {
        return dtDemissao;
    }

    public void setDtDemissao(Date dtDemissao) {
        this.dtDemissao = dtDemissao;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    
    public void validaUsuario(){
        
    }
    
    public void cadastrarUsuario(){
        
    }
}