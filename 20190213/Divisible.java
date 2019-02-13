import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1AsString = scan.next();
        String num2AsString = scan.next();
        int num1 = Integer.parseInt(num1AsString);
        int num2 = Integer.parseInt(num2AsString);
        if(num1 % num2 == 0) {
            System.out.println("YES");
        }
    }
}