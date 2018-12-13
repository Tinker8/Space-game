import java.util.*;
/**
 * Write a description of class Slot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slot
{
    private int slotNo;//,space;
    private World world;
    private World moon;
    World[] moons = {moon};
    
    private ArrayList<Starship> battleField = new ArrayList<Starship>();

    /**
     * Constructor for objects of class Slot
     */
    public Slot(int n, World wr)
    {
        slotNo = n;
        world = wr;
        //space = world.getSpace();
    }
    
    public Slot(int n)
    {
        slotNo = n;
    }
    
    public int getNo()
    {
        return slotNo;
    }
    
    public World getWorld()
    {
        return world;
    }
}
