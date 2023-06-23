package model;

import controller.ProdutoController;
import java.util.ArrayList;

public class ProdutoControllerImpl implements ProdutoController {

    @Override
    public void cadastrarProduto(Produto produto, ArrayList<Produto> produtos) {
        if (buscarProdutoPorID(produto.getId(), produtos) == null) {
            produtos.add(produto);
        }
    }

    @Override
    public void alterarProduto(int index, ArrayList<Produto> produtos) {
        produtos.set(index, produtos.get(index));
    }

    @Override
    public void removerProduto(int index, ArrayList<Produto> produtos) {
        produtos.remove(index);
    }

    @Override
    public Produto buscarProdutoPorID(int id, ArrayList<Produto> produtos) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == id) {
                return produtos.get(i);
            }
        }
        return null;
    }
    
    @Override
    public ArrayList<Produto> filtrarProdutosPorDescricao(String nome, ArrayList<Produto> produtos) {
        ArrayList<Produto> encontrados = new ArrayList<>();
        produtos.stream().filter((p) -> (p.getDescricao().contains(nome))).forEachOrdered((p) -> {
            encontrados.add(p);
        });
        return encontrados;
    }

    @Override
    public ArrayList<Produto> filtrarProdutosPorValorUnitarioMenorIgual(double valorUnitario, ArrayList<Produto> produtos) {
        ArrayList<Produto> encontrados = new ArrayList<>();
        produtos.stream().filter((p) -> (p.getValor_unitario() <= valorUnitario)).forEachOrdered((p) -> {
            encontrados.add(p);
        });
        return encontrados;
    }

    @Override
    public ArrayList<Produto> filtrarProdutosPorValorUnitarioMaiorIgual(double valorUnitario, ArrayList<Produto> produtos) {
        ArrayList<Produto> encontrados = new ArrayList<>();
        produtos.stream().filter((p) -> (p.getValor_unitario() >= valorUnitario)).forEachOrdered((p) -> {
            encontrados.add(p);
        });
        return encontrados;
    }
    
    
}
