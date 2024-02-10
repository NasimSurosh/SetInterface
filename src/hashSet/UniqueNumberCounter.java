package hashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumberCounter {

	public static void main(String[] args) {
	
		Set<Integer> uniqueNumber = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("Unique numbers counter Menu: ");
			System.out.println("1. Input Number: ");
			System.out.println("2. Count unique numbers: ");
			System.out.println("3. Display unique number count: ");
			System.out.println("4. Exit ");
			System.out.println("Enter your choice: ");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("Enter numbers (separeted by space): ");
				String input = scan.nextLine();
				String[] numberString = input.split("\\s+");
				for (String number1 : numberString) {
					int number = Integer.parseInt(number1);
					uniqueNumber.add(number);
				}
				System.out.println("Number passed.");
				break;
			case 2: 
				int uniqueNumberCount = uniqueNumber.size();
				System.out.println("unique number count: " + uniqueNumberCount);
				break;
			case 3:
				System.out.println("Exiting the program.");
				break;
				default:
					System.out.println("Invalid choice. ");
			}
		}while (choice !=3);
		scan.close();

	}

}
