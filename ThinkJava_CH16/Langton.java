public class Langton extends Automaton {

    private int xpos;
    private int ypos;
    private int head;

    public static void main(String[] args) {

        String title = "Langton's Ant";
        Langton game = new Langton(61, 61);
        game.run(title, 1);
        
    }

    public Langton(int rows, int cols) {

        grid = new GridCanvas(rows, cols, 10);
        xpos = rows / 2;
        ypos = cols / 2;
        head = 0;

    }

    public void update() {

        flipCell();
        moveAnt();

    }

    private void flipCell() {

        Cell cell = grid.getCell(xpos, ypos);

        if (cell.isOff()) {

            // at a white square; turn right and flip color
            head = (head + 1) % 4;
            cell.turnOn();

        }
        
        else {

            // at a black square; turn left and flip color
            head = (head + 3) % 4;
            cell.turnOff();

        }

    }

    private void moveAnt() {

        if (head == 0) {

            ypos -= 1;

        }
        
        else if (head == 1) {

            xpos += 1;

        }
        
        else if (head == 2) {

            ypos += 1;

        }
        
        else {

            xpos -= 1;

        }

    }



}