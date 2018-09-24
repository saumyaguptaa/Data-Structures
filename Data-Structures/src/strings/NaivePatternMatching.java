package strings;

public class NaivePatternMatching {
	
	public static void main(String[] args) {
		String s = "this is a tEst this is a really big TEST for testing";
		String pattern = "test";
		int offset = 0;
		boolean atLeastOnce = false;
		String[] words = s.split(" ");
		for(String i : words) {
			if(i.equalsIgnoreCase(pattern)) {
				System.out.println("Found at "+offset);
				if(atLeastOnce == false)
					atLeastOnce = true;
			}
				offset += i.length()+1;
			
		}	
		if(atLeastOnce==false)
			System.out.println("No occurence detected");
	}
}
