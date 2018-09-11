package arrays;
import java.util.Scanner;
public class ArrayRotationBasic {
	public int[] rotate(int ar[],int d,int n) {
		int t, i;
		while(d!=0) {
			t = ar[n-1];
			for( i = n-1; i>0; i--) 
				ar[i] = ar[i-1];
			ar[0] = t;
		d--;
		}
		return ar;
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[], d ,n, i;
		System.out.println("Value of d? ");
		d = sc.nextInt();
		System.out.println("Value of n? ");
		n = sc.nextInt();
		ar = new int[n];
		System.out.println("Enter "+n+" elements");
		for(i = 0; i<n; i++)
			ar[i] = sc.nextInt();
		new ArrayRotationBasic().rotate(ar, d, n);
		for(i = 0; i<n; i++)
			System.out.print(ar[i]+" ");
		sc.close();
	}
}
