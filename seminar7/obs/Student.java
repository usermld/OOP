package seminar7.obs;

public class Student implements Observer{
    String name;
    int selary;

    public Student(String name, int selary){
        this.name = name;
        selary = 0;
    }

    @Override
    public void receiveOffer(String nameCompany, int selary) {
        //отвечает в случае если предложенная зарплата выше текущей
    }
    
}
