package seminar7.obs;

public interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendOffer(String nameCompany, int selary);
}
