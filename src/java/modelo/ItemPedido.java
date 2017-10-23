package modelo;

import java.io.Serializable;
import java.util.Date;

public class ItemPedido implements Serializable{
    
    
    private int id;
    private Pedido id_pedido;
    private Produto nome;
    private int Qtd;
    private String tipo;
    private Double sub_total;
    private Date data;
    private String hora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pedido getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Pedido id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Produto getNome() {
        return nome;
    }

    public void setNome(Produto nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int Qtd) {
        this.Qtd = Qtd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getSub_total() {
        return sub_total;
    }

    public void setSub_total(Double sub_total) {
        this.sub_total = sub_total;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    
   
}
