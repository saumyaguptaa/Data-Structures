package strings;

public class SwapFirstLast {
	public static void main(String[] args) {
		String s = "The grass is green";
		String n = "";
		char f, l;
		int j;
		String w = "";
	
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') 
				w= w+s.charAt(i);
				else {
					f = w.charAt(0);
					l = w.charAt(w.length()-1);
					
					for(j=0; j<w.length();j++) {
						if(j==0)
							n = n+l;
						else if(j == w.length()-1)
							n = n+f;
						else
							n = n+w.charAt(j);
					}
					n = n + " ";
					w = "";
				}
		}
		f = w.charAt(0);
		l = w.charAt(w.length()-1);
		
		for(j=0; j<w.length();j++) {
			if(j==0)
				n = n+l;
			else if(j == w.length()-1)
				n = n+f;
			else
				n = n+w.charAt(j);
		}
	
		System.out.println(n);
		
		
	}
}

/*	Other ways-
 * 	Split the string into a string array using st[] = s.split(" ") and then start working
 * 	convert the enitre thing into a chararray using c[] = s.toCharArray() and then perform simple swapping
 * */
