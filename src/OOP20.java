public class OOP20 {
    public static void main(String[] args) {
        Maze maze = new Maze();
        maze.showMap();
        // initial position
        maze.findWay(1, 1);
        System.out.println("find way...");
        System.out.println("=====================");
        maze.showMap();
    }
}

class Maze {
    int[][] map = new int[8][7];

    public void showMap() {
        // create map
        // 1: wall
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;
        // map[2][1] = 1;
        // map[1][2] = 1;
        map[2][2] = 1;

        // show map
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean findWay(int i, int j) {
        // target is found
        if (map[6][5] == 2) {
            return true;
        } else {
            // current position is accessible
            if (map[i][j] == 0) {
                // current position is done
                map[i][j] = 2;
                // try different directions
                if (findWay(i + 1, j)) {            // downwards
                    return true;
                } else if (findWay(i, j + 1)) {     // rightwards
                    return true;
                } else if (findWay(i - 1, j)) {     // upwards
                    return true;
                } else if (findWay(i, j - 1)) {     // leftwards
                    return true;
                } else {
                    // all directions are not accessible
                    map[i][j] = 3;
                    return false;
                }
            } else {
                // current position is not accessible
                return false;
            }
        }
    }
}