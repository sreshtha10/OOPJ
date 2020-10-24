import java.util.Scanner;
class Multiplex{
	class Auditorium{
		int[] seats;
		String movie;
		int id = 1 ;
		Auditorium(int size,String movie){
			this.seats = new int[size];
			this.movie = movie;	
		}

		public boolean isBooked(int seatNo) {
			if(seats[seatNo-1] == 0) {
				return false;
			}
			else {
				return true;
			}
		}
		
		public void book(int n) {
			System.out.print("Your seat numbers are: ");
			for(int i=0;n!=0;i++) {
				if(seats[i] == 0) {
					seats[i] = 1;
					n -= 1;
					System.out.print((i+1)+" ");
				}
				else {
					continue;
				}
			}
			System.out.println("");
		}	
	}
	Auditorium audi1;
	Auditorium audi2;
	Auditorium audi3;
	Multiplex(int size1, int size2, int size3, String movie1,String movie2, String movie3){
		this.audi1 = new Auditorium(size1,movie1);
		this.audi2 = new Auditorium(size2,movie2);
		this.audi3 = new Auditorium(size3,movie3);
	}
}
class Main{
	public static void main(String args[]) {
		Multiplex mp = new Multiplex(40,50,40,"3 Idiots","MS Dhoni The Untold Story","Sholay");
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Movies: ");
		System.out.println("Audi 1: "+mp.audi1.movie);
		System.out.println("Audi 2: "+mp.audi2.movie);
		System.out.println("Audi 3: "+mp.audi3.movie);
		System.out.println("Choose from the following");
		System.out.println("1. Book a seat");
		System.out.println("2. Check availability");
		System.out.println("3. Exit");
		while(run) {
			int opt = sc.nextInt();
			switch (opt) {
			case 1: {
				System.out.println("Audi 1, Audi2 or Audi 3");
				int x= sc.nextInt();
				System.out.println("Enter the number of seats");
				int n = sc.nextInt();
				switch(x) {
				case 1: mp.audi1.book(n);
				break;
				case 2: mp.audi2.book(n);
				break;
				case 3: mp.audi3.book(n);
				break;
				default: System.out.println("Invalid Option");
					}
				System.out.println("**************");
				break;
				}
			case 2:{
				System.out.println("Audi 1, Audi2 or Audi 3");
				int x = sc.nextInt();
				System.out.println("Enter the seat number");
				int n = sc.nextInt();
				switch(x) {
				case 1:{
					if(mp.audi1.isBooked(n)) {
						System.out.println("Seat is booked");
					}
					else {
						System.out.println("Seat is available");
					}
				break;
				}
				case 2:{
					if(mp.audi2.isBooked(n)) {
						System.out.println("Seat is booked");
					}
					else {
						System.out.println("Seat is available");
					}
				break;
				}
				case 3:{
					if(mp.audi3.isBooked(n)) {
						System.out.println("Seat is booked");
					}
					else {
						System.out.println("Seat is available");
					}
				break;
				}
				default:
					System.out.println("Invalid option");
				}
				System.out.println("**************");
				break;
			}
			case 3: {
				run = false;
				System.out.println("Thank you");
				System.out.println("**************");
				break;
			}
			default:
				System.out.println("Invalid Option");
			}
		}
	}
}
