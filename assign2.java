import java.util.Scanner;
public class assign2
{
	public static void main(String[] args)
	{
		
		//ask for five numbers
		System.out.println("Enter five whole numbers: ");
		

		double n1, n2, n3, n4, n5, sum, avrg;
		
		// This will allow user to input five numbers

		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		n3 = keyboard.nextInt();
		n4 = keyboard.nextInt();
		n5 = keyboard.nextInt();
		
		sum = n1 + n2 + n3 + n4 + n5;
		avrg = (n1 + n2 + n3 + n4 + n5)/5;

		System.out.println("The sum of those numbers is " + sum + " and the average is " + avrg);

}

}