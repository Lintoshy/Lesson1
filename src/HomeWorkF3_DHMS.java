
public class HomeWorkF3_DHMS {

	public static void main(String[] args) {				
//				long mS = System.currentTimeMillis();
//				System.out.println(mS);
//				long day = System.currentTimeMillis()/(1000*60*60*24);
//				System.out.println(day);
//				double dayEnd = System.currentTimeMillis()/(1000*60*60*24D);
//				int hour = (int) ((dayEnd - day)*24);
//				System.out.println(hour);
//				double hourEnd = (dayEnd - day)*24;
//				int minute = (int)((hourEnd - hour)*60);
//				System.out.println(minute);
//				double minuteEnd = (hourEnd - hour)*60; 
//				int second = (int) ((minuteEnd - minute)*60);
//				System.out.println(second);
//				
//				String colon = ":";
//				System.out.println(colon);
//				
//				System.out.println(day + colon + hour + colon + minute + colon + second);
//				System.out.println(day + ":" + hour + ":" + minute + ":" + second);
				
				
				long day = System.currentTimeMillis()/(1000*60*60*24);
				double dayRemainder = System.currentTimeMillis()/(1000*60*60*24D);
				
				int hour = (int) ((dayRemainder - day)*24);
				
				double hourRemainder = (dayRemainder - day)*24;
				int minute = (int)((hourRemainder - hour)*60);
				
				double minuteRemainder = (hourRemainder - hour)*60; 
				int second = (int) ((minuteRemainder - minute)*60);
				
				System.out.println(day + ":" + hour + ":" + minute + ":" + second);

	}

}
