import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.Random.*;
import javax.swing.*;

import javax.swing.JPanel;

public class CatchingFlashingBall extends JPanel implements ActionListener, MouseListener {
    Random test =new Random();
    Timer timer = new Timer(500,new TimerListener());
    int ballx=40;
    int bally=40;
    int direction=20;
    Color temp = Color.yellow;
    CatchingFlashingBall(){
        this.addMouseListener(this);
        this.setFocusable(true);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(temp);
        g.fillOval(ballx, bally, 20, 20);
    }



    double CalculateDistance(int x1,int y1, int x2 , int y2){
        return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
            
    }
    

    @Override
    public void mousePressed(MouseEvent e) {  
         if ( CalculateDistance(ballx+10, bally+10,  e.getX(), e.getY()) <=10){
            // System.out.println(CalculateDistance(ballx+10, bally+10,  e.getX(), e.getY()));
            timer.stop();
            temp= Color.RED;
            repaint();
         }
         else{
         timer.start();
         temp= Color.yellow;
         repaint();
        //  System.out.println(CalculateDistance(ballx+10, bally+10,  getX(), getY()) );
         }
         
    }

class TimerListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
       ballx = test.nextInt(180);
       bally = test.nextInt(180);
       
       repaint();
        
    }
}

@Override
public void mouseClicked(MouseEvent e) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
}

@Override
public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
}

@Override
public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
}

@Override
public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
}

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}



}

