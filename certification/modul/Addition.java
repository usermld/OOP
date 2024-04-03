package certification.modul;

public class Addition extends Maths{

    public Addition(float a, float b){
        this.a = a;
        this.b = b;
        result = a + b;
    }
    
    @Override
    public String toString() {
        return "add: " + result;
    }
}
