package controller;

import java.util.ArrayList;
import model.Produto;

public interface ProdutoController {
    public Produto buscaProdutoPorID(int id, ArrayList<Produto> produtos);
    public void cadastrarProduto(Produto produto, ArrayList<Produto> produtos);
    public void alterarProduto(Produto produto, ArrayList<Produto> produtos);
    public void removerProduto(Produto produto, ArrayList<Produto> produtos);
    public String exibirProduto(Produto produto, ArrayList<Produto> produtos);
}
