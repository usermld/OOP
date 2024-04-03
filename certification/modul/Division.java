package certification.modul;

public class Division extends Maths{

    public Division(float a, float b){
        this.a = a;
        this.b = b;
        result = a / b;
    }

    @Override
    public String toString() {
        return "div: " + result;
    }
}
