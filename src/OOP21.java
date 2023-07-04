public class OOP21 {
    public static void main(String[] args) {
        HanoiTower hanoiTower = new HanoiTower();
        hanoiTower.move(5, 'A', 'B', 'C');
    }
}

class HanoiTower {
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + " -> " + c);
        } else {
            move(num - 1, a, c, b);
            System.out.println(a + " -> " + c);
            move(num - 1, b, a, c);
        }
    }
}