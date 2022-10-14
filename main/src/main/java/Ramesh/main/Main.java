package Ramesh.main;


import java.util.Scanner;


public class Main {

	public static void main(String[] args)
	{

		control hr= new control();

		records record = new records();
		
			record.setId(1);
			record.setFirst_name("ram");
			record.setLast_name("maddisetty");
			record.setPhone(87998);
			record.setEmail("rameshmaddisetty@gmail.com");
			record.setRole(false);
			
		hr.add(record);

		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		int option = 0;

		do {
			menu();
			option = input.nextInt();

			switch (option) {
			case 1:
				System.out.print("What is the Student id Number ? ");

				int id = input.nextInt();

				System.out.print("first_name= ");

				String first_name = sc.nextLine();
				input.nextLine();
				System.out.print("last_name= ");
				String last_name = input.nextLine();
				
				System.out.print("Phone= ");

				int phone = input.nextInt();
				
				System.out.print("Email=  ");
				String email = sc.nextLine();

				System.out.print("Role type if Admin enter true else false= ");
				Boolean role = input.nextBoolean();
				record = new records(id,first_name, last_name,  phone,  email,  role);
			
				hr.add(record);
				System.out.println("account creasted successfully...");

				break;

			case 2:

				System.out.print("enter id ? ");
				int rId = input.nextInt();

				hr.delete(rId);

				break;

			case 3:

				System.out.print("Enter id number? ");

				int rIdNo = input.nextInt();
				hr.update(rIdNo, input);

				break;

			case 4:

				System.out.print(
					"What is the User id ? ");
				int bookId = input.nextInt();

				if (!hr.find(bookId)) {
					System.out.println(
						"User id does not exist\n");
				}

				break;

			case 5:
				hr.display();
				break;

			case 9:

				System.out.println(
					"\nThank you for using the program. Goodbye!\n");
				System.exit(0);

				break;

			default:

				// Print statement
				System.out.println("\nInvalid input\n");
				break;
			}
		}

		while (option != 9);
	}

	public static void menu()
	{

		System.out.println("MENU");
		System.out.println("1: Add User");
		System.out.println("2: Delete User");
		System.out.println("3: Update User");
		System.out.println("4: Search User");
		System.out.println("5: Display User");
		System.out.println("9: Exit program");
		System.out.print("Enter your selection : ");
	}
}
