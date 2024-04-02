package seminar6.ISP;

public class Circle implements Shape{
    private int radius;

    public Circle (int radius){
        this.radius = radius;
    }
    
    @Override
    public double perimetr(){
        return 2 * 3.14 * radius;
    }
}
