package Actor;

abstract class Actor implements ActorBehavoir{
    
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    
    public Actor(String name){
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    } 
    public abstract String getName();

}
