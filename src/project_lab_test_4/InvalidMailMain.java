package project_lab_test_4;

import java.util.Scanner;

public class InvalidMailMain {
	public static void main(String[] args) {
        try {
            String emailId = getEmailIdFromUser();
            checkEmailIdFormat(emailId);
        } catch (InvalidMailIdException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getEmailIdFromUser() {
        // Prompt the user to enter their email id and return the input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email id: ");
        return scanner.nextLine();
    }

    private static void checkEmailIdFormat(String emailId) throws InvalidMailIdException {
        if (!emailId.contains("@") || !emailId.contains(".")) {
            throw new InvalidMailIdException("Invalid email id format");
        }
        
    }
   
}
