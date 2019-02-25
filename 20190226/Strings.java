import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.next();
        int number = scan.nextInt();
        String [] arrayOfString = inputString.split("");
        List<String> listOfString = new ArrayList<String>();
        String stringBuilder = "";
        for(int i = 0; i < arrayOfString.length; i ++) {
            stringBuilder = arrayOfString[i];
            for(int j =  0; j < arrayOfString.length; j ++){
                listOfString.add(String.join("", stringBuilder, arrayOfString[j]));
            }
            // System.out.println(listOfString.get(i));
        }
        System.out.println(listOfString.get(number - 1));
    }
}