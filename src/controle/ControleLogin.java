/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Usuario;
import modelo.Veterinario;
import visao.TelaLogin;


/**
 *
 * @author Maíra
 */
public class ControleLogin {
    TelaLogin login = new TelaLogin();
    
    public boolean cadastrarLogin(String nomeUsuario, char[] senha){
        if ((login.getTxtUsuario()!=null) && (login.getTxtSenha()!=null)){
            Usuario usuario = new Usuario(nomeUsuario, nomeUsuario, funcionario);
            
        }
    }
    
}


public class ControlerAfericoes {
    Menu temperatura = new Menu();
    
    public boolean cadastrarMedicao (int codigo, double tempMin, double tempMax, String responsavel, ){
        //validacao para ver se os campos foram preenchidos no formulario
        
        if ((temperatura.getTxtTempMin()!=null) && (temperatura.getTxtTempMax()!=null) 
             && (temperatura.getTxtTempMomento()!=null) && (temperatura.getTxtResp()!= null)){
            Afericoes t = new Afericoes(codigo, tempMin, tempMax, tempMomento, responsavel);
            t.cadastrarMedicao(t);
            return true;
        }
        
        else
            return false;
    }
}           
                
        
        
            
        
        
        
    


