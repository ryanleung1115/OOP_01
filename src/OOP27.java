public class OOP27 {
    public static void main(String[] args) {
        TT tt = new TT();
        String result = tt.showScore("jason", 100, 99, 80);
        System.out.println(result);
    }
}

class TT {
    public String showScore(String name, double... scores) {
        double totalScore = 0;
        for (int i = 0; i < scores.length; i++) {
            totalScore += scores[i];
        }
        return "total score of " + name + " = " + totalScore;
    }
}