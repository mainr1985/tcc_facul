/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import modelo.enums.TipoProduto;

/**
 *
 * @author Maíra
 */
public class Vacina extends Produto {
    
    private String nome;
    private String racaDestino;
    private String periodicidade;
    private Integer qtdDoses;
    private Date validade;
    private Integer temperatura;
    private String lote;
    private String indicacao;

    public Vacina() {
    }

    public Vacina(Integer codigo, String nome, String descricao, TipoProduto categoria) {
        super(codigo, nome, descricao, categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRacaDestino() {
        return racaDestino;
    }

    public void setRacaDestino(String racaDestino) {
        this.racaDestino = racaDestino;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public Integer getQtdDoses() {
        return qtdDoses;
    }

    public void setQtdDoses(Integer qtdDoses) {
        this.qtdDoses = qtdDoses;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }
    
    //método que avisa vacinas com vencimento próximo
    public void avisaValidade(){
        
    }
    
    //método que avisa quando o paciente deve voltar para a próxima dose
    public void proximaDose(){
        
    }
    
    
    
}
