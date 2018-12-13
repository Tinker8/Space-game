
/**
 * Write a description of class Defence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Defence extends Research
{
    private int hp,armor,dmg;
    
    public Defence(String nam, String des, int up,
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
