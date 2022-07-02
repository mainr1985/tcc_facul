/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.enums.TipoProduto;

/**
 *
 * @author Maíra
 */
class Produto {
    
    private Integer codigo;
    private String nome;
    private String descricao;
    private TipoProduto categoria;

    public Produto() {
    }    
    
    public Produto(Integer codigo, String nome, String descricao, TipoProduto categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoProduto categoria) {
        this.categoria = categoria;
    }    
}