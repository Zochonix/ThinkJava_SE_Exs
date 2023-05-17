/* Solution for 16.2 */

public class BrianBrain extends Automaton {

    public static void main(String[] args) {

        String title = "Brian's Brain";
        BrianBrain game = new BrianBrain(60, 60);
        game.run(title, 1);

    }

    public BrianBrain(int rows, int cols) {

        grid = new GridCanvas(rows, cols, 10);
        grid.turnOn(1, 2);
        grid.turnOn(2, 3);
        grid.turnOn(3, 1);
        grid.turnOn(3, 2);
        grid.turnOn(3, 3);

    }

    public void update() {

        int[][] counts = countNeighbors();
        updateGrid(counts);

    }

    private int[][] countNeighbors() {

        int rows = grid.numRows();
        int cols = grid.numCols();
        int[][] counts = new int[rows][cols];

        for (int r = 0; r < rows; r++) {

            for (int c = 0; c < cols; c++) {

                counts[r][c] = countAlive(r, c);

            }

        }
        
        return counts;

    }

    private int countAlive(int r, int c) {

        int count = 0;
        count += grid.test(r - 1, c - 1);
        count += grid.test(r - 1, c);
        count += grid.test(r - 1, c + 1);
        count += grid.test(r, c - 1);
        count += grid.test(r, c + 1);
        count += grid.test(r + 1, c - 1);
        count += grid.test(r + 1, c);
        count += grid.test(r + 1, c + 1);
        
        return count;

    }

    private void updateGrid(int[][] counts) {

        int rows = grid.numRows();
        int cols = grid.numCols();

        for (int r = 0; r < rows; r++) {

            for (int c = 0; c < cols; c++) {

                Cell cell = grid.getCell(r, c);
                updateCell(cell, counts[r][c]);

            }

        }

    }

    private static void updateCell(Cell cell, int count) {

        if (cell.isOn()) {

            cell.setDying();

        }

        else if (cell.isDying()) {

            /* As far as I'm aware, dying cells can't be "revived" with having alive cells around them. */

            cell.turnOff();

        }
        
        else {

            if (count == 2) {

                cell.turnOn();

            }

        }

    }
    
}
