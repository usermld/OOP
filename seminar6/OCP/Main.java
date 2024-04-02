package seminar6.OCP;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(100);
        Car car = new Car(100);
        Vehicle ship = new Vehicle(100, "Ship");
        print(bus);
        print(car);
        print(ship);
    }
    
    public static void print(Vehicle vehicle){
        System.out.println(vehicle);
    }
}
