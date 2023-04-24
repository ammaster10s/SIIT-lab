import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.random.*;

import javax.swing.*;
public class KeyboardGame extends JPanel implements KeyListener, ActionListener{

        char randomletter;
        int Score;
        char response;


        Timer counttimer = new Timer(1000, this);

        KeyboardGame(){
            this.addKeyListener(this);
            this.setFocusable(true);
            counttimer.start();
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            randomletter = getRandomChar();
            repaint();
        }
        
      
        @Override
        protected void paintComponent(Graphics g) {
            g.setFont(new Font("Serif", Font.BOLD, 40));
            g.drawString("Letter: " + randomletter, 75, 75);
            g.drawString("You Typed :" +response,75,150);
            g.drawString("Your Score: " +Score ,75,225);

        }
        @Override
        public void keyTyped(KeyEvent e) {
            this.response = e.getKeyChar();
            if (response == randomletter ){
                Score ++;
            }
            repaint();
        
        }
        

        public char getRandomChar(){
            Random random = new Random();
            return (char)(65+random.nextInt(26));
        }
    
}