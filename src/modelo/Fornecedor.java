/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.enums.TipoPessoa;

/**
 *
 * @author Maíra
 */
public class Fornecedor extends Pessoa{
    
    private TipoPessoa tipoPessoa;
    private String cnpj;
    private String nome;

    public Fornecedor() {
    }

    public Fornecedor(TipoPessoa tipoPessoa, String cnpj, String nome, String endereco, String complemento, String telefone, String email) {
        super(endereco, complemento, telefone, email);
        this.tipoPessoa = tipoPessoa;
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}