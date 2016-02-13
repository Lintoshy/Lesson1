
public class F35Substring2 {

	public static void main(String[] args) {
		String mjQuote = "I've failed over and over and over again in my life and that is why I succeed!";
		//String ch = "again";
		//mjQuote.indexOf(ch); //begin index
		//System.out.println (mjQuote.indexOf(ch));
		
		//String cc = "in my";
		//mjQuote.indexOf(cc); //end index
		//System.out.println (mjQuote.indexOf(cc));
		
		//System.out.println (mjQuote.substring (mjQuote.indexOf(ch),mjQuote.indexOf(cc))); //not one string
		System.out.println (mjQuote.substring (mjQuote.indexOf("again"),mjQuote.indexOf("in my"))); //one string
		
	}

}
