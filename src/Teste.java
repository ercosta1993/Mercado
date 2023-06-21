
import java.util.ArrayList;
import model.Produto;
import model.ProdutoControllerImpl;


public class Teste {

    public static void main(String[] args) {
        Produto p1 = new Produto(001, "arroz", 6, 2.99);
        Produto p2 = new Produto(002, "feijao", 10, 7.80);
        Produto p3 = new Produto(003, "massa", 15, 4.69);
        Produto p4 = new Produto(004, "mouse", 7, 39.90);
        Produto p5 = new Produto(005, "ovo", 21, 0.79);
        
        ArrayList<Produto> sacola = new ArrayList<>();
        
        ProdutoControllerImpl venda = new ProdutoControllerImpl();
        
        venda.cadastrarProduto(p1, sacola);
        venda.cadastrarProduto(p2, sacola);
        venda.cadastrarProduto(p3, sacola);
        venda.cadastrarProduto(p4, sacola);
        venda.cadastrarProduto(p5, sacola);
        
        System.out.println(sacola);
        
        System.out.println("Busquei o produto 3 = " + venda.buscaProdutoPorID(3, sacola));
        
        System.out.println("Busquei o preço unitario do produto 5 = " + venda.buscaProdutoPorID(5, sacola).getValor_unitario());
    }
}
