import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a hour: ");
		int hour = in.nextInt();
		System.out.println("Enter the minutes: ");
		int min = in.nextInt();

		String timeformat = timeString(hour,min);
		System.out.println("\nThe time is: "+timeformat);
	}
	public static String timeString(int hour, int minute){
		String ampm;
		if(hour < 12){
			ampm = "AM";
			if(hour == 0){
				hour = 12;
			}
		}else{
			ampm = "PM";
			hour = hour -12;
		}
		return String.format("%02d:%02d %s",hour,minute,ampm);
	}
}
