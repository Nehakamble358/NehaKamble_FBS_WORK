package PolymorephismDemo;

public class Artist {
	  String artistName;
	    String artType;
	    String country;
	    double earnings;

	    Artist() // default constructor
	    {
	        System.out.println("Artist Default Constructor");
	        artistName = "Raht fateh ali khan";
	        artType = "Singer";
	        country = "India";
	        earnings = 300000;
	    }

	    Artist(String artistName, String artType, String country, double earnings) // parameterized
	    {
	        System.out.println("Artist Parameterized Constructor");
	        this.artistName = artistName;
	        this.artType = artType;
	        this.country = country;
	        this.earnings = earnings;
	    }

	    void perform() {
	        System.out.println(artistName + " is performing art...");
	    }

	    void display() {
	        System.out.println("Artist Name: " + artistName);
	        System.out.println("Art Type: " + artType);
	        System.out.println("Country: " + country);
	        System.out.println("Earnings: ₹" + earnings);
	    }
	}

	// ---------- Subclass 1: Singer ----------
	class Singer extends Artist {
	    String genre;
	    
	    String getGenre() {
			return genre;
		}

		 void setGenre(String genre) {
			this.genre = genre;
		}

		Singer(){
	    	genre="pop";
	    }
	    	
	    Singer(String artistName, String country, double earnings, String genre) {
	        super(artistName, "Singing", country, earnings);
	        this.genre = genre;
	    }

	    void display() {
	        super.display();
	        System.out.println("Genre: " + genre);
	    }
	    void perform() {
	        System.out.println("🎤 " + artistName + " is singing a " + genre + " song...");
	    }

	}

	// ---------- Subclass 2: Dancer ----------
	class Dancer extends Artist {
	    String danceStyle;
	    
	   String getDanceStyle() {
			return danceStyle;
		}

		 void setDanceStyle(String danceStyle) {
			this.danceStyle = danceStyle;
		}

		Dancer(){
	    	danceStyle="Hip-Hop";
	    }
	    	
	    Dancer(String artistName, String country, double earnings, String danceStyle) {
	        super(artistName, "Dancing", country, earnings);
	        this.danceStyle = danceStyle;
	    }

	    void display() {
	        super.display();
	        System.out.println("Dance Style: " + danceStyle);
	    }
	    void perform() {
	        System.out.println("💃 " + artistName + " is performing " + danceStyle + " dance...");
	    }
	}

	// ---------- Subclass 3: Painter ----------
	class Painter extends Artist {
	    String paintingStyle;
	    
	     String getPaintingStyle() {
			return paintingStyle;
		}

		 void setPaintingStyle(String paintingStyle) {
			this.paintingStyle = paintingStyle;
		}

		Painter(){
	    	paintingStyle="Modern Art";
	    }
	    	
	    Painter(String artistName, String country, double earnings, String paintingStyle) {
	        super(artistName, "Painting", country, earnings);
	        this.paintingStyle = paintingStyle;
	    }

	    void display() {
	        super.display();
	        System.out.println("Painting Style: " + paintingStyle);
	    }
	    void perform() {
	        System.out.println("🎨 " + artistName + " is painting a beautiful " + paintingStyle + " artwork...");
	    
	    }
	}

	// ---------- Test Class ----------
	class TestArtists {
	    public static void main(String[] args) {
	        Artist a;

	        System.out.println("--- Singer ---");
	        a = new Singer("Arijit Singh", "India", 5000000, "Romantic");
	        a.display();
	        a.perform();

	        System.out.println("\n--- Dancer ---");
	        a = new Dancer("Madhuri Dixit", "India", 7000000, "Kathak");
	        a.display();
	        a.perform();

	        System.out.println("\n--- Painter ---");
	        a = new Painter("Leonardo da Vinci", "Italy", 9000000, "Renaissance");
	        a.display();
	        a.perform();
	    }
	}


