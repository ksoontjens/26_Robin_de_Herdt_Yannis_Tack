package hellotvxlet;

import javax.tv.xlet.Xlet;
import javax.tv.xlet.XletContext;

import java.awt.Color;

import java.awt.event.ActionEvent;
import org.dvb.ui.DVBColor;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;

public class HelloTVXlet implements Xlet, HActionListener 
{
    HScene scene;
    HTextButton button1, button2, button3, button4;
    
    public HelloTVXlet() 
    {
       
    }

    public void initXlet(XletContext context) 
    {
        System.out.println("Init");
        scene = HSceneFactory.getInstance().getDefaultHScene();
    }

    public void startXlet() 
    {
        HStaticText label1 = new HStaticText("Wat is het grootste?",60,100,600,60);
        
        button1 = new HTextButton("Range Rover", 60, 300,280,60);
        button2 = new HTextButton("De Maan", 360,300,280,60);
        button3 = new HTextButton("Olifant", 60, 400,280,60);
        button4 = new HTextButton("Nieuwsgierigheid", 360,400,280,60);
        
        label1.setBackground(Color.BLACK);
        label1.setBackgroundMode(HVisible.BACKGROUND_FILL);
        
        // Button init
        button1.setBackground(new DVBColor(255,0,0,127));
        button1.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button1.setActionCommand("btn1click"); 
        button1.addHActionListener(this);
        
        button2.setBackground(new DVBColor(255,0,0,127));
        button2.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button2.setActionCommand("btn2click"); 
        button2.addHActionListener(this);
        
        button3.setBackground(new DVBColor(255,0,0,127));
        button3.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button3.setActionCommand("btn3click"); 
        button3.addHActionListener(this);
        
        button4.setBackground(new DVBColor(255,0,0,127));
        button4.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button4.setActionCommand("btn4click"); 
        button4.addHActionListener(this);
        
        //Knoppen focussen UP DOWN LEFT RIGHT
        button1.setFocusTraversal(null, button3, null, button2);
        button2.setFocusTraversal(null, button4, button1, null);
        button3.setFocusTraversal(button1, null, null, button4);
        button4.setFocusTraversal(button2, null, button3, null);
        
        scene.add(button1);
        scene.add(button2);
        scene.add(button3);
        scene.add(button4);
        scene.add(label1);
        
        scene.validate();
        scene.setVisible(true);
        button1.requestFocus();
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    
    public void actionPerformed(ActionEvent event) 
    {
        System.out.println(event.getActionCommand());
        
        if (event.getActionCommand().equals("btn1click")) 
        {
            button1.setBackground(new DVBColor(60,7,7,127));
            //button4.setBackground(new DVBColor(10,7,60,127));
        }
        if (event.getActionCommand().equals("btn2click")) 
        {
            button2.setBackground(new DVBColor(60,7,7,127));
            //button4.setBackground(new DVBColor(10,7,60,127));
        }
        if (event.getActionCommand().equals("btn3click")) 
        {
            button3.setBackground(new DVBColor(60,7,7,127));
            //button4.setBackground(new DVBColor(10,7,60,127));
        }
        if (event.getActionCommand().equals("btn4click")) 
        {
            button4.setBackground(new DVBColor(72,144,61,127));
        }
        
    }
}
