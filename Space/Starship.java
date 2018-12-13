
/**
 * Write a description of class Starship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starship extends Research
{
    //private String name, desc;
    //private int upgradeTime,cost;
    private boolean canColonize;
    private int speed,hp,armor,dmg,fuelCost,cargoSize;
    private String location;
    
    public Starship(String nam, String des, int up,
    int i, int p, int a, int c,int go, int diam, int ga, int s, int dark)
    {
        super(nam,des,up,i,p,a,c,go,diam,ga,s,dark);
    }
    
    public int getLvl(){
    return 0;}
    
    public void incLvl(){}
    
    public void setLvl(int l){}
    
    public double getMag(){return 0;}
    
    public int getPowerReq(){
    return 0;}
}
