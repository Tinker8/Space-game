
/**
 * Write a description of class Object here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Research
{
    private String name,desc,status = "Upgrade";
    private int upgradeTime,iron,platinum,adamantium,
    copper,gold,diamond,oil,gas,darkmatter;
    //private int magnitude;
    //image
    private int[] res = {iron,platinum,adamantium,
        copper,gold,diamond,oil,gas,darkmatter};
    
    private String[] resN = {"iron","platinum","adamantium",
            "copper","gold","diamond","oil","gas","darkmatter"};
    
    public Research(String nam, String des, int up, 
    int i, int p, int a, int c,int go, int diam, int ga, int o, int dark)
    {
        name = nam;
        desc = des;
        upgradeTime = up;
        iron = i;
        platinum = p;
        adamantium = a;
        copper = c;
        gold = go;
        diamond = diam;
        gas = ga;
        oil = o;
        darkmatter = dark;
        
        int[] temp = {iron,platinum,adamantium,
        copper,gold,diamond,oil,gas,darkmatter};
        res = temp;
    }
    
    public abstract int getLvl();
    public abstract void incLvl();
    public abstract void setLvl(int l);
    public abstract double getMag();
    public abstract int getPowerReq();
    
    public String getCost()
    {
        String temp = "";
        int n = 0;
        while(n < 9)
        {
            if(res[n] != 0)
            {
                temp += resN[n] + ": " + res[n] + " ";
            }
            n++;
        }
        return temp;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String s)
    {
        status = s;
    }
    
    public int getTime()
    {
        return upgradeTime;
    }
    //
    //
    public int getIron()
    {
        return iron;
    }
    
    public int getPlatinum()
    {
        return platinum;
    }
    
    public int getAdamantium()
    {
        return adamantium;
    }
    
    public int getCopper()
    {
        return copper;
    }
    
    public int getGold()
    {
        return gold;
    }
    
    public int getDiamond()
    {
        return diamond;
    }
    
    public int getGas()
    {
        return gas;
    }
    
    public int getOil()
    {
        return oil;
    }
    
    public int getDarkmatter()
    {
        return darkmatter;
    }
}
