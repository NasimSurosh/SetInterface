package hashSet;



import java.util.HashSet;
import java.util.Scanner;

class EmailList {
        HashSet<String> emailSet = new HashSet<>();
        public void addEmail(String email) {
            emailSet.add(email);
        }
        public void displayEmails() {
            System.out.println("Unique Email Addresses:");
            for (String email : emailSet) {
                System.out.println(email);
            }
        }
    }
    public class Assignment {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            EmailList emailList = new EmailList();
            System.out.println("Enter email addresses (type 'done' to finish):");
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                emailList.addEmail(input);
            }
            System.out.println("\nEmail List:");
            emailList.displayEmails();
            scanner.close();
        }
        
}
