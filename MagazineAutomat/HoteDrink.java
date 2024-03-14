public class HoteDrink extends BottelWater{
    
    private int temperature;

    public HoteDrink(String name, double cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Product: " + super.getName() + ", " +
                "cost: " + super.getCost() + ", " + 
                "volume: " + super.getVolume() + ", " + 
                "temperature: " + temperature;
    }
}