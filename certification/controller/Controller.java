package certification.controller;

import certification.modul.Addition;
import certification.modul.Division;
import certification.modul.Multiplication;
import certification.view.AdditionView;
import certification.view.DivisionView;
import certification.view.MultiplicationView;

public class Controller {
    
    public void doAddation(float a, float b){
        Addition add = new Addition(a, b);
        AdditionView.print(add);
        
        
    }
    
    public void doMultiplication(float a, float b){
        Multiplication mult = new Multiplication(a, b);
        MultiplicationView.print(mult);

    }
    public void doDivision(float a, float b){
        Division div = new Division(a, b);
        DivisionView.print(div);
    }
}
