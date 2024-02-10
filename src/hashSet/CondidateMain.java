package hashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CondidateMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Set<Candidate> candidates = new HashSet<>();

		int choice;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Cast a vote");
			System.out.println("2. Count votes");
			System.out.println("3. Dispaly vote count ");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");

			choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
			case 1:
				castVote(candidates, scan);
				break;
			case 2:
				int count = countVotes(candidates);
				System.out.println("Total votes: " + count);
				break;
			case 3:
				displayVoteCount(candidates);
				break;
			case 4:
				System.out.println("Exiting the program. ");
				scan.close();
			default:
				System.out.println("Invalid option please inter a valid option.");
			}

		} while (choice != 4);

	}

	private static void castVote(Set<Candidate> candidates, Scanner scan) {
		System.out.println("Enter candidate name: ");
		String candidateName = scan.nextLine();

		Candidate candidate = findOrCreateCandidate(candidates, candidateName);
		candidate.incrementVoteCount();
		System.out.println("Vote casted for " + candidateName);

	}

	private static int countVotes(Set<Candidate> candidates) {
	
		int totalVotes = 0;
		for (Candidate candidate : candidates) {
			totalVotes = totalVotes + candidate.getVoteCount();
		}
		return totalVotes;
	}

	private static void displayVoteCount(Set<Candidate> candidates) {
		System.out.println("Vote count for each condidte: ");
		for (Candidate candidate : candidates) {
			System.out.println(candidate.getName() + " : " + candidate.getVoteCount() + " votes");
		}
	}

	private static Candidate findOrCreateCandidate(Set<Candidate> candidates, String candidateName) {
		for (Candidate candidate : candidates) {
			if(candidate.getName().equalsIgnoreCase(candidateName)) {
			return candidate;	
			}
			
		}
		Candidate newCandidate = new Candidate(candidateName);
		candidates.add(newCandidate);
		return newCandidate;
	}

}
