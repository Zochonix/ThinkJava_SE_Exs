import java.awt.Canvas;
import java.awt.Graphics;

public class GridCanvas extends Canvas {

    private Cell[][] array;

    public GridCanvas(int rows, int cols, int size) {

        array = new Cell[rows][cols];

        for (int r = 0; r < rows; r++) {

            int y = r * size;

            for (int c = 0; c < cols; c++) {

                int x = c * size;
                array[r][c] = new Cell(x, y, size);

            }

        }

        setSize(cols * size, rows * size);

    }

    public void draw(Graphics g) {

        for (Cell[] row : array) {

            for (Cell cell : row) {

                cell.draw(g);

            }

        }

    }

    public void paint(Graphics g) {

        draw(g);

    }

    public int numRows() {

        return array.length;

    }

    public int numCols() {

        return array[0].length;

    }

    public Cell getCell(int r, int c) {

        return array[r][c];

    }

    public void turnOn(int r, int c) {

        array[r][c].turnOn();

    }

    // Ex 15.1

    public int countOn(int r, int c) {

        int activeCells = 0;

        for (Cell[] row : array) {

            for (Cell cell : row) {

                if (cell.isOn()) {

                    activeCells = activeCells + 1;

                }

            }

        }

        return activeCells;

    }

    public int test(int r, int c) {

        try {

            // Ex15.2 (Incomplete)

            if (c > numCols()) {

                c = c - numCols();

            }

            if (r > numRows()) {

                r = r - numRows();

            }

            if (c < 0) {

                c = c + numCols();

            }

            
            if (r < 0) {

                r = r + numRows();

            }

            if (array[r][c].isOn()) {

                return 1;

            }

        }

        catch (ArrayIndexOutOfBoundsException e) {

        }

        return 0;

    }
    
}
