package Ramesh.main;


import java.util.LinkedList;
import java.util.Scanner;

public class control
{
		LinkedList<records> list;
		public control()
		{
			list = new LinkedList<records>();
		}

		public void add(records record)
		{
			if (!find(record.getId())) {
				list.add(record);
			}
			else {


				System.out.println(
					"Record already exists in the Record list");
			}
		}

		public boolean find(int idNimber)
		{


			for (records l : list) 
			{
				if (l.getId() == idNimber) 
				{
					System.out.println(l);
					return true;
				}
			}
			return false;
		}
		public void delete(int recIdNumber)
		{
			records recordDel = null;
			for (records ll : list) 
			{
				if (ll.getId() == recIdNumber) 
				{
					recordDel = ll;
				}
			}
			if (recordDel == null)
			{
				System.out.println("Invalid record Id");
			}
			else {

				list.remove(recordDel);
				System.out.println("Successfully removed record from the list");
			}
		}


		public records findRecord(int idNumber)
		{
			for (records l : list)
			{
				if (l.getId() == idNumber) 
				{
					return l;
				}
			}
			return null;
		}

		public void update(int id, Scanner input)
		{
			if (find(id)) 
			{
				records rec = findRecord(id);
				System.out.print("What is the Student id Number ? ");

				int idNumber = input.nextInt();

				System.out.print("first_name= ");

				String first_name = input.nextLine();
				input.nextLine();
				System.out.print("last_name= ");
				String last_name = input.nextLine();
				
				System.out.print("Phone= ");

				int phone = input.nextInt();
				
				System.out.print("Email+  ");
				String email = input.nextLine();

				System.out.print("Role type if Admin enter true else false= ");
				Boolean role = input.nextBoolean();

				rec.setId(idNumber);
				rec.setFirst_name(first_name);
				rec.setLast_name(last_name);
				rec.setPhone(phone);
				rec.setEmail(email);
				rec.setRole(role);
				System.out.println("Record Updated Successfully");
			}
			else {
				System.out.println("Record Not Found in the Student list");
			}
		}

		public void display()
		{
			if (list.isEmpty()) 
			{
				System.out.println("The list has no records\n");
				System.out.print("code :fail,\n");
				System.out.print("error: true,\n");
				System.out.print("message: mail,\n");
			}
			for (records record : list) 
			{
				  System.out.print("code :success,\n");
				  System.out.print("error: false,\n");
				  System.out.print("message: Successful,\n");
				System.out.println(record.toString());
			}
		}
}
