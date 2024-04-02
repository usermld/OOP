package seminar6.SRP;

public class EmployerSelaryCalculate {
    private int baseSelary;

    public EmployerSelaryCalculate (int baseSelary){
        this.baseSelary = baseSelary;
    }
    
    public double calculateSelary(){
        return baseSelary * 1.5;
    }
}
