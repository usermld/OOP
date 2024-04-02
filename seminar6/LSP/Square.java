package seminar6.LSP;

public class Square extends QuadRangele{
    private int len;

    public Square(int len){
        this.len = len;
    }
    
    @Override
    double area() {
        return len * len;
    }
}
