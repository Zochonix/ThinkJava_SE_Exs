import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class ExC_1 extends Canvas {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Flag of Japan");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ExC_1 drawing = new ExC_1();
		drawing.setSize(600, 300);
		frame.add(drawing);
		frame.pack();
		frame.setVisible(true);

	}

	public void paint(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRoundRect(50, 50, 500, 200, 10, 10);
		g.setColor(Color.RED);
		g.fillOval(250, 100, 100, 100);
		

	}

}