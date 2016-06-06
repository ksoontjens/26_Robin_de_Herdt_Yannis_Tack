package hellotvxlet;

import java.awt.Graphics;
import org.dvb.ui.DVBColor;
import org.havi.ui.HComponent;

public class MijnComponent extends HComponent 
{
    
    public MijnComponent(int x, int y, int w, int h) // Constructor waar afmeting en locatie ingesteld wordt
    {
      this.setBounds(x, y, w, h);  
    }
    
    public void paint(Graphics g) // Groen bolletje wil zeggen dat je een methode overschrijft
    {
        g.setColor(new DVBColor(100,100,255,179));
        g.fillRect(10, 10, 250, 250);
        // X , Y , W, H
        
        g.setColor(new DVBColor(0,0,0,179));
        g.drawRoundRect(30, 30, 50, 50, 50, 50);
                
        /*g.setColor(Color.white);
        g.drawString("Test", 15, 20);*/
    }
}
