import java.util.Scanner;
class KingOfAdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String twoDigitNumber = scan.next();
        String [] arrayOfString = twoDigitNumber.split("");
        int totalNumber = 0;
        for(String numberAsString : arrayOfString) {
            totalNumber += Integer.parseInt(numberAsString);
        }
        System.out.println(totalNumber); 
    }
}