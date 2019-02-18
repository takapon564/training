import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfQuiz = scan.nextInt();
        String result = numberOfQuiz == 1 ? "ABC" : "chokudai";
        System.out.println(result);
    }
}