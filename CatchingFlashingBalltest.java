import javax.swing.JFrame;

public class CatchingFlashingBalltest {
    public static void main(String[] args) {
        JFrame main = new JFrame();
        CatchingFlashingBall test = new CatchingFlashingBall();
        main.add(test);
       
        main.setSize(200,200);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
