package certification;

import certification.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.doMultiplication(2, 5);
        controller.doAddation(1, 3);
        controller.doDivision(3, 8);
        
    }

}
