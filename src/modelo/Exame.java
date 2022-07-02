/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Maíra
 */
public class Exame {
    
    private Integer codigo;
    private String nome;
    private String indicacao; //porque foi solicitado o exame
    private Veterinario veterinario; //quem solicitou o exame - REVER DECLARAÇÃO

    public Exame() {
    }

    public Exame(Integer codigo, String nome, String indicacao, Veterinario veterinario) {
        this.codigo = codigo;
        this.nome = nome;
        this.indicacao = indicacao;
        this.veterinario = veterinario;
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

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }   
}