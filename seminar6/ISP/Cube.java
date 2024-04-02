package seminar6.ISP;

public class Cube implements Shape, Shape3D{
    private int len;

    public Cube(int len){
        this.len = len;
    }
    
    @Override
    public double perimetr() {
        return len * 6;
    }

    @Override
    public double volume() {
        return len * len * len;
    }
    
}
