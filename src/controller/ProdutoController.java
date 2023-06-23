package controller;

import java.util.ArrayList;
import model.Produto;

public interface ProdutoController {
    public void cadastrarProduto(Produto produto, ArrayList<Produto> produtos);
    public void alterarProduto(int index, ArrayList<Produto> produtos);
    public void removerProduto(int index, ArrayList<Produto> produtos);
    public Produto buscarProdutoPorID(int id, ArrayList<Produto> produtos);
    public ArrayList<Produto> filtrarProdutosPorDescricao(String nome, ArrayList<Produto> produtos);
    public ArrayList<Produto> filtrarProdutosPorValorUnitarioMenorIgual(double valorUnitario, ArrayList<Produto> produtos);
    public ArrayList<Produto> filtrarProdutosPorValorUnitarioMaiorIgual(double valorUnitario, ArrayList<Produto> produtos);
}
