package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import modelo.Usuario;

//import dao.DaoConsultaUsuario;
//import modelo.Paciente;
import modelo.Veterinario;
import visao.*;

public class ControleLogin /*implements ActionListener */{
	
	TelaLogin login = new TelaLogin();
	//private DaoConsultaUsuario daoUsuario;

    public ControleLogin() {
    }
    
    
        /*public ControleLogin(TelaLogin telaLogon) throws SQLException, ClassNotFoundException
	{
		super();
		this.telaLogon = telaLogon;
		//this.daoUsuario = new DaoConsultaUsuario();
				
		telaLogon.setOuvinte(this);
	}*/

	/*public void actionPerformed(ActionEvent e) {
		
		String comando = e.getActionCommand();
		
		if(comando.equals("Logar"))
			try {
				logon();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}
			else
				if(comando.equals("Cancelar"))
					telaLogon.limpar();
										
	}
	
	public void logon() throws SQLException, ClassNotFoundException
	{
		Dentista permissao = telaLogon.lerLogin();
		Dentista usuario ;
		boolean achou = false;
		TelaPrincipal telaPrincipal;
		
		if(permissao != null)
		{
			achou = daoUsuario.consultarLogin(permissao);
			
				if(achou == true)
				{
					usuario = daoUsuario.retornaPermissao(permissao);

					if(usuario.getPermissao().equals("Administrador"))
					{
						telaPrincipal = new TelaPrincipal();					
						//centraliza a janela
						telaPrincipal.setLocationRelativeTo(null);
						//exibe a janela
						telaPrincipal.setVisible(true);
						telaPrincipal.exibeNomeUsuario(usuario);
					}
					else
						if(usuario.getPermissao().equals("Secretaria"))
						{
							telaPrincipal = new TelaPrincipal();					
							//centraliza a janela
							telaPrincipal.setLocationRelativeTo(null);
							//exibe a janela
							telaPrincipal.setVisible(true);
							telaPrincipal.exibeNomeUsuario(usuario);
							telaPrincipal.modoSecretaria();
						}
						
					telaLogon.fecharJanela();
				}
		
		}*/

   /* @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }*/
    public boolean cadastrarUsuario (String usuario, char[] senha){
        //validacao para ver se os campos foram preenchidos no formulario
        
        if ((login.getTxtUsuario()!=null) && (login.getTxtSenha()!=null)){
            Usuario user = new Usuario(usuario, senha);
            user.cadastrarUsuario(user);
            return true;
        }
        
        else
            return false;
    }
                
}
	
	
	
	



