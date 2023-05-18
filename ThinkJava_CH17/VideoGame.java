import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.Timer;


public class VideoGame implements ActionListener {

    private Drawing drawing;
    private Toolkit toolkit;

    public static void main(String[] args) {

        VideoGame game = new VideoGame();
        Timer timer = new Timer(1, game);
        timer.start();
        
    }
    
    public VideoGame() {

        drawing = new Drawing(800, 600);
        Sprite sprite = new Sprite("face-smile.png", 25, 150);
        DrawablePolygon polygon = new MovingPolygon(6, 50, Color.ORANGE, drawing);
        polygon.translate(250, 120);
        drawing.add(sprite);
        drawing.add(polygon);
        drawing.addKeyListener(sprite);
        drawing.setFocusable(true);

        JFrame frame = new JFrame("Video Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
        toolkit = frame.getToolkit();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        drawing.step();
        toolkit.sync();

    }

}