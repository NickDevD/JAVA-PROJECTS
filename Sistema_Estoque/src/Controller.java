import java.util.ArrayList;
import java.util.List;

public class Controller {

    List<Product> products;

    Controller(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
        System.out.println(STR."Produto \{product.getName()} adicionado");
    }

    public void removeProducts(Product product) {
        products.remove(product.getId());
        System.out.println(STR."Produto \{product.getName()} removido");
    }

    public void listarProdutos(){
        for (Product list : products){
            System.out.println(list.getName());
        }
    }
}
