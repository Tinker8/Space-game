
/**
 * Write a description of class Social here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Social extends Research
{
    private double magnitude;
    private int lvl = 1,powerReq;
    
    public Social(String nam, String des, int up, double m, int pr,
    int i, int p, int a, int c,int go, int diam, int ga, int s, int dark)
    {
        super(nam,des,up,i,p,a,c,go,diam,ga,s,dark);
        magnitude = m;
        powerReq = pr;
    }
    
    public int getLvl()
    {
        return lvl;
    }
    
    public int getPowerReq()
    {
        return powerReq;
    }
    
    public void setLvl(int l)
    {
        lvl = l;
    }
    
    public void incLvl()
    {
        lvl++;
    }
    
    public double getMag()
    {
        return magnitude;
    }
}
