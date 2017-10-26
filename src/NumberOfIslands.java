/**
 * Created by Shivangi on 6/27/2017.
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    mergeNeighbours(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void mergeNeighbours(char[][] grid, int i, int j){
        if(i < 0 || i > grid.length-1 || j< 0 || j> grid[0].length-1 || grid[i][j] != '1')
            return;

        grid[i][j] = 'x';
        mergeNeighbours(grid, i+1, j);
        mergeNeighbours(grid, i-1, j);
        mergeNeighbours(grid, i, j+1);
        mergeNeighbours(grid, i, j-1);
    }

    public static void main(String args[]){
        NumberOfIslands i = new NumberOfIslands();
        char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.println(i.numIslands(grid));
    }
}
