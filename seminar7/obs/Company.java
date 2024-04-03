package seminar7.obs;

import java.util.Random;

public class Company {
    Publisher jobAgency;
    String nameCompany;
    int maxSelary;
    Random rnd;

    public Company(Publisher jobAgency, String nameCompany, int maxSelary){
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        this.maxSelary = maxSelary;
        rnd = new Random();
    }

    public void needEmployee(){
        int selary = rnd.nextInt(maxSelary);
        jobAgency.sendOffer(nameCompany, selary);
    }
}
