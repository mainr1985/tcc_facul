package modelo;

import java.sql.Date;

/**
 *
 * @author Maíra & Rafael
 */
public abstract class Funcionario extends Pessoa{
    private String cpf, rg, nome, cargo, permissao, nomeUsuario, senha;
    private java.sql.Date dtNascimento, dtAdmissao, dtDemissao;
    private int codFuncionario;
    
    public Funcionario ()
    {
        super();        
    }

    public Funcionario(String cpf, String rg, String nome, String cargo, String permissao, String nomeUsuario, String senha, Date dtNascimento, Date dtAdmissao, Date dtDemissao, int codFuncionario, String endereco, String complemento, String telefone) {
        super(endereco, complemento, telefone);
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public java.sql.Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(java.sql.Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public java.sql.Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(java.sql.Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public java.sql.Date getDtDemissao() {
        return dtDemissao;
    }

    public void setDtDemissao(java.sql.Date dtDemissao) {
        this.dtDemissao = dtDemissao;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
}