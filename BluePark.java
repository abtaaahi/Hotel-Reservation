package HotelPack;
import java.util.Scanner;

public class BluePark {

	void Menu() {
		System.out.println("Choose your desired room:\n"
				+ "1. Basic (1000 BDT/day)\n"
				+ "2. Common Room (2500 BDT/day)\n"
				+ "3. Business (3000 BDT/day)\n"
				+ "4. Honeymoon Suite (10000 BDT/day)\n"
				+ "5. Luxurious (15000 BDT/day)");
	}
	
	void About() {
		System.out.println("Hotel Name: Blue Park\r\n"
				+ "Address: 30/A, Chawkbazar, Chattogram\r\n"
				+ "Mobile Number: 0123456789\r\n"
				+ "E-Mail: bluepark@gmail.com\r\n"
				+ "Website: BluePark.com");
	}
	
	void Exit() {
		System.out.println("Thanks for Visiting Us.\n\n");
	}
	
		public static void main(String[] args) {
			
			BluePark One=new BluePark();
			
			System.out.println("Welcome to Blue Park\n");
			System.out.println("Main Menu:\n1- Book a Hotel\n2- About Us"
					+ "\n3- Exit");
			Scanner s=new Scanner(System.in);
			Scanner s1=new Scanner(System.in);
			Scanner s2=new Scanner(System.in);
			Scanner s3=new Scanner(System.in);
			Scanner s4=new Scanner(System.in);
			int a=s.nextInt();
			int b,c,x;
			String d,e,f;
			if(a==1) {
				One.Menu();
				b=s.nextInt();
				if(b==1) {
					System.out.println("How many days will you stay:");
					c=s.nextInt();
					System.out.println("1.Single Bed\n2.Double Bed");
					x=s.nextInt();
					System.out.println("Enter your Name:");
					d=s1.nextLine();
					System.out.println("Enter your Address:");
					e=s2.nextLine();
					System.out.println("Enter your Mobile Number:");
					f=s3.nextLine();
					System.out.println("Room Booked Successfully.\n");
					System.out.println("Your Room Details:\n"
							+ "Room Type: Basic\n"
							+ "Days to stay: "+ c +"\n"
							+ "Bed: "+x+"\n"
							+ "Name: "+d+"\n"
							+ "Address: "+e+"\n"
							+ "Mobile Number: "+f+"\n"
							+ "Total Cost: "+ 1000*c*x+"\n");
				}
				if(b==2) {
					System.out.println("How many days will you stay:");
					c=s.nextInt();
					System.out.println("1.Single Bed\n2.Double Bed");
					x=s.nextInt();
					System.out.println("Enter your Name:");
					d=s1.nextLine();
					System.out.println("Enter your Address:");
					e=s2.nextLine();
					System.out.println("Enter your Mobile Number:");
					f=s3.nextLine();
					System.out.println("Room Booked Successfully.\n");
					System.out.println("Your Room Details:\n"
							+ "Room Type: Common Room\n"
							+ "Days to stay: "+ c +"\n"
							+ "Bed: "+x+"\n"
							+ "Name: "+d+"\n"
							+ "Address: "+e+"\n"
							+ "Mobile Number: "+f+"\n"
							+ "Total Cost: "+ 2500*c*x+"\n");
				}
				if(b==3) {
					System.out.println("How many days will you stay:");
					c=s.nextInt();
					System.out.println("1.Single Bed\n2.Double Bed");
					x=s.nextInt();
					System.out.println("Enter your Name:");
					d=s1.nextLine();
					System.out.println("Enter your Address:");
					e=s2.nextLine();
					System.out.println("Enter your Mobile Number:");
					f=s3.nextLine();
					System.out.println("Room Booked Successfully.\n");
					System.out.println("Your Room Details:\n"
							+ "Room Type: Business\n"
							+ "Days to stay: "+ c +"\n"
							+ "Bed: "+x+"\n"
							+ "Name: "+d+"\n"
							+ "Address: "+e+"\n"
							+ "Mobile Number: "+f+"\n"
							+ "Total Cost: "+ 3000*c*x+"\n");
				}
				if(b==4) {
					System.out.println("How many days will you stay:");
					c=s.nextInt();
					System.out.println("Enter your Name:");
					d=s1.nextLine();
					System.out.println("Enter your Address:");
					e=s2.nextLine();
					System.out.println("Enter your Mobile Number:");
					f=s3.nextLine();
					System.out.println("Room Booked Successfully.\n");
					System.out.println("Your Room Details:\n"
							+ "Room Type: Honeymoon Suite\n"
							+ "Days to stay: "+ c +"\n"
							+ "Name: "+d+"\n"
							+ "Address: "+e+"\n"
							+ "Mobile Number: "+f+"\n"
							+ "Total Cost: "+ 10000*c+"\n");
				}
				if(b==5) {
					System.out.println("How many days will you stay:");
					c=s.nextInt();
					System.out.println("1.Single Bed\n2.Double Bed");
					x=s.nextInt();
					System.out.println("Enter your Name:");
					d=s1.nextLine();
					System.out.println("Enter your Address:");
					e=s2.nextLine();
					System.out.println("Enter your Mobile Number:");
					f=s3.nextLine();
					System.out.println("Room Booked Successfully.\n");
					System.out.println("Your Room Details:\n"
							+ "Room Type: Luxurious\n"
							+ "Days to stay: "+ c +"\n"
							+ "Bed: "+x+"\n"
							+ "Name: "+d+"\n"
							+ "Address: "+e+"\n"
							+ "Mobile Number: "+f+"\n"
							+ "Total Cost: "+ 15000*c*x+"\n");
				}
			}
			if(a==2) {
				One.About();
			}
			if(a==3) {
				One.Exit();
			}
		}
}
