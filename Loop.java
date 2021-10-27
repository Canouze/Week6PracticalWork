import javax.swing.JOptionPane;
public class Loop{
	public static void main(String[] args){
		//declare vars
		int i;
		int start;
		int stop;
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
		System.out.println("\n\n\n\n\n");
		//take in two numbers and print numbers between
		start=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number"));
		stop=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number"));
		if(start<stop){
			for(i=start; i<=stop; i=i+1){
				System.out.println(i);
			}
		}
		else if(start>stop){
			for(i=start; i>=stop; i=i-1){
				System.out.println(i);
			}
		}
		else{
			System.out.println("Those numbers are the same!");
		}
	}
}
