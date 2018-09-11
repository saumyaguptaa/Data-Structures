package arrays;

//import java.util.Arrays;
import java.util.HashSet;

public class RearrangeMinus1 {
	public static void main(String[] args) {
		int ar[] = {1, 22, 33, 44, 55, 67,3, 9, 5, 2 ,100};
/*		int out[] = new int[ar.length];
		Arrays.fill(out, -1);
		
		int loc;
		for(loc = 0; loc<ar.length; loc++) {			
			for(int i:ar) {
				 if(i== loc) 
					 out[loc] = loc;
			}
		}
		for(int i:out)
			System.out.print(i + " "); */
		
		HashSet<Integer> out = new HashSet<Integer>();
		for(int i = 0; i<ar.length;i++)
			out.add(ar[i]);
		for(int i=0; i<ar.length; i++) {
			if(out.contains(i))
				ar[i] = i;
			else
				ar[i] = -1;
		}
		for(int i:ar)
			System.out.print(i + " "); 
			
	}
}