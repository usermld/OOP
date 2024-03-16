import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new BottelWater("1", 1 ,1);
        Product product2 = new BottelWater("2", 2 ,2);
        Product product3 = new BottelWater("3", 3 ,3);
        Product product4 = new BottelWater("4", 4 ,4);
        Product product5 = new BottelWater("5", 5 ,5);
        
        Product product6 = new HoteDrink("6", 6 ,6, 60);
        Product product7 = new HoteDrink("7", 7 ,7, 70);
        Product product8 = new HoteDrink("8", 8 ,8, 80);

        List<Product> productList = new ArrayList<>();

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        productList.add(product6);
        productList.add(product7);
        productList.add(product8);

        VendingMach venMachBottle = new VendingMachineBottelOfWater();
        VendingMach venMachHotDrink = new VendingMachineHotDrink();

        venMachBottle.initProducts(productList);
        System.out.println(venMachBottle.getProduct("6", 6));

        venMachHotDrink.initProducts(productList);
        System.out.println(venMachHotDrink.getProduct("8",8, 80));
    }
}