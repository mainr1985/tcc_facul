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
public class Prontuario {

    private Consulta consulta;
    private Tratamento tratamento;
    private Paciente paciente;
    private Veterinario veterinario;
    private Exame exame;
    private String obs;
    

    public Prontuario() {
    }

    public Prontuario(Consulta consulta, Tratamento tratamento, Paciente paciente, Veterinario veterinario, String obs) {
        this.consulta = consulta;
        this.tratamento = tratamento;
        this.paciente = paciente;
        this.veterinario = veterinario;
        this.obs = obs;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }    
}