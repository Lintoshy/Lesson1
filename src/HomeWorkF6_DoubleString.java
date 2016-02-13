
public class HomeWorkF6_DoubleString {

	public static void main(String[] args) {
		String s = "Education is the most powerful weapon which you can use to change the world.";
		String t = "An investment in knowledge pays the best interest."; 
		System.out.print(s.substring(s.indexOf("use"),s.indexOf("to")));
		System.out.print(t.substring(t.indexOf("knowledge"),t.indexOf("pays")));
		System.out.print(s.substring(s.indexOf("to")));

	}

}
