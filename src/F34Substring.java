
public class F34Substring {

	public static void main(String[] args) {
		String mjQuote = "I've failed over and over and over again in my life and that is why I succeed!";
		mjQuote.substring (5);
		System.out.println(mjQuote.substring (70)); //game
		System.out.println(mjQuote.substring (70,77)); //game
		System.out.println(mjQuote.substring (mjQuote.length ()-8, mjQuote.length ()-1)); 
		System.out.println (mjQuote.substring (mjQuote.length () - "succeed!".length ()-1, mjQuote.length ()-1));
	}

}
