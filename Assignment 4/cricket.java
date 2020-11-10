import java.util.Scanner;

abstract class Player{
	String playerName;
	int jerseyNumber;
	String teamName;
	abstract public String getPlayerName();
	abstract public void setPlayerName(String playerName);
	abstract public int getJerseyNumber();
	abstract public void setJerseyNumber(int jerseyNumber);
	abstract public String getTeamName();
	abstract public void setTeamName(String teamName);
}

class T20Player extends Player{
	int thirties;
	float strikeRate;
	public String getPlayerName() {
		return this.playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
		return;
	}
	public int getJerseyNumber() {
		return this.jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getTeamName() {
		return this.teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
		return;
	}
	public void setThirties(int thirties) {
		this.thirties = thirties;
		return;
	}
	public int getThirties() {
		return this.thirties;
	}
	public void setStrikeRate(float strikeRate) {
		this.strikeRate = strikeRate;
		return;
	}
	public float getStrikeRate() {
		return this.strikeRate;
	}
	
}


class ODIPlayer extends Player{
	int fifties;
	int centuries;
	public String getPlayerName() {
		return this.playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
		return;
	}
	public int getJerseyNumber() {
		return this.jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getTeamName() {
		return this.teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
		return;
	}
	 public int getNumOfFifties() {
		 return this.fifties;
	 }
	public void setNumOfFifties(int fifties) {
		this.fifties = fifties;
	}
	public int getNumOfCenturies() {
		return this.centuries;
	}
	public void setNumOfCenturies(int centuries) {
		this.centuries = centuries;
	}
	
	
}




class Match{
	String team1;
	String team2;
	String winner;
	Match(String team1,String team2,String winner){
		this.team1 = team1;
		this.team2 = team2;
		this.winner = winner;
	}
	public void getResult() {
		System.out.println("Teams: "+team1+" and "+team2);
		System.out.println("Winner is "+winner);
		return;
	}
}


class Team{
	String teamName;
	String format;
	Match[] matches = new Match[30];
	T20Player playersT20[];
	ODIPlayer playersODI[];
	Team(String format) {
		this.format = format;
		if(format == "T20") {
			this.playersT20 = new T20Player[11];
			for(int i=0;i<11;i++) {
				playersT20[i] = new T20Player();
			}
		}
		else {
			this.playersODI = new ODIPlayer[11];
			for(int i=0;i<11;i++) {
				playersODI[i] = new ODIPlayer();
			}
		}
	}
	public String getFormat() {
		return this.format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getTeamName() {
		return this.teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
		return;
	}
	public void add() {
		Scanner sc = new Scanner(System.in);
		if(this.format == "T20") {
			T20Player p = new  T20Player();
			System.out.println("Enter player name");
			String name = sc.nextLine();
			System.out.println("Enter jersey number");
			int jerseyNumber = sc.nextInt();
			System.out.println("Enter number of thirties");
			int thirties = sc.nextInt();
			System.out.println("Enter player strike rate");
			float strikeRate = sc.nextFloat();
			p.setJerseyNumber(jerseyNumber);
			p.setPlayerName(name);
			p.setStrikeRate(strikeRate);
			p.setThirties(thirties);
			p.setTeamName(this.teamName);
			for(int i=0;i<11;i++) {
				if(this.playersT20[i].playerName == null) {
					playersT20[i] = p;
					return;
				}
			}
			System.out.println("Team is full");
		}
		else {
			ODIPlayer p = new ODIPlayer();
			System.out.println("Enter player name");
			String name = sc.nextLine();
			System.out.println("Enter jersey number");
			int jerseyNumber = sc.nextInt();
			System.out.println("Enter number of fifties");
			int fifties = sc.nextInt();
			System.out.println("Enter number of centuries");
			int centuries = sc.nextInt();
			p.setJerseyNumber(jerseyNumber);
			p.setNumOfCenturies(centuries);
			p.setNumOfFifties(fifties);
			p.setPlayerName(name);
			p.setTeamName(this.teamName);
			for(int i=0;i<11;i++) {
				if(this.playersODI[i].playerName == null) {
					playersODI[i] = p;
					return;
				}
			}
			System.out.println("Team is full");
		}
		sc.close();
	}
	
	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player's jersey number");
		int j = sc.nextInt();
		if(this.format=="T20") {
			for(int i=0;i<11;i++) {
				if(playersT20[i].getJerseyNumber() == j) {
					playersT20[i] = null;
					System.out.println("Player deleted");
					return;
				}
			}
			System.out.println("Player not found");
		}
		else {
			for(int i=0;i<11;i++) {
				if(playersODI[i].getJerseyNumber() == j) {
					playersODI[i] = null;
					System.out.println("Player deleted");
					return;
				}
			}
			System.out.println("Player not found");
			
		}
		sc.close();
		return;
		
	}
	public void display() {
		System.out.println("Team Name - "+this.teamName+" Format- "+this.format);
		if(this.format == "T20") {
			for(int i=0;playersT20[i].playerName != null && i < 11;i++) {
				System.out.println(playersT20[i].getJerseyNumber()+" "+playersT20[i].getPlayerName()+" Thirties: "+playersT20[i].getThirties()+" Strike Rate- "+playersT20[i].getStrikeRate());
			}
		}
		else {
			for(int i=0;playersODI[i].playerName != null && i < 11;i++) {
				System.out.println(playersODI[i].getJerseyNumber()+" "+playersODI[i].getPlayerName()+" Fifties: "+playersODI[i].getNumOfFifties()+" Centuries- "+playersODI[i].getNumOfCenturies());
			}
		}
		return;
	}
	
