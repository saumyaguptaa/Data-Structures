package arrays;

public class MOsAlgo {
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 1 ,3, 4, 5, 2, 8};
		int[] query = {1,2,3,2,2,6};
		int i, j, begin, end, sum = 0;
		for(i = 0; i< query.length; i=i+2) {
			begin = query[i];
			end = query[i+1];
			for(j = begin; j<= end; j++) {
				sum += arr[j];
				System.out.println(sum);
			}
			sum = 0;
		}			
	}
}
