import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Skriv två tal");
		Scanner scan = new Scanner(System.in);
		double nbr1 = scan.nextDouble();
		double nbr2 = scan.nextDouble();

		//Räknar ut summan av talen
		double sum = nbr1 + nbr2;
		
		//Räknar ut differensen mellan talen
		double diff = nbr1 - nbr2;
		
		//Räknar ut produkten av talen
		double prod = nbr1 * nbr2;
		
		//Räknar ut kvoten mellan talen
		double quot = nbr1/nbr2;
		
		System.out.println("Summan av talen är " + sum);
		System.out.println("Skillnaden mellan talen är " + diff);
		System.out.println("Produkten av talen är " + prod);
		System.out.println("Kvoten mellan talen är " + quot);
		scan.close();
	}
}
