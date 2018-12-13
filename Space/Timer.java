import java.util.*;
import java.awt.event.*;
/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer
{
    Date now = new Date();
    //Date save = new Date();
    Calendar cal = new GregorianCalendar();
    int timeS, timeM, timeH, timeD;
    Countdown c;
    public Timer(int t)//int timeM, int timeH, int timeD)
    {
        c = new Countdown();
        //long temp = System.currentTimeMillis();
        //cal.setTime(now);
        //title.setText("Time: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));
        
        //Countdown c = new Countdown();
        c.start();
    }
    
    public Timer()//int secs)//int timeS, int timeM, int timeH, int timeD)
    {
        //cal.set(0,0,timeD,timeH, timeM, timeS);
        //c = new Countdown(secs);
        //c.start();
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
    
    public int getCount()
    {
        return c.getC();
    }
    
    class Countdown extends javax.swing.Timer implements ActionListener
    {
        private int myCounter;
        
        public Countdown()//int count)
        {
            super(1000, null);
            //myCounter = count;
            setRepeats(true);
            setInitialDelay(0);
            addActionListener(this);
        }
        
        public void actionPerformed(ActionEvent ae)
        {
            myCounter--;
            // ...set a label to display the current time...
            //title.setText("Counter: " + myCounter);
            if (myCounter == 0)
            {
                stop();
                //gameOver();
            }
        }
        
        public int getC()
        {
            return myCounter;
        }
        
        public void setC(int c)
        {
            myCounter = c;
        }
    }
}
