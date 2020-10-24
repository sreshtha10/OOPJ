import java.util.Scanner;

class Room{
	int capacity = 2;
	String rent = "$200";
	String type = "AC";
	String status = "VACANT";
	String checkin;
	String checkout;
	public void showStatus() {
		System.out.println("This room is" +this.status);
	}
}
class Hotel{
	Room[] rooms;
	public Hotel(int size) {
		this.rooms = new Room[size];
		for(int i=0;i<size;i++) {
			rooms[i] = new Room();
		}
		// creating half non-ac rooms and half ac rooms
		for(int i=(int)size/2;i<size;i++) {
			rooms[i].rent = "$150";
			rooms[i].type = "NON-AC";
		}
	}
	public void checkin(String date) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What type of room do you want? AC/NON-AC");
		String opt = sc.nextLine();
		if(opt.equals("AC") || opt.equals("ac")) {
			for(int i = 0;i<(int)rooms.length/2;i++) {
				if(rooms[i].status == "VACANT") {
					System.out.println("You can stay in room no "+(i+1));
					rooms[i].status = "OCCUPIED";
					rooms[i].checkin = date;
					System.out.println("Your rent for one night stay will be "+rooms[i].rent);
					return;
				}
			}	
		}
		else {
			for(int i=(int)rooms.length/2;i<rooms.length;i++) {
				if(rooms[i].status == "VACANT") {
					System.out.println("You can stay in room no"+(i+1));
					rooms[i].status = "OCCUPIED";
					rooms[i].checkin = date;;
					System.out.println("Your rent for one night stay will be"+rooms[i].rent);
					return;
				}
			}
		}
		sc.close();
		System.out.println("Sorry, all "+opt+" rooms are occupied");
	}
	public String checkRoomStatus(int roomNo) {
		return rooms[roomNo-1].status;
	}
	public void checkOut(int roomNo) {
		if(rooms[roomNo-1].status == "OCCUPIED") {
			rooms[roomNo-1].status = "VACANT";
			System.out.println("You're checked out. Thank you !");
			return;
		}
		else {
			System.out.println("You're already checked out.");
			return;
		}
	}
}
	
class Main{
	public static void main(String args[]) {
		Hotel myHotel = new Hotel(50); // creating a hotel with 50 rooms (25 AC 25 NON-AC)
		boolean run = true;
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one of the following");
		System.out.println("1. Checkin");
		System.out.println("2. Checkout");
		System.out.println("3. Check Room Status");
		System.out.println("4. Exit");
		while(run) {
			int opt = sc.nextInt();
			switch(opt) {
			case 1: {
				System.out.println("Enter the checkin date");
				sc.next();
				String date = sc.nextLine();
				myHotel.checkin(date);
				System.out.println("************");
				break;
			}
			case 2:{
				System.out.println("Enter your room number");
				int roomNo = sc.nextInt();
				myHotel.checkOut(roomNo);
				System.out.println("************");
				break;
			}
			case 3:{
				System.out.println("Enter the room number");
				int roomNo = sc.nextInt();
				System.out.println(myHotel.checkRoomStatus(roomNo));
				System.out.println("************");
				break;
			}
			case 4:{
				run = false;
				System.out.println("Thank You for staying.");
				System.out.println("************");
				break;
			}
			default:
				System.out.println("Invalid Option");
			}
		}
		sc.close();
	}
}
