import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        int result = 0;
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        if(number1 == number2 && number1 != number3) {
            result = number3;
        }else if(number2 != number3){
            result = number2;
        }
        System.out.println(result);
    }
}