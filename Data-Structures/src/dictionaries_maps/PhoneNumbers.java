package dictionaries_maps;


import java.util.HashMap;
import java.util.Scanner;
public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String name;
        String temp[] = new String[2];    
    
        HashMap map = new HashMap<>();
        for(int i =0; i<n; i++) {
            String s = sc.nextLine();    
            temp = s.split(" ");
            map.put(temp[0], temp[1]);
        }
    
        while(sc.hasNext()) {
            name = sc.nextLine();
            if(map.containsKey(name))
                System.out.println(name+"="+map.get(name));
            else
                System.out.println("Not found");
        }
    }
}