package strings;

public class NaivePatternMatchingII {
	public static void main(String[] args) {
		String s = "AABABSSGDVFTEYAABSG";
		String pattern = "AAB",w, m="";
		int l =pattern.length();
		for(int i = 0; i<s.length()-l-1;i ++) {
			w = s.substring(i, i+pattern.length());
			if(w.equals(pattern)) {
				m = m +"Found at "+i+"\n";
			}
		}
		if(m.length()<0)
			System.out.println("No occurence found");
		else
			System.out.println(m);
	}
}