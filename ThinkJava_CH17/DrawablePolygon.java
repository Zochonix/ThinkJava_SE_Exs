import java.awt.Polygon;
import java.awt.Color;
import java.awt.Graphics;

public class DrawablePolygon extends Polygon implements Actor {

    public Color color;

    public DrawablePolygon() {

        super();
        color = Color.GRAY;

    }

    public void draw(Graphics g) {

        g.setColor(color);
        g.fillPolygon(this);

    }

    public void step() {}

    // Ex17.1

    @Override
    public String toString() {

        String points = "";

        for (int i = 0; i < this.npoints; i++) {

            points = points + "(" + this.xpoints[i] + ", " + this.ypoints[i] + ")";

            if (i != this.npoints - 1) {

                points = points + ",\n";

            }

        }

        return points;

    }

}