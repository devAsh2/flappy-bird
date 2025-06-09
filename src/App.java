import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int broadWidth = 360;
        int broadHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        // frame.setVisible(true);
        //set the window size 
        frame.setSize(broadWidth, broadHeight);
        //places the window at the center of the screen
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
