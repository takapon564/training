import java.util.Scanner;
import java.util.Arrays;

public class Mamemaki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;

        int [] d = {a, b, c};
        Arrays.sort(d);
        if(d[0] == a){x=1;} else if(d[1] == a){x = 2;} else if(d[2] == a) {x = 3;}
        if(d[0] == b){y=1;} else if(d[1] == b){y = 2;} else if(d[2] == b) {y = 3;}
        if(d[0] == c){z=1;} else if(d[1] == c){z = 2;} else if(d[2] == c) {z = 3;}
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}