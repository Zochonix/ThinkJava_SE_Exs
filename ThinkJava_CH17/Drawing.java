import java.awt.Canvas;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

public class Drawing extends Canvas {

    private ArrayList<Actor> list;

    public Drawing(int width, int height) {

        setSize(width, height);
        setBackground(Color.WHITE);
        list = new ArrayList<Actor>();

    }

    public void add(Actor cp) {

        list.add(cp);

    }

    public void paint(Graphics g) {

        for (Actor dp : list) {

            dp.draw(g);

        }

    }

    public void step() {

        for (Actor dp : list) {

            dp.step();

        }

        repaint();

    }
    
}
