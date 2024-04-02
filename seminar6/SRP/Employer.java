package seminar6.SRP;

public class Employer {
    private String name;
    private String dol;
    private int stav;

    public Employer(String name, String dol, int stav){
        this.name = name;
        this.dol = dol;
        this.stav = stav;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDol(){
        return dol;
    }
    public void setDol(String dol){
        this.dol = dol;
    }
    public int getStav(){
        return stav;
    }
    public void setStav(int stav){
        this.stav = stav;
    }
    
}
