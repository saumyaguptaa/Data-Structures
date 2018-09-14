package strings;

import java.util.HashSet;

public class FirstRecurring {
	public static void main(String[] args) {
		String s = "abcdefghjskallpo";
		HashSet hs = new HashSet<>();
		int l;
		for(int i = 0; i<s.length(); i++) {
			l = hs.size();
			hs.add(s.charAt(i));
			if(hs.size()!=l+1) {
				System.out.println(s.charAt(i));
				System.exit(0);
			}
				
		}
		
	}
}
