import java.util.*;
/**
 * Write a description of class Date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Date
{
    //Date now = new Date();
    Calendar cal = new GregorianCalendar();
    //int timeS, timeM, timeH, timeD;
    
    
    public Date()
    {
        
    }
    
    public int getSec()
    {
        return cal.get(Calendar.SECOND);
    }
    
    public int getMin()
    {
        return cal.get(Calendar.MINUTE);
    }
    
    public int getHour()
    {
        return cal.get(Calendar.HOUR_OF_DAY);
    }
    
    public int getDay()
    {
        return cal.get(Calendar.DAY_OF_MONTH);
    }
}
