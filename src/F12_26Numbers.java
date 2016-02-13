
public class F12_26Numbers {

	public static void main(String[] args) {
		int sum = 2;
		double cv = 3.1;
		sum += 10 * cv;
	    System.out.println (sum);
	    System.out.println ("*    *    *");
	    	    
	    int a = 6;
	    double b = 4.9;
	    double c = 8.3;
	    c -= 20 - a * b + c * a;
	    System.out.println (c);
	    System.out.println ("*    *    *");
	    
	    int gold = 5;
	    double silver = 2.07;
	    int bronze = 4;
	    bronze += gold * silver;
	    System.out.println (bronze);
	    System.out.println ("*    *    *");
	    
	    int sumInt = (int) ((34.9 - 23) * 24.7);
	    double sumDouble = ((34.9 - 23) * 24.7);
	    System.out.println (sumInt);
	    System.out.println (sumDouble);
	    System.out.println ("*    *    *");
	        
	    long numberLong = 123000000000L;
	    long summaLong = numberLong + 245;
	    int numberInt = (int) summaLong;
	    System.out.println (summaLong);
	    System.out.println (numberInt);
	    System.out.println ("*    *    *");
	    
	    int apple = 156;
	    int appleRemainder = apple % 78;
	    System.out.println (appleRemainder);
	    		
	}

}
