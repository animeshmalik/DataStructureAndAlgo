package org.algo.problems;

public class TowerOfHanoi {

	private String name;
	public static void move(int numberOfDisc, char fromARod, char toCRod, char interBRod) {
		if(numberOfDisc==1) {
			System.out.println("1 disc moving from :"+fromARod+" to :"+toCRod);
		}else {
			move(numberOfDisc-1, fromARod, interBRod, toCRod);
			System.out.println(numberOfDisc+ " disc moving from :"+fromARod+" to :"+toCRod);
			move(numberOfDisc-1, interBRod, toCRod, fromARod);
		}
		
	
	}
	
	public static void main(String[] args) {
		move(6, 'A', 'C', 'B');
		
		/*int a=3; int b=0; 
				switch(a) {
				   case 1:
				      b=a+2;
				   case 2:
				      b=a+3;
				   case 3:
				      b=a+4;
				   case 4:
				      b=a+5;
				   case 5:
				      b=a+6;
				   default:
				      b=a*2;
				}
				
				System.out.println(b);*/
				// Line A"
				
				
			
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TowerOfHanoi other = (TowerOfHanoi) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
