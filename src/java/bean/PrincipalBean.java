package bean;

import modelo.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "principalBean")
@ViewScoped
public class PrincipalBean implements Serializable{
    
    private Cliente clienteSelected = new Cliente();    
    private List<Cliente> cliente = new ArrayList<Cliente>();
    
    
    public void add(){
        
        cliente.add(clienteSelected);    
        clienteSelected = new Cliente();
   
    }
   
       public void limpaTabela(){
           cliente=new ArrayList<Cliente>();
       }
       
    public Cliente getClienteSelected() {
        return clienteSelected;
    }

    public void setClienteSelected(Cliente clienteSelected) {
        this.clienteSelected = clienteSelected;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }
    
    
    
    
    
    
    
    
    
    
}
