package seminar7.obs;

public class ObserverMaster implements Observer{
    String name;

    public ObserverMaster(String name){
        this.name = name;
    }
    
    @Override
    public void receiveOffer(String nameCompany, int selary) {
        // отвечает в случае если предложенная зп больше 80
    }
    
}
