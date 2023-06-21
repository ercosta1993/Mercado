package model;

import controller.ProdutoController;
import java.util.ArrayList;

public class ProdutoControllerImpl implements ProdutoController {

    @Override
    public Produto buscaProdutoPorID(int id, ArrayList<Produto> produtos) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == id) {
                return produtos.get(i);
            }
        }
        return null;
    }

    @Override
    public void cadastrarProduto(Produto produto, ArrayList<Produto> produtos) {
        if (buscaProdutoPorID(produto.getId(), produtos) == null) {
            produtos.add(produto);
        }
    }

    @Override
    public void alterarProduto(Produto produto, ArrayList<Produto> produtos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerProduto(Produto produto, ArrayList<Produto> produtos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String exibirProduto(Produto produto, ArrayList<Produto> produtos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
