package modelo;

public class Produto {

    private int id_produto;
    private Funcionario matricula;
    private String nome;
    private String descricao;
    private float valor;
    private String categoria;

    public int getId_cardapio() {
        return id_produto;
    }

    public void setId_cardapio(int id_produto) {
        this.id_produto = id_produto;
    }

    public Funcionario getMatricula() {
        return matricula;
    }

    public void setMatricula(Funcionario matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
