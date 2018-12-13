import java.util.*;
/**
 * Write a description of class World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World
{
    private String name, owner;
    private int worldNo,space,powerTotal, powerUsed;
    //type
    //res
    private double iron=1000,platinum,adamantium,copper=200,gold,diamond,oil,gas,darkmatter;
    double[] ress = {iron,platinum,adamantium,
        copper,gold,diamond,oil,gas,darkmatter};
    
    String[] resN = {"iron","platinum","adamantium",
            "copper","gold","diamond","oil","gas","darkmatter"};
    //Buildings
    //Mines
    private Research ironMine = new Social("IronMine","Mines for iron",10,.4,5,
    100,0,0,20,0,0,0,0,0);
    private Research copperMine = new Social("CopperMine","Mines for copper",20,.3,5,
    200,0,0,40,0,0,0,0,0);
    private Research oilMine = new Social("OilMine","Mines for oil",30,.2,5,
    400,0,0,80,0,0,0,0,0);
    //fact
    private Research fact = new Social("Factory","Lowers building time",60,.2,5,
    600,0,0,100,0,0,0,0,0);
    //power
    private Research powerPlant = new Social("PowerPlant","Generates power for planet",20,10,0,
    100,0,0,20,0,0,0,0,0);
    //Research
    private Research popDrive = new Social("PropulationDrive","Moves starships",20,.1,0,
    300,0,0,1000,0,0,0,0,0);
    
    ArrayList<Research> res = new ArrayList<Research>();
    String[] names = {"IronMine","CopperMine","OilMine","Fact","Power"};
    //ships
    
    //Countdown c;
    
    public World(String nam, int no, int s, String o)
    {
        name = nam;
        worldNo = no;
        space = s;
        owner = o;
        res.add(ironMine);
        res.add(copperMine);
        res.add(oilMine);
        res.add(fact);
        res.add(powerPlant);
        
        updateRes();
        
        //c = new Countdown(int, name, i);
        //c.start();
    }
    
    public String getOwner()
    {
        return owner;
    }
    
    public void setOwner(String t)
    {
        owner = t;
    }
    
    public int getSpace()
    {
        int temp = 0;
        for(Research list : res)
        {
            temp += list.getLvl() - 1;
        }
        space -= temp;
        return space;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPowerUsed()
    {
        int temp = 0;
        for(Research list : res)
        {
            if(list.getPowerReq() > 0)
                temp += (list.getLvl() - 1) * list.getPowerReq();
        }
        powerUsed += temp;
        
        return temp;
    }
    
    public int getPowerTotal()
    {
        return (int)((powerPlant.getLvl() - 1) * powerPlant.getMag());
    }
    
    public void updateRes()
    {
        double[] temp = {iron,platinum,adamantium,
        copper,gold,diamond,oil,gas,darkmatter};
        ress = temp;
    }
    
    public String getCost()
    {
        updateRes();
        String temp = "";
        int n = 0;
        while(n < 9)
        {
            //if(ress[n] != 0)
            {
                temp += resN[n] + ": " + (int)ress[n] + " ";
            }
            n++;
        }
        return temp;
    }
    
    public int getUpgradeTime(String nam)
    {
        //return (int)(getRes(nam).getTime() / (fact.getMag() * fact.getLvl()));
        //return (int)(((getRes(nam).getTime() * getRes(nam).getLvl()) * 1.6) - 
        //((fact.getMag() * fact.getLvl()) * 100));
        return (int)(getRes(nam).getTime());
    }
    
//     public void setRes()
//     {
//         int n = 0;
//         while(n < 9)
//         {
//             ress[n] 
//         }
//     }
    
    public void incRes()
    {
        iron += ironMine.getMag()*ironMine.getLvl();
        //platinum
        //adamantium
        copper += copperMine.getMag();
        //gold
        //diamond
        oil += oilMine.getMag();
        //gas
        //darkmatter
    }
    
    public int getIndex(String nam)
    {
        int index = 0;
        for(Research list : res)
        {
            if(list.getName().equals(nam))
            {
                return index;
            }
            index++;
        }
        return index;
    }
    
    public Research getRes(String nam)
    {
        for(Research list : res)
        {
            if(list.getName().equals(nam))
            {
                return list;
            }
        }
        return null;
    }
    
    public boolean canBuy(String nam)
    {
        Research temp = getRes(nam);
        if(temp.getIron() <= iron && temp.getPlatinum() <= platinum && 
        temp.getAdamantium() <= adamantium && temp.getCopper() <= copper &&
        temp.getGold() <= gold && temp.getDiamond() <= diamond && 
        temp.getGas() <= gas && temp.getOil() <= oil && 
        temp.getDarkmatter() <= darkmatter)
        {
            return true;
        }
        return false;
    }
    
    public void buy(String nam)
    {
        if(canBuy(nam))// && getRes(nam).getStatus().equals("Upgrade"))
        {
            reduceRes(nam);
            //timer.c.setC(getRes(nam).getTime());
            //getRes(nam).setStatus("Upgrading");
//             if(timer.getCount() == 0)
//             {
//                 getRes(nam).incLvl();
//             }
            
        }
    }
    
    public Research getAllStatus()
    {
        for(Research list : res)
        {
            if(list.getStatus().equals("Upgrading"))
            {
                return list;
            }
        }
        return null;
    }
    
    public void reduceRes(String nam)
    {
        Research temp = getRes(nam);
        iron -= temp.getIron();
        platinum -= temp.getPlatinum();
        adamantium -= temp.getAdamantium();
        copper -= temp.getCopper();
        gold =- temp.getGold();
        diamond -= temp.getDiamond();
        gas -= temp.getGas();
        oil -= temp.getOil();
        darkmatter -= temp.getDarkmatter();
    }
    
    //public String getRes()
    {
        
    }
    
    public double getIr()
    {
        return iron;
    }
    
    public void setIr(double t)
    {
        iron = t;
    }
    
    public double getPlat()
    {
        return platinum;
    }
    
    public void setPlat(double t)
    {
        platinum = t;
    }
    
    public double getAda()
    {
        return adamantium;
    }
    
    public void setAda(double t)
    {
        adamantium = t;
    }
    
    public double getCop()
    {
        return copper;
    }
    
    public void setCop(double t)
    {
        copper = t;
    }
    
    public double getGo()
    {
        return gold;
    }
    
    public void setGo(double t)
    {
        gold = t;
    }
    
    public double getDiam()
    {
        return diamond;
    }
    
    public void setDiam(double t)
    {
        diamond = t;
    }
    
    public double getGa()
    {
        return gas;
    }
    
    public void setGa(double t)
    {
        gas = t;
    }
    
    public double getOil()
    {
        return oil;
    }
    
    public void setOil(double t)
    {
        oil = t;
    }
    
    public double getDark()
    {
        return darkmatter;
    }
    
    public void setDark(double t)
    {
        darkmatter = t;
    }
    
    public String resToString()
    {
        return "Iron: " + iron + " Plat: " + platinum+ " Ada: " + adamantium+
        " Copper: " + copper+ " Gold: "+gold+ " Diamond: "+diamond+
        " Gas: "+gas+" Oil: "+oil+" dark: "+darkmatter;
    }
    
//     class Countdown extends javax.swing.Timer implements ActionListener
//     {
//         private int myCounter = 0,temp = 0, index;//game.home.getRes("Iron Mine").getTime();
//         private String name;
//         public Countdown(int c, String nam, int i)//int count)
//         {
//             super(1000, null);
//             myCounter = c;
//             temp = c;
//             name = nam;
//             index = i;
//             //myCounter = count;
//             setRepeats(true);
//             setInitialDelay(0);
//             addActionListener(this);
//             //this.start();
//         }
//         
//         public void actionPerformed(ActionEvent ae)
//         {
//             myCounter--;
//             // ...set a label to display the current time...
//             bb[index].setText("Upgrading (Time: " + myCounter + ")");
//             if (myCounter == 0)
//             {
//                 stop();
//                 myCounter = temp;
//                 game.home.getRes(name).incLvl();
//                 //game.home.getRes(name).setStatus("Upgrade");
//                 //mmButton.setText("Upgrade");
//                 
//                 int n = 0;
//                 for(JButton list : bb)
//                 {
//                     bb[n].setText("Upgrade");
//                     n++;
//                 }
//                 bb[index].setText("Upgrade");
//                 game.home.getRes(name).setStatus("Upgrade");
//                 
//                 ll[index].setText(name + ": "+game.home.getRes(name).getLvl());
//                 updateScreen();
//                 //gameOver();
//             }
//         }
//     }
}
