import java.util.List;

public class VendingMachineHotDrink implements VendingMach{

    private List<Product> productList;


    // public Product geProduct (String name, double volume, int temperature) {
    //     for (Product product : productList) {
    //         if (product.getName().equals(name) && ((BottelWater) product).getVolume() == volume && ((HoteDrink) product).getTemperature() == temperature) {
    //             return product;
    //         }
    //     }
    //     return null;
    // }


    @Override
    public void initProducts(List<Product> productList) {
        this.productList = productList;
    }


    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }


    @Override
    public Product getProduct(String name, double volume) {
        for (Product product : productList) {
            if(product.getName().equals(name) && ((BottelWater) product).getVolume() == volume){
                return product;
            }
        }
        return null;
    }


    @Override
    public Product getProduct(String name, double volume, int temperature) {
        for (Product product : productList) {
            if (product.getName().equals(name) && ((BottelWater) product).getVolume() == volume && ((HoteDrink) product).getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
    
}
