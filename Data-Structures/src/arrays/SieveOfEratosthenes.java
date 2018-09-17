package arrays;
public class SieveOfEratosthenes {
	public static void main(String[] args) {
		int n = 50,j, i, d;
		int p[] = new int[n];
		boolean marked[] = new boolean[n];
		for( i = 2; i<n; i++) {
			p[i] = i;
			marked[i] = false;
		}
		for(i = 2; i<n; i++) {
			if(marked[i] == false) {
				for(j = i+1; j<n; j++) 
					if(j%p[i] == 0) 
						marked[j] = true;
			}	
		}
		for(d = 2; d<n; d++) {
				if(marked[d]==false)
					System.out.println(d);
		}
	}
}