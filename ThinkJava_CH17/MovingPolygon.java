import java.awt.Color;
import java.awt.Graphics;

public class MovingPolygon extends RegularPolygon {
    
    private int dx;
    private int dy;
    private Drawing drawing;


    public MovingPolygon(int nsides, int radius, Color color, Drawing drawing) {

        super(nsides, radius, color);
        dx = 5;
        dy = 5;
        this.drawing = drawing;

    }

    @Override
    public void draw(Graphics g) {

        super.draw(g);

    }

    @Override
    public void step() {

        handleWallCollision();
        handleCollision();

    }

    public void handleWallCollision() {

        for (int i = 0; i < this.npoints; i++) {

            if (this.xpoints[i] > drawing.getWidth()) {

                dx = -dx;
                this.translate(dx, dy);

            }

            if (this.xpoints[i] < 0) {

                dx = -dx;
                this.translate(dx, dy);

            }

            if (this.ypoints[i] > drawing.getHeight()) {

                dy = -dy;
                this.translate(dx, dy);

            }

            if (this.ypoints[i] < 0) {

                dy = -dy;
                this.translate(dx, dy);

            }

        }

        this.translate(dx, dy);

    }

    @Override
    public void handleCollision() {

        

    }
    
}
