package misc;

import java.util.Scanner;

public class BinaryNum {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int n = new Scanner(System.in).nextInt();
	    int rem=0,s=0,t=0;
	    while(n>0)
	        {
	        rem=n%2;
	        n=n/2;
	        if(rem==1)
	         {   s++;
	           if(s>=t)
	            t=s;
	        }
	        else{
	            s=0;
	        }   
	    }
	    System.out.println(t);
	    
	}
}
