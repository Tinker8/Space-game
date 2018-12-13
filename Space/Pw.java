
/**
 * Write a description of class Pw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pw
{
    private String[] dd = new String[300000];
    private String pw = "";

    /**
     * Constructor for objects of class Pw
     */
    public Pw(String t)
    {
        pw = t;
        //System.out.println(get(0,0,0,0));
    }
    
    public String get(int a, int b, int c, int d)
    {
        String temp = "";
        if(getCode(a,b,c,d).equals(pw))
            temp = getCode(a,b,c,d);
        if(getCode(a,b,d,c).equals(pw))
            temp = getCode(a,b,d,c);
        if(getCode(a,c,b,d).equals(pw))
            temp = getCode(a,c,b,d);
        if(getCode(a,c,d,b).equals(pw))
            temp = getCode(a,c,d,b);
        if(getCode(a,d,b,c).equals(pw))
            temp = getCode(a,d,b,c);
        if(getCode(a,d,c,b).equals(pw))
            temp = getCode(a,d,c,b);
        
        if(getCode(b,a,c,d).equals(pw))
            temp = getCode(b,a,c,d);
        if(getCode(b,a,c,d).equals(pw))
            temp = getCode(b,a,d,c);
        if(getCode(b,c,a,d).equals(pw))
            temp = getCode(b,c,a,d);
        if(getCode(b,c,d,a).equals(pw))
            temp = getCode(b,c,d,a);
        if(getCode(b,d,a,c).equals(pw))
            temp = getCode(b,d,a,c);
        if(getCode(b,d,c,a).equals(pw))
            temp = getCode(b,d,c,a);
        
        if(getCode(c,a,b,d).equals(pw))
            temp = getCode(c,a,b,d);
        if(getCode(c,a,d,b).equals(pw))
            temp = getCode(c,a,d,b);
        if(getCode(c,b,a,d).equals(pw))
            temp = getCode(c,b,a,d);
        if(getCode(c,b,d,a).equals(pw))
            temp = getCode(c,b,d,a);
        if(getCode(c,d,a,b).equals(pw))
            temp = getCode(c,d,a,b);
        if(getCode(c,d,b,a).equals(pw))
            temp = getCode(c,d,b,a);
        
        if(getCode(d,a,b,c).equals(pw))
            temp = getCode(d,a,b,c);
        if(getCode(d,a,c,b).equals(pw))
            temp = getCode(d,a,c,b);
        if(getCode(d,b,a,c).equals(pw))
            temp = getCode(d,b,a,c);
        if(getCode(d,b,c,a).equals(pw))
            temp = getCode(d,b,c,a);
        if(getCode(d,c,a,b).equals(pw))
            temp = getCode(d,c,a,b);
        if(getCode(d,c,b,a).equals(pw))
            temp = getCode(d,c,b,a);
        
        return temp;
    }
    
//     public boolean check(String t)
//     {
//         if(dd.contains(t))
//         {
//             return true;
//         }
//         return false;
//     }
    
    public String getCode(int a, int b, int c, int d)
    {
        //a,b,c,d
        String t = "";
        while(a < 10)
        {
            while(b < 10)
            {
                while(c < 10)
                {
                    while(d < 10)
                    {
                        t = ""+a+b+c+d;
                        System.out.println(t);
                        if(t.equals(pw))
                        {
                            return t;
                        }
                        d++;
                    }
                    d=0;
                    t = ""+a+b+c+d;
                        if(t.equals(pw))
                        {
                            return t;
                        }
                    c++;
                }
                c=0;
                t = ""+a+b+c+d;
                        if(t.equals(pw))
                        {
                            return t;
                        }
                b++;
            }
            b=0;
            t = ""+a+b+c+d;
                        if(t.equals(pw))
                        {
                            return t;
                        }
            a++;
        }
        return t;
    }
}
