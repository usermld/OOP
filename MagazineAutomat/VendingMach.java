import java.util.List;

public interface VendingMach {
    

    void initProducts (List <Product> productList);
    
    Product getProduct(String name);
    Product getProduct(String name, double volume);
    Product getProduct(String name, double volume, int temperature);
        
}
