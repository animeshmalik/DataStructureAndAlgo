package org.algo.StringArray;

public class BasicStringArray {

	public static void main(String[] args) {
		String s="animesh";
		System.out.println("reverse of "+s+" is "+String.valueOf(reverseString(s.toCharArray())));
		
		String s1="an!me$h";
		System.out.println("reverse of "+s1+" is "+String.valueOf(reverseWhithoutMovingSpecialChar(s1.toCharArray())));
	}

	// reverse a string
	public static char[] reverseString(char str[]) {
		
		int n=str.length;
		char temp;
		for(int i=0;i<n/2;i++) {
			temp=str[i];
			str[i]=str[n-i-1];
			str[n-i-1]=temp;
		}
		
		return str;
	}
	// reverse array without moving the special char
	public static char[] reverseWhithoutMovingSpecialChar(char str[]) 
    { 
        // Initialize left and right pointers 
        int r = str.length - 1, l = 0; 
  
        // Traverse string from both ends until 
        // 'l' and 'r' 
        while (l < r) 
        { 
            // Ignore special characters 
            if (!Character.isAlphabetic(str[l])) 
                l++; 
            else if(!Character.isAlphabetic(str[r])) 
                r--; 
  
            // Both str[l] and str[r] are not spacial 
            else 
            { 
                char tmp = str[l]; 
                str[l] = str[r]; 
                str[r] = tmp; 
                l++; 
                r--; 
            } 
        } 
        
        return  str;
    } 
	
}
