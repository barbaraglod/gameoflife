import java.util.*;

public class Main{
    static public Scanner scanner = new Scanner(System.in);
    static String option;
    static int[][] grid;

    
    public static void main(String[] args) {
        choosingOption();
    }
    
    public static void choosingOption() {
        System.out.println("Type -Random- for a random grid,");
        System.out.println("or type -Enter manually- to enter the grid using 0 and 1.");
        option = scanner.nextLine();

        if (option.equalsIgnoreCase("Random")) {
            grid = GeneratingGrid.randomGrid();
            GameOfLife.simulate(grid);
        } else if (option.equalsIgnoreCase("Enter manually")) {
            grid = GeneratingGrid.manualGrid();
            GameOfLife.simulate(grid);
        } else {
            System.out.println("Invalid option");
        }
    }
}
