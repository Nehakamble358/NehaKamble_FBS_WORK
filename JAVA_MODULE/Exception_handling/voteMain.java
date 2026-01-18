package Exception;

public class voteMain {
	
	public static void main (String[]arge) throws InvalidAgeException {
		Voter v= new Voter(33);
		
		try {
			v.validate();
		}catch(InvalidAgeException i) {
			System.out.println(i);
		}
	}

}
