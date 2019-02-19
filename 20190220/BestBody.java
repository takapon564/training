import java.util.Scanner;

class BestBody {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int period = scan.nextInt();
        int minBestWeight = scan.nextInt();
        int maxBestWeight = scan.nextInt();
        int firstWeight = scan.nextInt();
        int bestBodyOfCounter = 0;
        int changeOfweight = 0;

        for(int i = 1; i < period; i ++) {
            changeOfweight = scan.nextInt();
            firstWeight += changeOfweight;
            if(firstWeight >= minBestWeight && firstWeight <= maxBestWeight) {
                bestBodyOfCounter += 1;
            }
        }
        System.out.println(bestBodyOfCounter);
    }
}