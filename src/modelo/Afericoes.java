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
    private Integer codigo;
    private Double tempMin, tempMax, tempMomento;
    private String responsavel;
    
    public Afericoes(Integer codigo, Double tempMin, Double tempMax, Double tempMomento, String responsavel) {
        this.codigo = codigo;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.tempMomento = tempMomento;
        this.responsavel = responsavel;
    }

    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Double getTempMomento() {
        return tempMomento;
    }

    public void setTempMomento(Double tempMomento) {
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
