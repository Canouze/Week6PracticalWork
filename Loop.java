public class Loop{
	public static void main(String[] args){
		//declare vars
		int i;
		//print all numbers between 1 and 100
		for(i=1; i<=100; i=i+1){
			System.out.println(i);
		}
		System.out.println("\n\n\n\n\n");
		//print all numbers from 100 to 0
		for(i=100; i>=0; i=i-1){
			System.out.println(i);
		}
		System.out.println("\n\n\n\n\n");
			//print even numbers from negative to positive 10
			for(i=-10; i<=10; i=i+1){
				if(i%2==0){
					System.out.println(i);
				}
		}
	}
}
