import java.util.*;

abstract class Train {
    private String trainName;
    private int trainNumber;
    private String line;

    public String getTrainName() {
        return this.trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getTrainNo() {
        return this.trainNumber;
    }

    public void setTrainNo(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getLine() {
        return this.line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    abstract public void display();

    abstract void addSchedule(Schedule schedule);
}

class MaintenanceTrain extends Train {
    void addSchedule(Schedule schedule) {
        System.out.println("Maintenance Train does not have Schedule.");
    }

    public void display() {
        System.out.println("Name: " + this.getTrainName());
        System.out.println("Train No: " + this.getTrainNo());
        System.out.println("Train Line: " + this.getLine());
    }
}

class LocalTrain extends Train {
    public Schedule[] schedules = new Schedule[3];

    void addSchedule(Schedule schedule) {
        if (checkNumSchedules() == schedules.length) {
            System.out.println("Schedule of Train is full.");
            return;
        }
        schedules[checkNumSchedules()] = schedule;
        System.out.println("Schedule added successfully.");
    }

    public int checkNumSchedules() {
        int length = 0;
        for (Schedule schedule : this.schedules) {
            if (schedule != null) {
                length += 1;
            }
        }
        return length;
    }

    public void display() {
        System.out.println("Name: " + this.getTrainName());
        System.out.println("Train No: " + this.getTrainNo());
        System.out.println("Train Line: " + this.getLine());
        System.out.println("Schedule: ");
        for (int i = 0; i < checkNumSchedules(); i++) {
            schedules[i].displaySchedule();
            System.out.println("");
        }
    }
}

class Schedule {
    private String stationName;
    private String arrivalTime;
    private String departureTime;

    Schedule(String stationName, String arrivalTime, String departureTime) {
        this.stationName = stationName;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public void displaySchedule() {
        System.out.println(" Station: " + stationName);
        System.out.println(" Arrival Time: " + arrivalTime);
        System.out.println(" Departure Time: " + departureTime);
    }

}

class Station {
    private String stationName;
    private String line;
    Train[] trains = new Train[3];

    public void setName(String stationName) {
        this.stationName = stationName;
    }

    public String getName() {
        return this.stationName;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getLine() {
        return this.line;
    }

    public void add(Train train) {
        if (this.checkNumTrains() == this.trains.length) {
            System.out.println("Trains are full for this station.");
            return;
        }
        trains[checkNumTrains()] = train;
        System.out.println("Train added successfully.");
    }

    public void delete(int choice) {
        if (choice + 1 == checkNumTrains()) {
            trains[trains.length - 1] = null;
            System.out.println("Deleted Train " + (choice + 1));
            return;
        }
        trains[choice] = null;
        for (int i = choice; i < checkNumTrains(); i++) {
            trains[i] = trains[i + 1];
        }
        trains[checkNumTrains() - 1] = null;
    }

    public int checkNumTrains() {
        int length = 0;
        for (Train train : trains) {
            if (train != null) {
                length += 1;
            }
        }
        return length;
    }

    public void display() {
        for (int i = 0; i < checkNumTrains(); i++) {
            System.out.println("[ " + (i + 1) + " ]");
            trains[i].display();
            System.out.println();
        }
    }
}

class Main {
    public static Station[] stations = new Station[3];
    static Scanner scan = new Scanner(System.in);

    public static int getStationChoice() {
        int choice;
        while (true) {
            for (int i = 0; i < stations.length; i++) {
                System.out.println((i + 1) + ". " + stations[i].getName());
            }
            choice = scan.nextInt();
            if (choice > 0 && choice <= stations.length) {
                break;
            }
        }
        return choice - 1;
    }

    public static int getTrainChoice(Station station) {
        int choice;
        while (true) {
            for (int i = 0; i < station.checkNumTrains(); i++) {
                System.out.println((i + 1) + ". " + station.trains[i].getTrainName());
            }
            choice = scan.nextInt();
            if (choice > 0 && choice <= station.checkNumTrains()) {
                break;
            }
        }
        return choice - 1;
    }

    public static Schedule createSchedule() {
        String stationName;
        String arrivalTime;
        String departureTime;
        Schedule schedule;
        System.out.println("Enter Station Name");
        stationName = scan.nextLine();
        stationName = scan.nextLine();
        System.out.println("Enter Arrival Time");
        arrivalTime = scan.next();
        System.out.println("Enter Departure Time");
        departureTime = scan.next();
        schedule = new Schedule(stationName, arrivalTime, departureTime);
        return schedule;
    }

    public static Train createTrain() {
        int choice;
        Train train;
        System.out.println("Enter Train type: '1' for Local and '2' for Maintenance");
        choice = scan.nextInt();
        if (choice > 2 || choice < 1) {
            System.out.println("Invalid Input");
            return null;
        }
        if (choice == 1) {
            train = new LocalTrain();
        } else {
            train = new MaintenanceTrain();
        }
        System.out.println("Enter Train Name ");
        train.setTrainName(scan.nextLine());
        train.setTrainName(scan.nextLine());
        System.out.println("Enter Train Number:");
        train.setTrainNo(scan.nextInt());
        System.out.println("Enter Train Line ");
        train.setLine(scan.nextLine());
        train.setLine(scan.nextLine());
        return train;
    }

    public static void main(String[] args) {
        String stringInput;
        int choice;
        int choice_1;
        int choice_2;
        for (int i = 0; i < stations.length; i++) {
            stations[i] = new Station();
            System.out.println("Input data for Station " + (i + 1));
            System.out.println("Enter Station Name");
            stringInput = scan.nextLine();
            stations[i].setName(stringInput);
            System.out.println("Enter Line Number");
            stringInput = scan.nextLine();
            stations[i].setLine(stringInput);
        }
        while (true) {
            System.out.println("Choose from the following");
            System.out.println("1. Create Train");
            System.out.println("2. Add Schedule to train");
            System.out.println("3. Delete Train from Station");
            System.out.println("4. Display Station Details");
            System.out.println("5. Exit");
            System.out.println("**************************");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    choice_1 = getStationChoice();
                    stations[choice_1].add(createTrain());
                    System.out.println("**************************");
                    break;
                case 2:
                    choice_1 = getStationChoice();
                    choice_2 = getTrainChoice(stations[choice_1]);
                    stations[choice_1].trains[choice_2].addSchedule(createSchedule());
                    System.out.println("**************************");
                    break;
                case 3:
                    choice_1 = getStationChoice();
                    if (stations[choice_1].checkNumTrains() == 0) {
                        System.out.println("No Trains Added.");
                        System.out.println("**************************");
                        break;
                    }
                    choice_2 = getTrainChoice(stations[choice_1]);
                    stations[choice_1].delete(choice_2);
                    System.out.println("**************************");
                    break;
                case 4:
                    choice_1 = getStationChoice();
                    System.out.println("--- Details ---");
                    System.out.println("Station Name: " + stations[choice_1].getName());
                    System.out.println("Station Line: " + stations[choice_1].getLine());
                    System.out.println("Trains: \n");
                    stations[choice_1].display();
                    System.out.println("**************************");
                    break;

                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid Input.");
                    System.out.println("**************************");
            }
        }
    }
}

