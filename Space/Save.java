// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.util.*;
// /**
//  * Write a description of class Game here.
//  * 
//  * @author (your name) 
//  * @version (a version number or a date)
//  */
public class Save
{
//     private String x = 
//     "PlanetNo: 0\r\n" +
//     "Type: null\r\n" +
//     "Name: \r\n" +
//     "Value: 0\r\n" +
//     "Metal: 0\r\n" +
//     "Crystal: 0\r\n" +
//     "Fuel: 0\r\n" +
//     "\r\n" +
//     "ShipsInOrbit: 0\r\n" +
//     "Name, Type, Cargo, lvl, exp\r\n" +
//     "\r\n" +
//     "Buildings: 0\r\n" +
//     "Name,lvl: 0\r\n" +
//     "NameUpgradeTime: 00:000";
//     //File myFile = new File("myFile.txt");
//     File save = new File("NewSave.txt");
//     
//     //Scanner read = new Scanner(x);
//     //FileInputStream in = new FileInputStream(myFile);
//     FileOutputStream out;
//     byte buffer[] = new byte[256];
//     int n = 0;
//     int c = x.length();
//     
//     //World home;
//     //-*9GUI gui;
//     //ArrayList<GUI> guis = new ArrayList();
//     
//     public Save(int z) throws IOException
//     {
//         if(z == 1)
//         {
//             z++;
//             //gui = new GUI(z);
//             
//             
//         }
//         //autoSave.setWritable(true);
//         out = new FileOutputStream(save);
//         //home = new World();
//         //gui = new GUI();
//         
//         //save();
//         //autoSave.setWritable(false);
//     }
//     
//     public void save()throws IOException
//     {
//         
//         String sav = "";
//         for(Research list : gui.world.res)
//         {
//             if(list != null)
//                 if(list.getStatus().equals("Upgrading"))
//                 {
//                     sav += list.getName() + " " + list.getLvl() + " " + gui.c.getC() + "\r\n";
//                 }
//                 else
//                 {
//                     sav += list.getName() + " " + list.getLvl() + " " + "000000" + "\r\n";
//                 }
//         }
//         
//         while(true)
//         {
//             char temp[] = sav.toCharArray();
//             int rc = c;//in.read(buffer,0,256);
//             while(c > 0)//buffer[n] != null && temp[n] != null)//n < 254 && n < temp.length)
//             {
//                 //if()
//                     buffer[n] = (byte)temp[n];
//                     n++;
//                     c--;
//             }
//             if(rc <= 0) break;
//             out.write(buffer,0,rc);
//         }
//         out.close();
//     }
}
