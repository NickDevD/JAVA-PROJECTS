import java.util.ArrayList;
import java.util.List;


public class Controller {

    List<Product> products;

    Controller(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
       if (product != null){
           products.add(product);
           System.out.println("Produto adicionado " + product.getName());
       }else {
           System.out.println("É necessário inserir um produto");
       }
    }

    public void removeProducts(int productID) {
        Product productToRemove = null;
        for (Product p : products){
            if(p.getId() == productID){
                productToRemove = p;
                break;
            }
            products.remove(productToRemove);
            System.out.println("Produto removido" + productToRemove.getName());

        }

    }

    public void listarProdutos(){
        for (Product list : products){
            System.out.println(list.getName());
        }
    }
}
