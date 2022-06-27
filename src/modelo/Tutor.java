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
public class Tutor extends Pessoa
{
    private String nome, cpf, telCel, telResidencia;
    private Integer codTutor;
    
    public Tutor(){
        
    }

    public Tutor(String nome, String cpf, String telCel, String telResidencia, Integer codTutor, String endereco, String complemento, String telefone) {
        super(endereco, complemento, telefone);
        this.nome = nome;
        this.cpf = cpf;
        this.telCel = telCel;
        this.telResidencia = telResidencia;
        this.codTutor = codTutor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelCel() {
        return telCel;
    }

    public void setTelCel(String telCel) {
        this.telCel = telCel;
    }

    public String getTelResidencia() {
        return telResidencia;
    }

    public void setTelResidencia(String telResidencia) {
        this.telResidencia = telResidencia;
    }

    public Integer getCodTutor() {
        return codTutor;
    }

    public void setCodTutor(Integer codTutor) {
        this.codTutor = codTutor;
    }   
}