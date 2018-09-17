package strings;

public class WaysToDecode {
	public int num_ways(int data) {
		int n = 0;
		
		for(int i =0; i<Integer.toString(data).length(); i++) {
			if(Integer.toString(data).charAt(i)!=0)
				n+=1;
		}
		n += Integer.toString(data).length()-1;
		
		
		return n;
	}
	public static void main(String[] args) {
		System.out.println(new WaysToDecode().num_ways(12));
		
	}
}
