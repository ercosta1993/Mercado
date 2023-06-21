package model;

public class Produto {

    private int id;
    private String descricao;
    private int quantidade;
    private double valor_unitario;

    public Produto(int id, String descricao, int quantidade, double valor_unitario) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor_unitario = valor_unitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", quantidade=" + quantidade + ", valor_unitario=" + valor_unitario + '}';
    }
}
