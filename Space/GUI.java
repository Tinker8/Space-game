import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
/**
 * Write a description of class GUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GUI
{
    private String username = "NewPlayer";
    private JFrame myFrame = new JFrame("Game");
    
    
    private JLabel title = new JLabel ("My Timer App");
    private JLabel lsouth = new JLabel ("south");
    private JLabel lwest = new JLabel ("west");
    private JLabel least = new JLabel ("east");
    private JLabel lnorth = new JLabel ("north");
    
    private JButton homeButton = new JButton("Home");
    private JButton buildButton = new JButton("Buildings");
    private JButton resButton = new JButton("Research");
    private JButton uniButton = new JButton("Universe");
    
    private Universe univ = new Universe();
    //World world = getWorld();
    String world = "Home";
    Save s;
    
    //Res
    //final JLabel cent = new JLabel(world.resToString());
    
    final JLabel iron = new JLabel("");
    final JLabel plat = new JLabel("");
    final JLabel ada = new JLabel("");
    final JLabel cop = new JLabel("");
    final JLabel gold = new JLabel("");
    final JLabel dia = new JLabel("");
    final JLabel oil = new JLabel("");
    final JLabel gas = new JLabel("");
    final JLabel dark = new JLabel("");
    JLabel[] rl = {iron,plat,ada,cop,gold,dia,oil,gas,dark};
    
    //power
    JLabel power = new JLabel(getPower());
    //Buttons
    final JButton mmButton = new JButton("Upgrade");
    final JButton emButton = new JButton("Upgrade");
    final JButton fmButton = new JButton("Upgrade");
    final JButton cmButton = new JButton("Upgrade");
    final JButton pmButton = new JButton("Upgrade");
    JButton[] bb = {mmButton,emButton,fmButton,cmButton,pmButton};
    final JButton saveButton = new JButton("Save");
    final JButton loadButton = new JButton("Load");
    JButton setButton = new JButton("Settings");
    JButton nameButton = new JButton("Save Username");
    //lvl
    JLabel mm = new JLabel ("IronMine: " + getWorld().getRes("IronMine").getLvl());
    JLabel em = new JLabel ("CopperMine: " + getWorld().getRes("CopperMine").getLvl());
    JLabel fm = new JLabel ("OilMine: " + getWorld().getRes("OilMine").getLvl());
    JLabel cm = new JLabel ("Factory: " + getWorld().getRes("Factory").getLvl());
    JLabel pm = new JLabel ("PowerPlant: " + getWorld().getRes("PowerPlant").getLvl());
    JLabel[] ll = {mm,em,fm,cm,pm};
    //time
    JLabel mmTime = new JLabel ("Time: " + getWorld().getUpgradeTime("IronMine"));
    JLabel emTime = new JLabel ("Time: " + getWorld().getUpgradeTime("CopperMine"));
    JLabel fmTime = new JLabel ("Time: " + getWorld().getUpgradeTime("OilMine"));
    JLabel cmTime = new JLabel ("Time: " + getWorld().getUpgradeTime("Factory"));
    JLabel pmTime = new JLabel ("Time: " + getWorld().getUpgradeTime("PowerPlant"));
    JLabel[] tl = {mmTime,emTime,fmTime,cmTime,pmTime};
    //cost
    JLabel mmRes = new JLabel ("Cost: " + getWorld().getRes("IronMine").getCost());
    JLabel emRes = new JLabel ("Cost: " + getWorld().getRes("CopperMine").getCost());
    JLabel fmRes = new JLabel ("Cost: " + getWorld().getRes("OilMine").getCost());
    JLabel cmRes = new JLabel ("Cost: " + getWorld().getRes("Factory").getCost());
    JLabel pmRes = new JLabel ("Cost: " + getWorld().getRes("PowerPlant").getCost());
    JLabel[] cl = {mmRes,emRes,fmRes,cmRes,pmRes};
    //desc
    JLabel md = new JLabel (getWorld().getRes("IronMine").getDesc());
    JLabel ed = new JLabel (getWorld().getRes("CopperMine").getDesc());
    JLabel fd = new JLabel (getWorld().getRes("OilMine").getDesc());
    JLabel cd = new JLabel (getWorld().getRes("Factory").getDesc());
    JLabel pd = new JLabel (getWorld().getRes("PowerPlant").getDesc());
    
    JTextField setO = new JTextField();
    
    Timer t;
    //t.start();
        
    Countdown countd;
    
    //private Countdown[] count = {null,null,null};
    
    //Save
    //File save = new File("Save.txt");
    //FileOutputStream out;
    //byte buffer[] = new byte[256];
    final JPanel universe;
    
    private boolean check = false;
    //int z = 0;
    
    //private World www = univ.getWorld("Home");
    
    ButtonGroup sel = new ButtonGroup();
    JRadioButton radio1 = new JRadioButton("Home",true);
    JRadioButton radio2 = new JRadioButton("Mars");
    JRadioButton radio3 = new JRadioButton("world3");
    JRadioButton radio4 = new JRadioButton("world4");
    
    JLabel planet;
    
    int tez = 0;
    public GUI()throws IOException
    {
        //myFrame.setState(JFrame.ICONIFIED);
        
        sel.add(radio1);
        sel.add(radio2);
        sel.add(radio3);
        sel.add(radio4);
        
        try
        {
            s = new Save();
        }
        catch(Exception ex)
        {}
        //s.load();
        t = new Timer();
        
//         int tt = 0;
//         while(tt < 2)
//         {
//             if(tt == 0)
//                 world = "Home";
//             if(tt == 1)
//                 world = "Mars";
            int tempN = 0;
            for(Research list : getWorld().res)
            {
                String na = list.getName();
                ll[tempN].setText(na + " " + getWorld().getRes(na).getLvl());
                tl[tempN].setText("Time: " + getWorld().getUpgradeTime(na));
                cl[tempN].setText("Cost: " + getWorld().getRes(na).getCost());
                tempN++;
            }
//             tt++;
//         }
//         world = "Home";
        
        //z++;
//         if(z == 1)
//         {
//             s = new Save(z);
//         }
        
        //out = new FileOutputStream(save);
        
        //game = new Game();
        Container contentPane = myFrame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        //North
        JPanel northPanel = new JPanel();
        contentPane.add(northPanel, BorderLayout.NORTH);
        northPanel.setLayout(new GridLayout(2,1));
        //northPanel.add(lnorth);
        
        //res
        northPanel.add(iron);
        northPanel.add(power);
//         northPanel.add(plat);
//         northPanel.add(ada);
//         northPanel.add(cop);
//         northPanel.add(gold);
//         northPanel.add(dia);
//         northPanel.add(oil);
//         northPanel.add(gas);
//         northPanel.add(dark);
        
        //Center
        JPanel centrePanel = new JPanel();
        contentPane.add(centrePanel, BorderLayout.CENTER);
        centrePanel.setLayout(new FlowLayout());
        //cent = new JLabel (world.resToString());
        //centrePanel.add(cent);
        
        //Options
        final JPanel home = new JPanel();
        final JPanel buildings = new JPanel();
        final JPanel research = new JPanel();
        universe = new JPanel();
        final JPanel settings = new JPanel();
        
        centrePanel.add(home);
        centrePanel.add(buildings);
        centrePanel.add(research);
        centrePanel.add(universe);
        centrePanel.add(settings);
        
        home.setLayout(new GridLayout(50,1));
        buildings.setLayout(new GridLayout(28,1));
        research.setLayout(new GridLayout(1,1));
        universe.setLayout(new GridLayout(12,1));
        settings.setLayout(new GridLayout(2,1));
        
        buildings.setVisible(false);
        research.setVisible(false);
        universe.setVisible(false);
        settings.setVisible(false);
        
        //Home
        JLabel lhome = new JLabel ("******************************Home******************************");
        home.add(lhome);
        planet = new JLabel(getWorld().getName());
        home.add(planet);
        home.add(radio1);
        home.add(radio2);
        home.add(radio3);
        home.add(radio4);
        
        int sp = 0;
        while(sp < 33)
        {
            
            home.add(new JLabel (""));
            sp++;
        }
        
        //build
        JLabel lbuild = new JLabel ("****************************Buildings****************************");
        buildings.add(lbuild);
        buildings.add(mm);
        buildings.add(md);
        buildings.add(mmRes);
        buildings.add(mmTime);
        buildings.add(mmButton);
        
        buildings.add(em);
        buildings.add(ed);
        buildings.add(emRes);
        buildings.add(emTime);
        buildings.add(emButton);
        
        buildings.add(fm);
        buildings.add(fd);
        buildings.add(fmRes);
        buildings.add(fmTime);
        buildings.add(fmButton);
        
        buildings.add(cm);
        buildings.add(cd);
        buildings.add(cmRes);
        buildings.add(cmTime);
        buildings.add(cmButton);
        
        buildings.add(pm);
        buildings.add(pd);
        buildings.add(pmRes);
        buildings.add(pmTime);
        buildings.add(pmButton);
        
        //buildings.add(saveButton);
        //buildings.add(loadButton);
        
        
        //res
        JLabel lres = new JLabel ("****************************Research****************************");
        research.add(lres);
        
        
        
        //Universe
        JLabel luni = new JLabel ("****************************Universe****************************");
        universe.add(luni);
        
        
        
        JButton nextButton = new JButton("Next");
        
        universe.add(nextButton,BorderLayout.SOUTH);
        //Settings
        settings.add(setO);
        settings.add(nameButton);
        
        //East
        JPanel eastPanel = new JPanel();
        contentPane.add(eastPanel, BorderLayout.EAST);
        
        eastPanel.setLayout(new GridLayout(1,1));
        eastPanel.add(least);
        
        
        //South
        JPanel southPanel = new JPanel();
        contentPane.add(southPanel, BorderLayout.SOUTH);
        southPanel.setLayout(new FlowLayout());
        southPanel.add(lsouth);
        
        //West
        JPanel westPanel = new JPanel();
        contentPane.add(westPanel, BorderLayout.WEST);
        westPanel.setLayout(new GridLayout(14,1));
        westPanel.add(lwest);
        westPanel.add(homeButton);
        westPanel.add(buildButton);
        westPanel.add(resButton);
        westPanel.add(uniButton);
        westPanel.add(setButton);
        westPanel.add(saveButton);
        final JLabel ol = new JLabel(getUsername());
        westPanel.add(ol);
        
        homeButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                // make panels not visible
                home.setVisible(true);
                buildings.setVisible(false);
                research.setVisible(false);
                universe.setVisible(false);
                settings.setVisible(false);
                updateScreen();
            }
        });
        buildButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                // make panels not visible
                home.setVisible(false);
                buildings.setVisible(true);
                research.setVisible(false);
                universe.setVisible(false);
                settings.setVisible(false);
                updateScreen();
            }
        });
        resButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                // make panels not visible
                home.setVisible(false);
                buildings.setVisible(false);
                research.setVisible(true);
                universe.setVisible(false);
                settings.setVisible(false);
                updateScreen();
            }
        });
        uniButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                // make panels not visible
                home.setVisible(false);
                buildings.setVisible(false);
                research.setVisible(false);
                universe.setVisible(true);
                settings.setVisible(false);
                updateScreen();
            }
        });
        
        setButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                // make panels not visible
                home.setVisible(false);
                buildings.setVisible(false);
                research.setVisible(false);
                universe.setVisible(false);
                settings.setVisible(true);
                updateScreen();
            }
        });
        
        mmButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                // Upgrade mm
                buildable("IronMine",0);
            }
        });
        
        emButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                // Upgrade mm
                buildable("CopperMine",0);
            }
        });
        
        fmButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                buildable("OilMine",0);
            }
        });
        
        cmButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                buildable("Factory",0);
            }
        });
        
        pmButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                buildable("PowerPlant",0);
            }
        });
        
        saveButton.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                try
                {
                    s.save();
                }
                catch(IOException ex)
                {
                    
                }
            }
        });
        
        loadButton.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                try
                {
                    s.load();
                }
                catch(Exception ex)
                {
                    
                }
            }
        });
        
        nextButton.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {   
                next();
            }
        });
        
        radio1.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                radio1.setSelected(true);
                radio2.setSelected(false);
                radio3.setSelected(false);
                radio4.setSelected(false);
                
                world = "Home";
                
                planet.setText("" + getWorld().getName());
                updateTxt();
                
                
            }
        });
        
        radio2.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                radio1.setSelected(false);
                radio2.setSelected(true);
                radio3.setSelected(false);
                radio4.setSelected(false);
                world = "Mars";
                planet.setText("" + getWorld().getName());
                updateTxt();
            }
        });
        
        radio3.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                radio2.setSelected(false);
                radio3.setSelected(true);
                radio1.setSelected(false);
                radio4.setSelected(false);
                world = "world3";
                planet.setText("" + getWorld().getName());
            }
        });
        
        radio4.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                radio2.setSelected(false);
                radio3.setSelected(false);
                radio1.setSelected(false);
                radio4.setSelected(true);
                world = "world4";
                planet.setText("" + getWorld().getName());
            }
        });
        
        nameButton.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                setUsername(setO.getText());
                ol.setText(getUsername());
            }
        });
        
        myFrame.pack();
        myFrame.setVisible(true);
    }
    
    public String getPower()
    {
        return "Power:(" + getWorld().getPowerUsed() + "/" + getWorld().getPowerTotal() + ")";
    }
    
    public void setUsername(String t)
    {
        setOwner(t);
        username = t;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setOwner(String t)
    {
        for(Slot list : univ.slots)
        {
            if(list.getWorld().getOwner().equals(username))
                list.getWorld().setOwner(t);
        }
    }
    
    public void updateTxt()
    {
        int tempN = 0;
        for(Research list : getWorld().res)
        {
            String na = list.getName();
            ll[tempN].setText(na + " " + getWorld().getRes(na).getLvl());
            tl[tempN].setText("Time: " + getWorld().getUpgradeTime(na));
            cl[tempN].setText("Cost: " + getWorld().getRes(na).getCost());
            tempN++;
        }
    }
    
    public World getWorld()
    {
        if(world.equals("Home"))
            return univ.getWorld("Home");
        else if(world.equals("Mars"))
            return univ.getWorld("Mars");
        else
            return null;
    }
    
    public void next()
    {
        tez++;
        int cv = 0;
        while(cv < 10)
        {
            Slot ss = univ.getSlot(cv);
            if(ss != null)
            {
                JPanel p1 = new JPanel();
                p1.setLayout(new FlowLayout());
                JLabel l1 = new JLabel(""+ss.getNo());
                JLabel l2 = new JLabel(ss.getWorld().getName());
                JLabel l3 = new JLabel("Space: " + ss.getWorld().getSpace());
                p1.add(l1);
                p1.add(l2);
                p1.add(l3);
                universe.add(p1,BorderLayout.CENTER);
            }
            
            cv++;
        }
        
    }
    
    public void buildable(String name, int t)
    {
        if(getWorld().getAllStatus() == null && getWorld().canBuy(name))
        {
            int n = 0;
            for(JButton list : bb)
            {
                bb[n].setText("-");
                n++;
            }
            //bb[n].getText().equals("-");
            int i = getWorld().getIndex(name);
            //bb[i].setText("Upgrading");
            
            getWorld().getRes(name).setStatus("Upgrading");
            int time = t;
            if(t == 0)
                time = getWorld().getUpgradeTime(name);
            countd = new Countdown(time, name, i);
            countd.start();
            
            getWorld().buy(name);
        }
        
//         if(world.canBuy(name) && world.getRes(name).getStatus().equals("Upgrade"))
//         {
//             mmButton.setText("Upgrading");
//             world.getRes(name).setStatus("Upgrading");
//             
//             //world.res.get(n).getName.equals(name);
//             
//             //Countdown[] count2 = {new Countdown(0),null,null};
//             //count = count2;
//             
//             c = new Countdown(world.getRes(name).getTime());
//             c.start();
//             world.buy(name);
//             //buyBuilding();
//         }
        //updateScreen();
    }
    
    public void buyBuilding()
    {
//         c = new Countdown();
//         c.start();
//         world.buy("IronMine");
//         if(world.getRes("IronMine").getStatus().equals("Upgrading"))
//         {
//             
//             if(!isUpgrading())
//             {
//                 
//                 
//             //mmButton.removeActionListener(mmButton.getActionListeners());
//             }
//             else{}
//         }
    }
    
    public void updateScreen()
    {
        //cent.setText(world.resToString());
        //mm.setText("IronMine: "+world.getRes("IronMine").getLvl());
        //em.setText("CopperMine: "+world.getRes("CopperMine").getLvl());
        //fm.setText("OilMine: "+world.getRes("OilMine").getLvl());
        getWorld().updateRes();
        rl[0].setText(getWorld().getCost());
        if(getWorld().canBuy("IronMine"))
        {
            //mmButton.setVisible(true);
        }
        else //if(!world.canBuy("IronMine"))
        {
            //mmButton.setVisible(false);
        }
        
//         if(world.getRes("IronMine").getStatus().equals("Upgrading"))
//         {
//             mmButton.setText("Upgrading");
//         }
//         
//         if(world.getRes("CopperMine").getStatus().equals("Upgrading"))
//         {
//             emButton.setText("Upgrading");
//         }
//         
//         if(world.getRes("OilMine").getStatus().equals("Upgrading"))
//         {
//             fmButton.setText("Upgrading");
//         }
        
//             else
//             {
//                 mmButton.setText("Upgrade");
//                 //mmButton.addActionListener(new ActionListener());
//             }
        
    }
    
    public boolean isUpgrading()
    {
        if(mmButton.getText().equals("Upgrading"))
        {
            return true;
        }
        return false;
    }
    
    class Save
    {
        private String x = 
        "PlanetNo: 0\r\n" +
        "Type: null\r\n" +
        "Name: \r\n" +
        "Value: 0\r\n" +
        "Metal: 0\r\n" +
        "Crystal: 0\r\n" +
        "Fuel: 0\r\n" +
        "\r\n" +
        "ShipsInOrbit: 0\r\n" +
        "Name, Type, Cargo, lvl, exp\r\n" +
        "\r\n" +
        "Buildings: 0\r\n" +
        "Name,lvl: 0\r\n" +
        "NameUpgradeTime: 00:000";
        //File myFile = new File("myFile.txt");
        File save = new File("NewSave.txt");
        
        //Scanner read = new Scanner(x);
        
        FileOutputStream out;
        FileInputStream in;
        //byte buffer[] = new byte[256];
        //int n = 0;
        //int c = x.length();
        
        //World home;
        //GUI gui = new GUI();
        //ArrayList<GUI> guis = new ArrayList();
        Scanner read;
        
        public Save() throws Exception
        {
            //if(save.exists())
            {
                in = new FileInputStream(save);
                read = new Scanner(in);
                //try
                {
                    //load();
                }
                //catch(NoSuchElementException ex)
                {
                    
                }
            }
            //save.setWritable(true);
            //if(save.exists())
            //out = new FileOutputStream(save);
            //home = new World();
            //gui = new GUI();
            
            //save();
            //save.setWritable(false);
        }
        
        public void load()throws IOException
        {
            //read.next();
            //String nam;
//             int tem = 0;
//             while(tem < 9)
//             {
//                 if((world.resN[tem] + ":").equals(read.next()))
//                 {
//                     world.ress[tem] = (Integer.parseInt(read.next()));
//                 }
//                 tem++;
//             }
            setUsername(read.next());
            int tt = 0;
            while(tt < 2)
            {
                if(tt == 0)
                    world = "Home";
                if(tt == 1)
                    world = "Mars";
                if((getWorld().resN[0] + ":").equals(read.next()))
                    getWorld().setIr(Integer.parseInt(read.next()));
                if((getWorld().resN[1] + ":").equals(read.next()))
                    getWorld().setPlat(Integer.parseInt(read.next()));
                if((getWorld().resN[2] + ":").equals(read.next()))
                    getWorld().setAda(Integer.parseInt(read.next()));
                if((getWorld().resN[3] + ":").equals(read.next()))
                    getWorld().setCop(Integer.parseInt(read.next()));
                if((getWorld().resN[4] + ":").equals(read.next()))
                    getWorld().setGo(Integer.parseInt(read.next()));
                if((getWorld().resN[5] + ":").equals(read.next()))
                    getWorld().setDiam(Integer.parseInt(read.next()));
                if((getWorld().resN[6] + ":").equals(read.next()))
                    getWorld().setGa(Integer.parseInt(read.next()));
                if((getWorld().resN[7] + ":").equals(read.next()))
                    getWorld().setOil(Integer.parseInt(read.next()));
                if((getWorld().resN[8] + ":").equals(read.next()))
                    getWorld().setDark(Integer.parseInt(read.next()));
                
            //read.next();
            int zx = 0;
            for(Research list : getWorld().res)
            {
                if(list != null)
                //if((read.next() + " " + read.next()).equals(list.getName()))
                {
                    //read.next();
                    
                    
                    //read.next();
                    
                    if(read.next().equals(list.getName()))
                        list.setLvl(Integer.parseInt(read.next()));
                        int temps = Integer.parseInt(read.next());
                        if(temps != 000000)
                        {
                            Date now = new Date();
                            int min = Integer.parseInt(read.next());
                            int sec = Integer.parseInt(read.next());
                            int dMin = 0,dSec = 0;
                            if(min > 0)
                            {
                                dMin = min - now.getMin();
                            }
                            if(sec > 0)
                                if(now.getSec() < sec)
                                dSec = sec - now.getSec();
                            int dd = (dMin * 60) + dSec;
                            if(dd > temps)
                                buildable(list.getName(),1);
                            else
                                buildable(list.getName(),temps - dd);
                        }
                }
                zx++;
            }
            tt++;
            }
            world = "Home";
        }
        
        public void save()throws IOException
        {
            out = new FileOutputStream(save);
            byte buffer[] = new byte[1200];
            int n = 0;
            String sav = "";
            sav += getUsername() + "\r\n";
            int tt = 0;
            while(tt < 2)
            {
                if(tt == 0)
                    world = "Home";
                if(tt == 1)
                    world = "Mars";
                    
                sav += getWorld().getCost() + "\r\n";
                for(Research list : getWorld().res)
                {
                    if(list != null)
                        sav += list.getName() + " " + list.getLvl() + " ";
                    if(list.getStatus().equals("Upgrading"))
                    {
                         sav += countd.getC() + " ";
                         Date then = new Date();
                         sav += then.getMin() + " ";
                         sav += then.getSec() + "\r\n";
                    }
                    else
                    {
                        sav += "000000" + " ";
                        sav += "00 00\r\n";
                    }
                }
                tt++;
            }
            world = "Home";
            int len = sav.length();
            int len2 = len;
            //while(true)
            {
                char temp[] = sav.toCharArray();
                //int rc = c;//in.read(buffer,0,256);
                while(len > 0)//buffer[n] != null && temp[n] != null)//n < 254 && n < temp.length)
                {
                    //if(temp[n]==)
                        buffer[n] = (byte)temp[n];
                        n++;
                        len--;
                }
                //if(len <= 0) break;
                //while(len2 > 0)
                {
                    out.write(buffer,0,len2);
                    //len2--;
                }
            }
            out.close();
        }
    }
    
    class Countdown extends javax.swing.Timer implements ActionListener
    {
        private int myCounter = 0,temp = 0, index;//world.getRes("IronMine").getTime();
        private String name;
        public Countdown(int c, String nam, int i)//int count)
        {
            super(1000, null);
            myCounter = c;
            temp = c;
            name = nam;
            index = i;
            //myCounter = count;
            setRepeats(true);
            setInitialDelay(0);
            addActionListener(this);
            //this.start();
        }
        
        public void actionPerformed(ActionEvent ae)
        {
            myCounter--;
            // ...set a label to display the current time...
            bb[index].setText("Upgrading (Time: " + getFTime(myCounter) + ")");
            getWorld().getRes(name).setStatus("Upgrading");
            if (myCounter == 0)
            {
                stop();
                myCounter = temp;
                getWorld().getRes(name).incLvl();
                //world.getRes(name).setStatus("Upgrade");
                //mmButton.setText("Upgrade");
                
                int n = 0;
                for(JButton list : bb)
                {
                    bb[n].setText("Upgrade");
                    n++;
                }
                //bb[index].setText("Upgrade");
                getWorld().getRes(name).setStatus("Upgrade");
                
                if(name.equals("Factory"))
                {
                    int c = 0;
                    while(c < 4)
                    {
                        ll[c].setText(getWorld().names[c] + ": " + getWorld().getRes(getWorld().names[c]).getLvl());
                        tl[c].setText("Time: " + getWorld().getUpgradeTime(getWorld().names[c]));
                        cl[c].setText("Cost: " + getWorld().getRes(getWorld().names[c]).getCost());
                        c++;
                    }
                }
                else
                {
                    ll[index].setText(name + ": "+getWorld().getRes(name).getLvl());
                    tl[index].setText("Time: " + getWorld().getUpgradeTime(name));
                    cl[index].setText("Cost: " + getWorld().getRes(name).getCost());
                }
                //updateScreen();
                //gameOver();
            }
        }
        
        public int getC()
        {
            return myCounter;
        }
        
        public String getFTime(int c)
        {
            String temp = "";
            int ss=0,mm=0,hh=0,dd=0;
            
            dd = c / 86400;
            hh = (c / 3600) - (dd * 24);
            mm = (c / 60) - (dd * 1440) - (hh * 60);
            String tt= ""+c;
            ss = c;// % (24 / 60 / 60);tt.length()-2*10
            
            temp = dd + ":" + hh + ":" + mm + ":" + ss;
            return temp;
        }
    }
    //***************************************
    class Timer extends javax.swing.Timer implements ActionListener
    {
        private int myCounter = 0,temp = 0, index=0;//world.getRes("IronMine").getTime();
        private String name;
        public Timer()//int count)
        {
            super(1000, null);
            //myCounter = c;
            //temp = c;
            //name = nam;
            //index = i;
            //myCounter = count;
            setRepeats(true);
            setInitialDelay(0);
            addActionListener(this);
            this.start();
        }
        
        public void actionPerformed(ActionEvent ae)
        {
            myCounter++;
            // ...set a label to display the current time...
            
            //rl[0].setText("(Iron: " + (int)world.getIr() + ")");
            //world = univ.getWorld("Home");
            getWorld().updateRes();
            rl[0].setText(getWorld().getCost());
            for(Slot list : univ.slots)
            {
                if(list.getWorld().getOwner().equals(username))
                    list.getWorld().incRes();
            }
            power.setText(getPower());
            
            //if(radio1.isSelected())
                
            //if(radio2.isSelected())
                
            //if(radio3.isSelected())
                
            //if(radio4.isSelected())
                
//             int i = 0;
//             for(JButton list : bb)
//             {
//                 ll[i].setText(name + ": "+world.getRes(name).getLvl());
//                 i++;
//             }
            
//             rl[0].setText("(Iron: " + (int)world.getIr() + ")");
//             rl[0].setText("(Iron: " + (int)world.getIr() + ")");
//             rl[0].setText("(Iron: " + (int)world.getIr() + ")");
//             rl[0].setText("(Iron: " + (int)world.getIr() + ")");
//             rl[0].setText("(Iron: " + (int)world.getIr() + ")");
//             rl[0].setText("(Iron: " + (int)world.getIr() + ")");
//             rl[0].setText("(Iron: " + (int)world.getIr() + ")");
            //cent.setText(world.resToString());
            if (myCounter == -1)
            {
                stop();
                myCounter = temp;
                getWorld().getRes(name).incLvl();
                //world.getRes(name).setStatus("Upgrade");
                //mmButton.setText("Upgrade");
                
                int n = 0;
                for(JButton list : bb)
                {
                    bb[n].setText("Upgrade");
                    n++;
                }
                bb[index].setText("Upgrade");
                getWorld().getRes(name).setStatus("Upgrade");
                
                ll[index].setText(name + ": "+getWorld().getRes(name).getLvl());
                updateScreen();
                //gameOver();
            }
        }
    }
}
//                 // convert String wid to int - see Integer class
//                 int wid = Integer.parseInt(w);
//                 String p  = priceJT.getText();
//                 // convert String pr to double - see Double class
//                 double pr = (Double.valueOf(p)).doubleValue();
//                 // process information from radio buttons
//                 String type;
//                 if (wool.isSelected()) {type = "wool";}
//                 else if (nylon.isSelected()) {type = "nylon";}
//                 else {type = "mixed fibres";}  
//                 
//                 // use information to create and add carpet
//                 cm.addCarpet(des,wid,pr,type); // careful of the order of parameters
//                 
//                 // assemble string for modal dialog
//                 String result = "Carpet added" + cm.getCarpet(des);
//                 
//                 // display a modal information message dialog
//                 JOptionPane.showMessageDialog(myFrame,result);
//                 
//                 // when user responds to modal dialog "OK"
//                 //clear textfields
//                 designJT.setText("");
//                 widthJT.setText("");
//                 priceJT.setText("");