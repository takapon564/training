import java.util.Scanner;

class MaxMultiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int inputNumber = scan.nextInt();
    int halfOfInputNumber = inputNumber / 2;
    int result = halfOfInputNumber * halfOfInputNumber;
    System.out.println(result);
    }
    
}