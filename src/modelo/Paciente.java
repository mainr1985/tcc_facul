
package modelo;

import java.util.Date;

/**
 *
 * @author Maíra
 */
public class Paciente {
    private String nome, raca;
    private Date nascimento;
    private int idade;
    
    public void setNome (String nome)
    {
        this.nome = nome;
    }
    
    public String getNome ()
    {
        return this.nome;
    }
    
    public void setRaca(String raca)
    {
        this.raca = raca;
    }
    
    public String getRaca()
    {
        return this.raca;
    }
    
    public void setNascimento(Date nascimento)
    {
        this.nascimento = nascimento;
    }
    
    public Date getNascimento()
    {
        return this.nascimento;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
}
