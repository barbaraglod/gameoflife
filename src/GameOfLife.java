public class GameOfLife {

    public static void simulate(int[][] initialGrid) {
        int rows = initialGrid.length;
        int cols = initialGrid[0].length;

        int[][] current = new int[rows][cols];
        int[][] next = new int[rows][cols];

        while (true) {

            printGrid(current);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); //stopping when interrupted
                break;
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {

                    int liveNeighbours = countLiveNeighbours(current, i, j);


                    if (current[i][j] == 1) {
                        if (liveNeighbours < 2) {
                            next[i][j] = 0; // dies from underpopulation
                        } else if (liveNeighbours == 2 || liveNeighbours == 3) {
                            next[i][j] = 1; // lives
                        } else if (liveNeighbours > 3) {
                            next[i][j] = 0; // dies from overpopulation
                        } else {
                            next[i][j] = 0; // default case
                        }
                    } else {
                        if (liveNeighbours == 3) {
                            next[i][j] = 1; // becomes alive
                        } else {
                            next[i][j] = 0; // stays dead
                        }
                    }
                }
            }
            
            // swap arrays
            int[][] temp = current;
            current = next;
            next = temp;
        }
    }

    private static int countLiveNeighbours(int[][] grid, int x, int y) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                // skip the cell
                if (i == 0 && j == 0) {
                    continue;
                }

                int nx = x + i;
                int ny = y + j;

                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols) {
                    if (grid[nx][ny] == 1) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }

    private static void printGrid(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    System.out.print("\u25A0");
                } else {
                    System.out.print("\u25A1");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
