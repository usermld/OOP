package seminar7.FabricMethod;

public class GemGen implements ItemGen{

    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
    
}
