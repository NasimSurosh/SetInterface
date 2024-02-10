package treeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class Dictionary {

	public static void main(String[] args) {
		
		TreeSet<String> dictionary = new TreeSet<>();
		Scanner scan = new Scanner(System.in);
		
		int choice ;
		do {
			System.out.println("Dictionary Menu: ");
			System.out.println("1. Add a word");
			System.out.println("2. Search for a word");
			System.out.println("3. Display dictionary");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter a word: ");
				String word = scan.nextLine();
				dictionary.add(word);
				System.out.println("Word added to dictionary.");
				break;
			case 2:
				System.out.println("Enter the word to search for: ");
				String searchWord = scan.nextLine();
				if (dictionary.contains(searchWord)) {
					System.out.println(searchWord + " is in the dictionary.");
				}
				else {
					System.out.println(searchWord + " is not in dictionary.");
				}
				break;
			case 3: 
				if(!dictionary.isEmpty());
				System.out.println("Dictionary (in alphabetical order): ");
				for (String dicWord : dictionary) {
					System.out.println(dicWord);
				}
			break;	
			case 4:
				System.out.println("Exicting the program.");
				break;
				default:
					System.out.println("Invalid choice. ");
			}
			
			
				
		}while (choice !=4);
		scan.close();

	}

}
