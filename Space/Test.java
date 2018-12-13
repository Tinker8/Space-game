
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    private double iron=1000;
    double[] ress = {iron};

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        int c = 0;
        while(c < 10)
        {
            System.out.println("T: " + iron);
            System.out.println("A: " +ress[0]);
            ress[0]++;
            double[] temp = {iron};
            ress = temp;
            c++;
        }
    }
}
