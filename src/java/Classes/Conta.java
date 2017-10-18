package Classes;

public class Conta {

    private int id_conta;
    private Pedido id_pedido;
    private Div_Conta id_div_conta;
    private float soma_parc;
    private float valor_total;

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public Pedido getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Pedido id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Div_Conta getId_div_conta() {
        return id_div_conta;
    }

    public void setId_div_conta(Div_Conta id_div_conta) {
        this.id_div_conta = id_div_conta;
    }

    public float getSoma_parc() {
        return soma_parc;
    }

    public void setSoma_parc(float soma_parc) {
        this.soma_parc = soma_parc;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }
    
}
