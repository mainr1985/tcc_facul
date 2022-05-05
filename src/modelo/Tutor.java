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
    private int codTutor;
    
    public Tutor(){
        this.nome = "";
        this.cpf = "";
        this.telCel = "";
        this.telResidencia = "";
        
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

    public int getCodTutor() {
        return codTutor;
    }

    public void setCodTutor(int codTutor) {
        this.codTutor = codTutor;
    }
    
    
}
