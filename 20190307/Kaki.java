import java.util.Scanner;

class Kaki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for(int i = 0; i < 12; i ++) {
            String inputString = scanner.next();
            String[] arrayOfString = inputString.split("");
            for(int j = 0; j < arrayOfString.length; j ++) {
                if("r".equals(arrayOfString[j])) {
                    counter ++;
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}