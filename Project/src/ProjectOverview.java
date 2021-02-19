import java.util.Scanner;
public class ProjectOverview {

	public static void main( String[] args) {

		// In this section we capture the details that are used to create a new project
		// object.
		Scanner keyboard = new Scanner(System.in);
		//Here we ask the user to enter the number of the project
		int Number = 0;
		System.out.println("Enter the number of the project: ");
		Number = keyboard.nextInt();
		keyboard.nextLine();

		//Here we ask the user to enter the name of the project
		System.out.println("Enter the name of the project: ");
		String Name = keyboard.nextLine();

		//Here we ask the user what type of building is being designed
		System.out.println("What type of building is being designed: ");
		String building = keyboard.nextLine();

		//Here the user must enter the address of the project
		System.out.println("Enter the physical address for the project: ");
		String address = keyboard.nextLine();

		//Here the user must enter the ERF number
		int ErfNumber = 0;
		System.out.println("Enter the Erf Number: ");
		ErfNumber = keyboard.nextInt();
		keyboard.nextLine();

		// Here the user must enter the total fee that is being charged
		// for the project
		Double TotalFee = 0.0;
		System.out.println("Enter the total fee being charged for the project: ");
		TotalFee = keyboard.nextDouble();
		keyboard.nextLine();

		//In this section we enter the total amount of the fee paid to date
		Double TotalAmount = 0.0;
		System.out.println("Enter the total amount paid to date: ");
		TotalAmount = keyboard.nextDouble();
		keyboard.nextLine();

		//In this section we enter the due date of the project
		System.out.println("Enter the due date of the project: ");
		String duedate = keyboard.nextLine();

		//User Menu

		System.out.println("Please make a selection from the menu:" + "\n1. Change the due date of the project:"
				+ "\n2. Change the total number of the fee paid:" + "\n3. Update contractors contact details:"
				+ "\n4. Project finalised: " + "\n5. Back to menu: " + "\n6. exit: ");

		String userChoice = keyboard.nextLine();

		if (userChoice.equals("1")) {

			//Change due date of the project

			System.out.println("Enter the due date of the project: ");
			String deadline = keyboard.nextLine();
		}

		else if (userChoice.equals("2")) {

			//Here we change the total amount of the fee paid to date.
			Double newTotalFee = 0.0;
			System.out.println("Enter new fee paid by the customer:");
			newTotalFee = keyboard.nextDouble();
			keyboard.nextLine();
		}

		else if (userChoice.equals("3")) {

			//Here we Update the contractor's contact details

			System.out.println("Enter the name of the contractor");
			String contractorName = keyboard.nextLine();

			System.out.println("Enter the surname of the contractor:");
			String contractorSurname = keyboard.nextLine();

			int newPhoneNumber = 0;
			System.out.println("Enter contractor's contact details: ");
			newPhoneNumber = keyboard.nextInt();
			keyboard.nextLine();

			System.out.println("Enter contrator email address:");
			String contractorEmailAddress = keyboard.nextLine();

			System.out.println("Enter contractor address:");
			String contractorPhysicalAddress = keyboard.nextLine();

		}

		else if (userChoice.equals("4")) {

			//Here we ask the user if the project is finalised or not

			System.out.println("Is the Project state finalised or not Yes/No: ");
			String projectFinalised = keyboard.nextLine();
			
		}	
			
		else if (userChoice.equals("5")) {
			
			System.out.println("Please make a selection from the menu:" + "\n1. Change the due date of the project:"
					+ "\n2. Change the total number of the fee paid:" + "\n3. Update contractors contact details:"
					+ "\n4. Project finalised: " + "\n5. Back to menu: " + "\n6. exit: ");
		}
		
		else if (userChoice.equals("6")) {
			System.exit(0);
		}

		   
	}
}
