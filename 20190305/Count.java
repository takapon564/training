import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        String [] arrayOfString = inputString.split("");

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 0); 
        map.put("B", 0);
        map.put("C", 0);
        map.put("D", 0); 
        map.put("E", 0); 
        map.put("F", 0);  

        for(String stringRunner : arrayOfString) {
            if(map.containsKey(stringRunner)) {
                map.put(stringRunner, map.get(stringRunner) +1);
            }
        }
        
        System.out.print(map.get("A") + " ");
        System.out.print(map.get("B") + " ");
        System.out.print(map.get("C") + " ");
        System.out.print(map.get("D") + " ");
        System.out.print(map.get("E") + " ");
        System.out.print(map.get("F") + " ");
        
    }
}