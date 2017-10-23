package modelo;

import java.util.Objects;

public class Pedido {
    
    private int id_pedido;
    private Cliente id_cliente;
    private int senha;
    private double valor_total;
    private String forma_pagamento;
    private int status;
    private double valor_pago;

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }
   
    

}
