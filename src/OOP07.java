import java.sql.SQLOutput;

public class OOP07 {
    public static void main(String[] args) {
        int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};

        MyTool myTool = new MyTool();
        myTool.print(map);
        myTool.print(map);
    }
}

class MyTool {
    public void print(int[][] arr) {
        System.out.println("=====================");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}