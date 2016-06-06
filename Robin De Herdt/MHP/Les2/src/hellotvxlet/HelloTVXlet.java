package hellotvxlet;

import java.awt.Image;
import javax.tv.xlet.Xlet;
import javax.tv.xlet.XletContext;


import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;


// Implement all abstract methods
public class HelloTVXlet implements Xlet {

    HScene scene;
    
    public HelloTVXlet() {
       
    }

    public void initXlet(XletContext context) {
        System.out.println("Init");
        scene = HSceneFactory.getInstance().getDefaultHScene();
    }

    public void startXlet() {
        
        MijnComponent mc = new MijnComponent(0,0,100,100);
        
        scene.add(mc);
        
        scene.validate();
        scene.setVisible(true);
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
}
