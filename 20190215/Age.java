import java.util.Scanner;
import java.util.Arrays;
public class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int [] me = {a,b,c};
        Arrays.sort(me);
        System.out.println(me[1]);
    }
}