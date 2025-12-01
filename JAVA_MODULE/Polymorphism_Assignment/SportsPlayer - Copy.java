package PolymorephismDemo;

public class SportsPlayer {
	String playerName;
    String sport;
    String country;
    double salary;
    
    String getPlayerName() {
		return playerName;
	}

	 void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	  String getCountry() {
		return country;
	}

	 void setCountry(String country) {
		this.country = country;
	}

	public double getSalary() {
		return salary;
	}

	 void setSalary(double salary) {
		this.salary = salary;
	}

	SportsPlayer() // default constructor
    {
        System.out.println("SportsPlayer Default Constructor");
        playerName = "Virat Kohli";
        sport = "Cricket";
        country = "India";
        salary = 70000000;
    }

    SportsPlayer(String playerName, String sport, String country, double salary) // parameterized
    {
        System.out.println("SportsPlayer Parameterized Constructor");
        this.playerName = playerName;
        this.sport = sport;
        this.country = country;
        this.salary = salary;
    }

    void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Sport: " + sport);
        System.out.println("Country: " + country);
        System.out.println("Salary: ₹" + salary);
    }
    void play() {
        System.out.println(playerName + " is playing the sport.");
    }

}

// ---------- Subclass 1: Cricket Player ----------
class CricketPlayer extends SportsPlayer {
    String role; 
    
     String getRole() {
		return role;
	}
	 void setRole(String role) {
		this.role = role;
	}
	CricketPlayer(){
    	role="Batsman";
    }
    CricketPlayer(String playerName, String country, double salary, String role) {
        super(playerName, "Cricket", country, salary);
        this.role = role;
    }

    void display() {
        super.display();
        System.out.println("Cricket Role: " + role);
    }
    void play() {
        System.out.println("🏏 " + playerName + " is playing cricket as a " + role + ".");
    }
}

// ---------- Subclass 2: Football Player ----------
class FootballPlayer extends SportsPlayer {
    String position;
    
    FootballPlayer(){
    	position = "Forward";
    }

    FootballPlayer(String playerName, String country, double salary, String position) {
        super(playerName, "Football", country, salary);
        this.position = position;
    }

    void display() {
        super.display();
        System.out.println("Position: " + position);
    }
    void play() {
        System.out.println("⚽ " + playerName + " is playing football as a " + position + ".");
    }

}

// ---------- Subclass 3: Tennis Player ----------
class TennisPlayer extends SportsPlayer {
    String handType; 
    
    TennisPlayer(){
    	handType ="Right-handed";
    }
    
     String getHandType() {
		return handType;
	}

     void setHandType(String handType) {
		this.handType = handType;
	}
     
     TennisPlayer(String playerName, String country, double salary, String handType) {
        super(playerName, "Tennis", country, salary);
        this.handType = handType;
    }

    void display() {
        super.display();
        System.out.println("Hand Type: " + handType);
    }
    void play() {
        System.out.println("🎾 " + playerName + " is playing tennis (" + handType + ").");
    }

}

// ---------- Test Class ----------
class TestSportsPlayers {
    public static void main(String[] args) {

        SportsPlayer p;

        System.out.println("--- Cricket Player ---");
        p = new CricketPlayer("Virat Kohli", "India", 70000000, "Batsman");
        p.display();
        p.play();

        System.out.println("\n--- Football Player ---");
        p = new FootballPlayer("Lionel Messi", "Argentina", 120000000, "Forward");
        p.display();
        p.play();

        System.out.println("\n--- Tennis Player ---");
        p = new TennisPlayer("Roger Federer", "Switzerland", 90000000, "Right-handed");
        p.display();
        p.play();
    }
}
