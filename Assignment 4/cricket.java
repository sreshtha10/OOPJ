class Player{
	String playerName;
	int jerseyNumber;
	String teamName;
	Player(String playerName, int jerseyNumber, String teamName){
		this.jerseyNumber = jerseyNumber;
		this.teamName = teamName;
		this.playerName = playerName;
	}
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
}

class T20Player extends Player{
	int thirties;
	float strikeRate;
	public T20Player(String playerName,int jerseyNumber,String teamName) {
		super(playerName,jerseyNumber,teamName);
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
	ODIPlayer(String playerName,int jerseyNumber,String teamName){
		super(playerName,jerseyNumber,teamName);
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


abstract class team{
	
	
	abstract public void setFormat (int F);//set format of the team
	abstract public void add(Player p);//add player in the team, if player and team format is same
	abstract public void delete(Player p);// delete player from the team
	
	abstract public void Display();// display the name of the player in the team
	
	abstract public void addMatch(Match m);
}

class Main{
	public static void main(String agrs[]){
		// Main method
	}
}
