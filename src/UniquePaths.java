
public class UniquePaths {
    /*
     * No obstacle
     */
    public int uniquePathsOne(int m, int n) {
        int[][] path = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0)
                    path[i][j] = 1;
                else
                    path[i][j] = path[i-1][j] + path[i][j-1]; 
            }
        }
        return path[m-1][n-1];
    }
	
    /*
     * With Obstacle
     */
    public int uniquePathsWithObstaclesTwo(int[][] obstacleGrid) {
        int n = obstacleGrid[0].length;
        int[] path = new int[n];
        
        path[0] = 1;
        
        for(int[] row : obstacleGrid){
            for(int j=0; j<n; j++){
                if(row[j] == 1)
                    path[j] = 0;
                else if (j >0)
                    path[j] += path[j-1];
            }
        }
        return path[n-1];
    }
	
    /*
     * With Obstacle
     */
    public int uniquePathsWithObstaclesThree(int[][] obstacleGrid) {
        if(obstacleGrid.length == 0) return 0;

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] path = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(obstacleGrid[i][j] == 1){
                    path[i][j] = 0;
                } else if(i == 0 && j==0){
                    path[i][j] = 1;
                } else if(i==0) {
                    path[i][j] += path[i][j-1];
                } else if(j==0) {
                    path[i][j] += path[i-1][j];
                } else{
                    path[i][j] += path[i-1][j] + path[i][j-1];
                }
            }
        }
        return path[m-1][n-1];
    }
}
