package hashSet;

import java.util.HashSet;
import java.util.Scanner;

class Participant {
	String name;

	public Participant(String name) {
		this.name = name;
	}
}

class EventRegistration {
	HashSet<Participant> partiList = new HashSet<>();
	
	public void registerParticipant(String name) {
		Participant participant = new Participant(name);
		partiList.add(participant);
	}
	public void displayParticipant() {
		System.out.println("Register participant: ");
		for (Participant part : partiList) {
			System.out.println(part.name);
		}
	}
}

public class ParticipantList {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		EventRegistration registration = new EventRegistration();
		
		System.out.println("Enter participant or 'end' for for stop registration ");
		
		while (true) {
			String name = scan.nextLine();
			if (name.equalsIgnoreCase("end")) {
				break;
			}
			registration.registerParticipant(name);
		}
		System.out.println("\nRegistered Participants: ");
		registration.displayParticipant();
		scan.close();
	}
}