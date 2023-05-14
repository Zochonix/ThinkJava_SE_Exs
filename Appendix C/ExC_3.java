import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class ExC_3 extends Canvas {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Moire Pattern");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new ExC_3();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.WHITE);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

    }

    public void paint(Graphics g) {

        int i = 90;

        while (i < getWidth()) {

            g.drawOval(155, 155, i, i);
            i = i + 30;

        }

    }

}