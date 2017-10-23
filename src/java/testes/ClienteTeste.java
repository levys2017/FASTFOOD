/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import dao.ClienteDAO;
import modelo.Cliente;
import org.kohsuke.rngom.digested.Main;

/**
 *
 * @author Levy Martins
 */
public class ClienteTeste {
    
    
    
      public static void main(String[] args) {
          
      
    Cliente c = new Cliente();
    
    
    ClienteDAO dao = new  ClienteDAO();
    
    
    c.setNome("Levy");
    

        if(new ClienteDAO().save(c)){
            System.out.println("cliente salvo com sucesso");
        }else{
      System.out.println("deu merda");
      }


      }
    
    
    
    
    
}
