
package Display;

import javax.swing.JFrame;

public class MainClass extends JFrame {
     public MainClass(String string){
        super(string);
    }
    public static void main(String[] args) {
        MainClass s = new MainClass("Game E5");
        s.setSize(1920,1080);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setResizable(false); //ขยายหน้าจอไม่ได้นะ
        s.setLocationRelativeTo(null);
        s.add(new Game());
        s.setVisible(true);
    }
   

}
