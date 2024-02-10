package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class LanguageTranslater {

	public static void main(String[] args) {
	     HashMap<String, String> translator = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);
	        int choice;
	        do {
	            System.out.println("Language Translator Menu:");
	            System.out.println("1. Add translation");
	            System.out.println("2. Look up translation");
	            System.out.println("3. Display translator");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter word in language 1: ");
	                    String word1 = scanner.nextLine();
	                    System.out.print("Enter translation in language 2: ");
	                    String word2 = scanner.nextLine();
	                    translator.put(word1, word2);
	                    System.out.println("Translation added to the translator.");
	                    break;
	                case 2:
	                    System.out.print("Enter word in language 1: ");
	                    String wordToTranslate = scanner.nextLine();
	                    String translatedWord =
	                            translator.get(wordToTranslate);
	                    if (translatedWord != null) {
	                        System.out.println("Translation for " +
	                                wordToTranslate + " in language 2: " + translatedWord);
	                    } else {
	                        System.out.println("Translation not found.");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Translator Contents:");
	                    for (String word : translator.keySet()) {
	                        System.out.println(word + " - Translation: " +
	                                translator.get(word));
	                    }
	                    break;
	                case 4:
	                    System.out.println("Exiting the program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 4);
	        scanner.close();

	}

}
