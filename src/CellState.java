import java.util.*;

public class CellState {
    public Scanner scanner = new Scanner(System.in);
    String option;
    static int[][] grid;

    public void choosingOption() {
        option = scanner.nextLine();

        if (option.equals("Random")) {
            //generate grid function
            grid = GeneratingGrid.randomGrid();
            printGrid();
        }else if (option.equals("Enter manually")) {
            //manually enter function
            grid = GeneratingGrid.manualGrid();
           printGrid();
        }else System.out.println("Invalid option");
    }



    public void printGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");

            }
            System.out.println();
        }
    }
}