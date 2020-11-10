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
