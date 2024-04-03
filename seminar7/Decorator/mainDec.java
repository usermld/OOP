package seminar7.Decorator;

public class mainDec {
    public static void main(String[] args) {
        Pizza pizza = new CheeseDecorator(new PeperoniDecorator(new CheeseDecorator(new PizzaDough())));
        printPizza(pizza);
    }
    
    public static void printPizza(Pizza pizza){
        System.out.println(pizza.getDescription() + " " + pizza.getCost());
    }
}
