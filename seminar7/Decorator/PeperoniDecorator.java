package seminar7.Decorator;

public class PeperoniDecorator extends PizzaDecorator{

    public PeperoniDecorator(Pizza pizza) {
        super(pizza);
        
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", пеперони";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 35;
    }
    
}
