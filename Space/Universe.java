import java.util.*;
/**
 * Write a description of class Universe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Universe
{
    ArrayList<World> worlds = new ArrayList<World>();
    //ArrayList<World> worlds = new ArrayList<World>();
    ArrayList<Slot> slots = new ArrayList<Slot>();
    private Slot s1,s2;
    private World w1,w2;
    /**
     * Constructor for objects of class Universe
     */
    public Universe()
    {
        w1 = new World("Home",1,800,"NewPlayer");
        w2 = new World("Mars",2,200,"NewPlayer");
        
        s1 = new Slot(1, w1);
        s2 = new Slot(2, w2);
        slots.add(s1);
        slots.add(s2);
        
        //worlds.add(w1);
        //worlds.add(w2);
        
        makeSlots();
    }
    
    public void makeSlots()
    {
        int n = 3;
        while(n < 11)
        {
            World w = new World("world"+n,n,600,"");
            Slot s = new Slot(n,w);
            slots.add(s);
            n++;
        }
    }
    
    public World getWorld(String nam)
    {
        for(Slot list : slots)
        {
            if(list.getWorld().getName().equals(nam))
                return list.getWorld();
        }
        return null;
    }
    
    public Slot getSlot(int n)
    {
        for(Slot list : slots)
        {
            if(list.getNo() == n)
                return list;
        }
        return null;
    }
}
