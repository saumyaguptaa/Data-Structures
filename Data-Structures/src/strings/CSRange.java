package strings;

public class CSRange {
	public static void main(String[] args) {
		String in = "1,2,3-8,12,15-28,30";
		String s[] = in.split(",");
		String range[] =new String[2];
		int j;
		for(String i : s) {
			if(!i.contains("-"))
				System.out.print(i+" ");
			else {
				range = i.split("-");
			for(j = Integer.parseInt(range[0]); j<=Integer.parseInt(range[1]); j++)
				System.out.print(j+" ");
		}
		}
	
	}
}
