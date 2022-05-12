/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Maíra
 */
public class Veterinario extends Funcionario{
    private String crmv;

    public Veterinario() 
    {
        super();
    }

    public Veterinario(String crmv) {
        this.crmv = crmv;
    }

    public Veterinario(String crmv, String cpf, String rg, String nome, String cargo, String permissao, String nomeUsuario, String senha, sql.java.Date dtNascimento, Date dtAdmissao, Date dtDemissao, int codFuncionario, String endereco, String complemento, String telefone) 
    {
        super(cpf, rg, nome, cargo, permissao, nomeUsuario, senha, dtNascimento, dtAdmissao, dtDemissao, codFuncionario, endereco, complemento, telefone);
        this.crmv = crmv;
    }
    
    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
}