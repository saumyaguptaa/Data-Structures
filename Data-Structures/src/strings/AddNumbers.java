package strings;

public class AddNumbers {
	public static void main(String[] args) {
		String s = "11234k1 ", n="";
		int sum = 0;
		for(int i = 0; i < s.length(); ) {
			
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				do {
					n += s.charAt(i);
					if(i<s.length()-1)
						i++;
				}while((s.charAt(i)>=48 && s.charAt(i)<=57));	
			sum += Integer.parseInt(n);
			n = "";
			}
			else
					i++;
		}
		System.out.println(sum);
	}
}