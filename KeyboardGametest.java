import javax.swing.JFrame;

public class KeyboardGametest {
    public static void main(String[] args) {
        JFrame main = new JFrame();
        KeyboardGame test = new KeyboardGame();
        main.add(test);
        main.setVisible(true);
        main.setSize(400, 400);
    }
}
