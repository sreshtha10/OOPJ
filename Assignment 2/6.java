import java.util.Scanner;
class Hotel{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int totalRooms = 0,freeRooms = 0,occupiedRooms=0;
        int room[][] = new int[10][];
        for(int i = 0;i<10;i++){
            System.out.println("Enter the number of rooms on the "+(i+1)+" floor");
            int n = s.nextInt();
            totalRooms += n;
            room[i] = new int[n];
            System.out.println("Enter 0 for vacant and 1 for filled");
            for(int j=0;j<n;j++) {
                room[i][j] = s.nextInt();
            }
        }

        for(int i = 0;i<10;i++){
            for(int j = 0;j<room[i].length;j++){
                if(room[i][j] == 1){
                    occupiedRooms += 1;
                }
                else{
                    freeRooms += 1;
                }
            }
        }
        System.out.println("Total rooms in the hotel: "+totalRooms);
        System.out.println("Vacant Rooms in the hotel: "+freeRooms);
        System.out.println("Occupied Rooms in the hotel: "+occupiedRooms);
    }
}
