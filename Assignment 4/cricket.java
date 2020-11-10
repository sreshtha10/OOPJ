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
	Match[] matches = new Match[3];
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
		if(this.format == "T20" && this.playersT20[10].playerName == null) {
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
				}
			}
		}
		else if(this.format == "ODI" && this.playersODI[10].playerName == null) {
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
				}
			}
		}
		else {
			System.out.println("Team is full");
		}
		sc.close();
	}
	
	
}
class Main{
	public static void main(String agrs[]){
		// Main method
	}
}
