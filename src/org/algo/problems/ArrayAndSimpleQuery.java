package org.algo.problems;

public class ArrayAndSimpleQuery {

	public static void main(String[] args) {
		int[] numbers= {1 ,2, 3, 4, 5, 6, 7, 8};
		removeAndAddFront(numbers, 2, 4);
	}
	
	public static void removeAndAddFront(int[] numbers,int i,int j){
        System.out.println("--------------");
        for(int q=0;q<numbers.length;q++){
            System.out.print(" "+numbers[q]);
        }
        int[] delectedArr=new int[j-i+1];
        int di=0;
        System.out.println();
       for(int x=j-1;x>=i-1;x--){
           delectedArr[di++]=numbers[x];
           for(int y=x-1;y>=0;y--){
               numbers[y+1]=numbers[y];
           }
         
       }
      
        System.out.println("i:"+i+" j:"+j);
        for(int q=0;q<numbers.length;q++){
            System.out.print(" "+numbers[q]);
        }
        System.out.println();
        System.out.println("--------------");
    }
}
