package org.misc;

public class IntToString {

	static int getlength(int x){
		int length=0;
	    while(x/10 != 0) {
	    	length++;
	    	
	    	x=x/10;
	    	if(x<10) {
	    		length++;
	    	}
	    }
	    return length;
	}
	static String convert(int x){
		if(x==0)
			return "0";
		int count=0;
		boolean isNegetive=x<0;
		if(isNegetive)
			x=-x;
		int l=getlength(x);		
		if(isNegetive) {
			l++;
			count++;
			
		}
	    char[] x_char = new char[l];	  
	    for(int i = x_char.length-1; i>=count; i--){
	        x_char[i] = (char)(x % 10 + 48);//ASCII VALUE;
	        x = x / 10;
	    }
	    if(isNegetive)
	    	x_char[0]='-';
	    return new String(x_char);
	}
	public static void main(String[] args) {
		String s=convert(-12008);
		System.out.println(s);
	}
}
