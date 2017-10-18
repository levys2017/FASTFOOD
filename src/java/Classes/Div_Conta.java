package Classes;
public class Div_Conta {

    private int id_div_conta;
    private Pedido id_pedido;
    private char cpf;
    private float valor_total;

    public int getId_div_conta() {
        return id_div_conta;
    }

    public void setId_div_conta(int id_div_conta) {
        this.id_div_conta = id_div_conta;
    }

    public Pedido getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Pedido id_pedido) {
        this.id_pedido = id_pedido;
    }

    public char getCpf() {
        return cpf;
    }

    public void setCpf(char cpf) {
        this.cpf = cpf;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    
    
}
