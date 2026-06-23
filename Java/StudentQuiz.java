import java.util.*;

public class StudentQuiz {

    public static void Compare(char[] cor, char[] ans) {
        int correct = 0;
        int wrong = 0;
        for (int i = 0; i < ans.length; i++) {
            if (cor[i] == ans[i]) {
                correct++;
            } else {
                wrong++;
                System.out.println("Q" + (i+1) + " Wrong! Correct answer: " + cor[i]);
            }
        }
        System.out.println("No. of correct answers: " + correct);
        System.out.println("No. of wrong answers: " + wrong);
        System.out.println("Score: " + correct + "/" + cor.length);
        double percentage = (correct * 100.0) / cor.length;
        System.out.println("Percentage: " + percentage + "%");
    }

    public static char[] StudAns() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the correct Answer (A, B, C, or D)");
        char[] ans = new char[5];
        for (int i = 0; i < 5; i++) {
            char choice;
            do {
                System.out.print("Question " + (i+1) + " Answer: ");
                choice = Character.toUpperCase(sc.next().charAt(0));
            } while (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D');
            ans[i] = choice;
        }
        sc.close();
        return ans;
    }

    public static void main(String[] args) {
        char[] correct = { 'A', 'B', 'C', 'D', 'A' };
        char[] ans = StudAns();
        Compare(correct, ans);
    }
}
