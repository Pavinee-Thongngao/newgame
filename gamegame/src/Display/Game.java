
package Display;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.event.ActionListener;



public class Game extends JPanel implements ActionListener {
    Player Player1;
    Player Player2;
    
    public Game(){
        Player1 = new Player(150,500);
        Player2 = new Player(1520,500);
        
    }
     public void paint(Graphics dg){
        dg.setColor(Color.ORANGE);
        dg.fillRect(0, 750, 1920, 750);
        Player1.draw1(dg);
        Player2.draw2(dg);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }    

    
}
