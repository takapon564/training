import java.util.Scanner;

class Add {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String linkedString = a + b; 

        int resultNumber = Integer.parseInt(linkedString);
        System.out.println(resultNumber * 2);
    }
}