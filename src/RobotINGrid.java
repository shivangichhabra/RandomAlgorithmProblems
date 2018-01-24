import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *  Imagine a robot on the upper left corner of grid with r rows and c columns.
 * The robot can only move in two directions, right and down, but certain cells
 * are "off limits" such that the robot can not step on them. Design an
 * algorithm to find a path for the robot from the top left to the bottom right.
 *
 */
public class RobotINGrid {

    class Point{
        int row;
        int col;

        public Point(int r , int c){
            row = r;
            col = c;
        }
    }

    //complexity O(XY) because we are keeping track of already visited points on graph using map
    List<Point> getPath(boolean[][] maze){
        if(maze == null || maze.length == 0 || maze[0].length == 0)
            return Collections.emptyList();

        List<Point> path = new ArrayList<>();
        Map<Point, Boolean> cache = new HashMap<>();
        if(getPaths(maze, cache, path,maze.length-1, maze[0].length-1))
            return path;
        return Collections.emptyList();
    }

    private boolean getPaths(boolean[][] maze, Map<Point, Boolean> cache, List<Point> path, int row, int col){
        if(row<0 || col <0 || !maze[row][col])
            return false;

        Point p = new Point(row, col);
        if(cache.containsKey(p)){
            return cache.get(p);
        }

        boolean isOrigin = (row == 0) && (col == 0);
        boolean success = false;

        if(!isOrigin || getPaths(maze, cache, path, row, col-1) || getPaths(maze, cache, path, row-1, col)) {
            path.add(p);
            success = true;
        }
        cache.put(p,success);
        return success;
    }
}
