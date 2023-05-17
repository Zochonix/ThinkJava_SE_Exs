import javax.swing.JFrame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Conway {

    private GridCanvas grid;

    public static void main(String[] args) {

        String title = "Conway's Game of Life";
        Conway game = new Conway("glider.rle");
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(game.grid);
        frame.pack();
        frame.setVisible(true);
        game.mainLoop();
        
    }

    public Conway() {

        grid = new GridCanvas(5, 5, 40);
        grid.turnOn(1, 2);
        grid.turnOn(2, 3);
        grid.turnOn(3, 1);
        grid.turnOn(3, 2);
        grid.turnOn(3, 3);

    }

    public Conway(String path) {

        try {

            File file = new File(path);
            Scanner scan = new Scanner(file);
            ArrayList<String> input = new ArrayList<>();
            StringBuilder extensionNameBuilder = new StringBuilder();
            String inputLine = "";

            extensionNameBuilder.append(path);
            extensionNameBuilder.reverse();

            extensionNameBuilder.replace(
                
            0,
            extensionNameBuilder.length(),
            extensionNameBuilder.substring(0,
            extensionNameBuilder.indexOf("."))
            
            );

            extensionNameBuilder.reverse();

            String extensionName = extensionNameBuilder.toString();

            if (extensionName.equals("rle")) {

                while (scan.hasNextLine()) {

                    inputLine = scan.nextLine();
    
                    if (inputLine.charAt(0) != '#'
                    && inputLine.charAt(1) != 'C') {
    
                        input.add(inputLine);
    
                    }
    
                }

                scan.close();

                String gridPropertiesLine = input.get(0);
                int rows = 0;
                int cols = 0;

                for (int i = 0;
                i < gridPropertiesLine.length();
                i++) {

                    if (gridPropertiesLine.charAt(i) == 'x' || gridPropertiesLine.charAt(i) == 'y') {

                        StringBuilder propertyBuilder = new StringBuilder();

                        for (int j = i; j < gridPropertiesLine.length(); j++) {

                            if (Character.isDigit(gridPropertiesLine.charAt(j))) {

                                for (int k = j; k < gridPropertiesLine.length(); k++) {

                                    if (Character.isDigit(gridPropertiesLine.charAt(k))) {

                                        propertyBuilder.append(
                                            gridPropertiesLine.charAt(k));

                                    }

                                    else {

                                        break;

                                    }

                                }

                                break;

                            }

                        }

                        if (gridPropertiesLine.charAt(i) == 'x') {

                            cols = Integer.parseInt(propertyBuilder.toString());
                            System.out.println("Number of columns " + cols);

                        }

                        if (gridPropertiesLine.charAt(i) == 'y') {

                            rows = Integer.parseInt(propertyBuilder.toString());
                            System.out.println("Number of rows " + rows);

                        }

                    }

                }

                grid = new GridCanvas(rows, cols, 20);

                for (int i = 0; i < input.size(); i++) {
    
                    // $2bo$3bo$b3o! (input position: 1) (i = 1)
                    String inputRow = input.get(i);
                    int yPos = 0;
                    int xPos = 0;

                    for (int j = 0; j < inputRow.length(); j++) {

                        if (inputRow.charAt(j) == '$') {

                            yPos = yPos + 1;
                            xPos = 0;

                        }

                        if (inputRow.charAt(j) == 'b') {

                            if (Character.isDigit(inputRow.charAt(j - 1))) {
                                
                                xPos = xPos + Character.getNumericValue(inputRow.charAt(j - 1));

                            }

                            else {

                                xPos = xPos + 1;

                            }

                        }

                        if (inputRow.charAt(j) == 'o') {

                            if (Character.isDigit(inputRow.charAt(j - 1))) {

                                int additive = Character.getNumericValue(inputRow.charAt(j - 1));
                                
                                for (int k = 0; k < additive; k++) {

                                    grid.turnOn(yPos, xPos + k);

                                }

                            }

                            else {

                                grid.turnOn(yPos, xPos);

                            }

                        }

                        if (inputRow.charAt(j) == '!') {

                            break;

                        }

                    }
    
                }

            }

            else {

                while (scan.hasNextLine()) {

                    inputLine = scan.nextLine();
    
                    if (inputLine.charAt(0) != '!') {
    
                        input.add(inputLine);
    
                    }
    
                }
    
                scan.close();
    
                int rows = input.size();
                int cols = input.get(0).length();
                grid = new GridCanvas(rows, cols, 20);
    
                // Turn on all the O cells.
    
                for (int i = 0; i < rows; i++) {
    
                    String gridRow = input.get(i);
    
                    for (int j = 0; j < cols; j++) {
    
                        if (gridRow.charAt(j) == 'O') {
    
                            grid.turnOn(i, j);
    
                        }
    
                    }
    
                }
    
            }

        }

        catch (FileNotFoundException e) {

            e.printStackTrace();
            System.exit(1);

        }

    }
    
    private void mainLoop() {

        while (true) {

            this.update();
            grid.repaint();

            try {

                Thread.sleep(500);

            }

            catch (InterruptedException e) {



            }

        }

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

            if (count < 2 || count > 3) {

                // Any live cell with fewer than two live neighbors dies,
                // as if by underpopulation.
                // Any live cell with more than three live neighbors dies,
                // as if by overpopulation.

                cell.turnOff();

            }

        }
        
        else {

            if (count == 3) {

                // Any dead cell with exactly three live neighbors
                // becomes a live cell, as if by reproduction.

                cell.turnOn();

            }

        }

    }

}
