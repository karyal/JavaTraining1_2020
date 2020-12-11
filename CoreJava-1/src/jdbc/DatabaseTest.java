package jdbc;
import java.util.Scanner;

public class DatabaseTest {

	public static void main(String[] args) {
		MyDatabase mdb = new MyDatabase();
		//mdb.connectDb();
		//mdb.insert();
		//mdb.select();

		/*
		//Insert-2
		int sn = 101;
		String name = "Rajan";
		String address="USA";
		String email ="rajan@gamil.com";
		String phone ="987654545454";

		if(mdb.insert(sn, name, address, email, phone)) {
			System.out.println("Inserted!");
		}
		else {
			System.out.println("Error to insert!");
		}
		 */

		/*
		//Insert-3
		System.out.print("Enter ID : ");
		int sn = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter Name : ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("Enter Address : ");
		String address=new Scanner(System.in).nextLine();
		System.out.print("Enter Email : ");
		String email =new Scanner(System.in).nextLine();
		System.out.print("Enter Phone : ");
		String phone =new Scanner(System.in).nextLine();

		if(mdb.insert(sn, name, address, email, phone)) {
			System.out.println("Inserted!");
		}
		else {
			System.out.println("Error to insert!");
		}
		mdb.select();
		*/
		
		Contact contact=new Contact(1, "Krishna","NEP","krishna@1444", "98275975");
		mdb.insert(contact);
		
	}
}