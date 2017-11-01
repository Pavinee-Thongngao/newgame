
package Display;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
    private int x;
    private int y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void update(){
        
    }
    public void draw1(Graphics dg){
         dg.setColor(Color.pink);
        dg.fillRect(x, y, 250, 250);//150,500
    }
     public void draw2(Graphics dg){
        dg.setColor(Color.lightGray);
        dg.fillRect(x, y, 250, 250);//1520,500
        
    }
}
