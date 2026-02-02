import java.util.Scanner;

public class GeneratingGrid {
    static int[][] grid;
    static final int gridSizeX = 30;
    static final int gridSizeY = 30;
    static final Scanner scanner = new Scanner(System.in);
    
    public static int[][] randomGrid() {
        grid = new int[gridSizeX][gridSizeY];

        for (int i = 0; i < gridSizeX; i++) {
            for (int j = 0; j < gridSizeY; j++) {
                grid[i][j] = randomNumber();
            }
        }
        
        return grid;
    }

    public static int randomNumber() {
        double randomNumber = Math.random();
        if (randomNumber > 0.5) {return 1;}
        return 0;
    }

    public static int[][] manualGrid() {
        grid = new int[gridSizeX][gridSizeY];
        
        System.out.println("Enter " + gridSizeX + " lines, each with " + gridSizeY + " characters (0 or 1):");
        for (int i = 0; i < gridSizeX; i++) {
            String input = scanner.nextLine();

            for (int j = 0; j < gridSizeY; j++) {
                if (j < input.length()) {
                    if (input.charAt(j) == '1') {
                        grid[i][j] = 1;
                    } else {
                        grid[i][j] = 0;
                    }
                } else {
                    grid[i][j] = 0;
                }
            }
        }
        
        return grid;
    }
}
