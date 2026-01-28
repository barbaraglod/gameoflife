public class Game {

   static int[][] grid = CellState.grid;
   public static int neighborCount = 0;

   public static void neighborChecking() throws InterruptedException {
        for(int i=0;i < GeneratingGrid.gridSizeX-1;i++){
           for(int j=0;j < GeneratingGrid.gridSizeY-1;j++){
               if (grid[i + 1][j] == 1){
                   neighborCount++;
               }
               if (grid[i + 1][j + 1] == 1){
                   neighborCount++;
               }
               if (grid[i][j+1] == 1){
                   neighborCount++;
               }
               if (grid[i+1][j-1] == 1){
                   neighborCount++;

               }
               if (grid[i+1][j+1] == 1){}
           }
       }
   }

}
