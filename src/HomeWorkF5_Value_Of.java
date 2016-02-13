
public class HomeWorkF5_Value_Of {

	public static void main(String[] args) {
		double value = 898989.3535;
		int Integer = (int) value;
		
		String fractional = String.valueOf(value);
		
		System.out.println(Integer);
		System.out.println(fractional.substring (fractional.indexOf(".")+1,fractional.length ()));

	}

}
