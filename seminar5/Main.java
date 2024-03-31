package seminar5;


import seminar5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("Ivamot", "1", "1");
        controller.createStudent("Petr", "2", "2");
        
        controller.createStudent("Disdf", "3", "3");
        controller.createStudent("DSFG", "4", "4");
        controller.createStudent("FSDGFG", "5", "5");
        

        controller.createTeacher("1.1", "1.1", "1.1");
        
        controller.createLearnGroup();
        
        
        
    }
}
