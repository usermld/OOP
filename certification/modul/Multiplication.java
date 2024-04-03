package certification.modul;

public class Multiplication extends Maths{

    public Multiplication(float a, float b){
        this.a = a;
        this.b = b;
        result = a * b;
    }
    // @Override
    // public float mathDo(float a, float b) {
    //     result = a * b;
    //     return result;
    // }
    @Override
    public String toString() {
        return "mult: " + result;
    }
    

}
