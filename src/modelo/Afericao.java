package modelo;

/**
 *
 * @author Maíra
 */
public class Afericao {
    private Integer codigo;
    private Double tempMin, tempMax, tempMomento;
    private Veterinario responsavel;
    
    public Afericao(Integer codigo, Double tempMin, Double tempMax, Double tempMomento, Veterinario responsavel) {
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

    public Veterinario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Veterinario responsavel) {
        this.responsavel = responsavel;
    }
    
    public void cadastrarMedicao(Afericao temperatura){
        
    }    
}