package functions;
import java.util.Scanner;
import java.time.LocalDate;

public class VoterEligibility {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Create Voter object with birth year
        Voter voter = new Voter(birthYear);

        // Check eligibility to vote
        if (voter.isEligibleToVote()) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}

class Voter {
    private int birthYear;

    // Constructor to initialize birth year
    public Voter(int birthYear) {
        this.birthYear = birthYear;
    }

    // Method to calculate age and check eligibility to vote
    public boolean isEligibleToVote() {
        // Get the current year
        int currentYear = LocalDate.now().getYear();
        
        // Calculate age
        int age = currentYear - birthYear;

        // Check eligibility (age >= 18)
        return age >= 18;
    }
}
//Write a program to get birth year from user, then calculate the age and check they are eligible for vote Or not using constructor