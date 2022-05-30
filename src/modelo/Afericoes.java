package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maíra
 */
public class Afericoes {
    private int codigo;
    private double tempMin, tempMax, tempMomento;
    private String responsavel;
    
    public Afericoes(int codigo, double tempMin, double tempMax, double tempMomento, String responsavel) {
        this.codigo = codigo;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.tempMomento = tempMomento;
        this.responsavel = responsavel;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public double getTempMomento() {
        return tempMomento;
    }

    public void setTempMomento(double tempMomento) {
        this.tempMomento = tempMomento;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    public void cadastrarMedicao(Afericoes temperatura){
        
    }
    
}
