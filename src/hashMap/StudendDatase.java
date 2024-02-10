package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class StudendDatase {

	public static void main(String[] args) {
		
	     HashMap<String, Integer> studentDatabase = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);
	        int choice;
	        do {
	            System.out.println("Student Database Menu:");
	            System.out.println("1. Add student");
	            System.out.println("2. Retrieve student ID");
	            System.out.println("3. Display database");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter student name: ");
	                    String studentName = scanner.nextLine();
	                    System.out.print("Enter student ID: ");
	                    int studentID = scanner.nextInt();
	                    studentDatabase.put(studentName, studentID);
	                    System.out.println("Student added to the database.");
	                    break;
	                case 2:
	                    System.out.print("Enter student name: ");
	                    String nameToRetrieve = scanner.nextLine();
	                    Integer retrievedID =
	                            studentDatabase.get(nameToRetrieve);
	                    if (retrievedID != null) {
	                        System.out.println("Student ID for " +
	                                nameToRetrieve + ": " + retrievedID);
	                    } else {
	                        System.out.println("Student not found.");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Student Database:");
	                    for (String name : studentDatabase.keySet()) {
	                        System.out.println(name + " - ID: " +
	                                studentDatabase.get(name));
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