	public void addMatch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the opposition");
		String t2 = sc.nextLine();
		System.out.println("Enter the winner");
		String winner = sc.nextLine();
		Match m = new Match(this.teamName,t2,winner);
		for(int i=0;i<matches.length;i++) {
			if(matches[i].team1 == null) {
				matches[i] = m;
			}
		}
		sc.close();
	}
	
	
}


class Main{
	public static void main(String agrs[]){
		Scanner sc = new Scanner(System.in);
		Team teams[] = new Team[3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter the format of the"+(i+1)+" team");
			String format = sc.nextLine();
			teams[i] = new Team(format);
			System.out.println("Enter the team name");
			String teamName = sc.nextLine();
			teams[i].setTeamName(teamName);
		}
		System.out.println("Choose from the following");
		System.out.println("1. Create Player");
		System.out.println("2. Add Players");
		System.out.println("3. Delete Players");
		System.out.println("4. Display team details");
		System.out.println("5. Add a match");
		System.out.println("6. Display matches");
		System.out.println("7. exit");
		System.out.println("***************");
		
		while(true) {
			
			int opt = sc.nextInt();
			switch(opt) {
			case 1:{
				System.out.println("Enter the format");
				String format = sc.nextLine();
				if(format == "T20") {
					T20Player p = new T20Player();
					System.out.println("Enter player name");
					String name = sc.nextLine();
					p.setPlayerName(name);
					System.out.println("Enter the jersey number");
					int j = sc.nextInt();
					p.setJerseyNumber(j);
					System.out.println("Enter the number of thirties");
					int t = sc.nextInt();
					p.setThirties(t);
					System.out.println("Enter the strike rate");
					float sr = sc.nextFloat();
					p.setStrikeRate(sr);
					System.out.println("Player created");
				}
				else {
					ODIPlayer p = new ODIPlayer();
					System.out.println("Enter player name");
					String name = sc.nextLine();
					p.setPlayerName(name);
					System.out.println("Enter the jersey number");
					int j = sc.nextInt();
					p.setJerseyNumber(j);
					System.out.println("Enter the number of fifties");
					int t = sc.nextInt();
					p.setNumOfFifties(t);
					System.out.println("Enter the number of centuries");
					int c = sc.nextInt();
					p.setNumOfCenturies(c);
					System.out.println("Player created");
				}
				System.out.println("***************");
				break;
			}
			case 2:{
				System.out.println("Which team");
				int i = sc.nextInt();
				teams[i+1].add();
				System.out.println("***************");
				break;
			}
			case 3:{
				System.out.println("Which team");
				int i  = sc.nextInt();
				teams[i+1].delete();
				System.out.println("***************");
				break;
			}
			case 4:{
				System.out.println("Which team");
				int i = sc.nextInt();
				teams[i+1].display();
				System.out.println("***************");
				break;
			}
			case 5:{
				System.out.println("Which team");
				int i = sc.nextInt();
				teams[i+1].addMatch();
				System.out.println("***************");
				break;
			}
			case 6:{
				System.out.println("Which team");
				int i = sc.nextInt();
				for(int j=0;i<teams[i+1].matches.length && teams[i+1].matches[j].winner != null;j++) {
					teams[i+1].matches[j].getResult();
				}
				System.out.println("***************");
				break;
			}
			case 7:{
				System.out.println("***************");
				System.exit(1);
			}
			default:{
				System.out.println("Invalid Option");
				System.out.println("***************");
			}
			}
		}
	
		
	}
}
